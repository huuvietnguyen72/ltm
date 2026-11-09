package RMI;

/**
 * RMI Object – Bài 4: BÀI TOÁN QUẢN LÝ THƯ VIỆN - 2
 * Mã câu hỏi (qCode): CoWosBho
 *
 * [Mã câu hỏi (qCode): CoWosBho]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý mã hóa dữ liệu tác phẩm trong hệ thống quản lý thư viện. Chương trình sẽ ngẫu nhiên tạo ra đối tượng BookX với các giá trị ban đầu và cung cấp cho RMI client như sau: Giao diện từ xa: public interface ObjectService extends Remote { public Serializable requestObject(String studentCode, String qCode) throws RemoteException; public void submitObject(String studentCode, String qCode, Serializable object) throws RemoteException; } Lớp BookX gồm các thuộc tính: id String, title String, author String, yearPublished int, genre String, code String. Trường dữ liệu: private static final long serialVersionUID = 20241124L; 02 hàm khởi dựng: public BookX() public BookX(String id, String title, String author, int yearPublished, String genre) Trong đó: Interface ObjectService và lớp BookX được viết trong package RMI. Đối tượng cài đặt giao diện từ xa ObjectService được đăng ký với RegistryServer: RMIObjectService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với đối tượng sách được nhận từ RMI Server:
 *
 * a. Triệu gọi phương thức requestObject để nhận đối tượng BookX ngẫu nhiên từ server.
 * b. Tạo mã code cho sách dựa trên các quy tắc mã hóa sau:
 * - Lấy chữ cái đầu tiên và cuối cùng trong tên tác giả (author).
 * - Lấy hai chữ số cuối cùng của yearPublished.
 *
 * - Số lượng chữ cái trong genre của sách.
 * - Độ dài của title chia lấy dư cho 10 (ví dụ: với tiêu đề dài 32 ký tự, giá trị này sẽ là 2). Kết hợp tất cả các thành phần trên để tạo ra mã code theo định dạng: [Chữ cái đầu và cuối tên tác giả][Hai chữ số cuối của năm xuất bản][Số chữ cái của genre][Độ dài title modulo 10]. Ví dụ, nếu tác giả là "Mark Twain", năm xuất bản là 1884, thể loại là "Fiction" với 7 ký tự, và tiêu đề có 24 ký tự, mã code sẽ là: "Mn8474".
 * c. Cập nhật giá trị code trong đối tượng BookX.
 * d. Triệu gọi phương thức submitObject để gửi đối tượng BookX đã được xử lý trở lại server.
 * e. Kết thúc chương trình client. //Sai đề *Chú ý: Lấy chữ cái cuối cùng của từ cuối cùng chứ không lấy chữ cái đầu của từ cuối cùng như đề* *đã mô tả. Cách đọc log xử lý cũng tương tự như Đề số 4, có điều thuộc tính thay đổi*
 */

import java.io.Serializable;
public class BookX implements Serializable {
    private static final long serialVersionUID = 20241124L;
    private String id, title, author;
    private int yearPublished;
    private String genre, code;
    public BookX() {}
    public BookX(String id, String title, String author, int yearPublished, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.genre = genre;
        this.code = "";
    }
    //get set cứ insert tung hết ra

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "BookX{" + "id=" + id + ", title=" + title + ", author=" + author + ", yearPublished=" + yearPublished + ", genre=" + genre + ", code=" + code + '}';
    }
    
    
}
