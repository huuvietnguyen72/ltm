package RMI;

/**
 * RMI Object – Bài 3: BÀI TOÁN QUẢN LÝ THU VIỆN – 1
 * Mã câu hỏi (qCode): nCOdwcKJ
 *
 * [Mã câu hỏi (qCode): nCOdwcKJ]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để gán mã code cho sách trong một hệ thống quản lý thư viện. Chương trình sẽ ngẫu nhiên tạo ra đối tượng Book với các giá trị ban đầu và cung cấp cho RMI client như sau:  Trang 9
 *
 * Giao diện từ xa:
 *
 * public interface ObjectService extends Remote { public Serializable requestObject(String studentCode, String qCode) throws RemoteException; public void submitObject(String studentCode, String qCode, Serializable object) throws RemoteException; } Lớp Book gồm các thuộc tính: id String, title String, author String, yearPublished int, pageCount int, code String. Trường dữ liệu: private static final long serialVersionUID = 20241123L; 02 hàm khởi dựng: public Book() public Book(String id, String title, String author, int yearPublished, int pageCount) Trong đó: Interface ObjectService và lớp Book được viết trong package RMI. Đối tượng cài đặt giao diện từ xa ObjectService được đăng ký với RegistryServer: RMIObjectService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với đối tượng sách được nhận từ RMI Server:
 *
 * a. Triệu gọi phương thức requestObject để nhận đối tượng Book ngẫu nhiên từ server.
 * b. Tạo mã code cho sách dựa trên các thành phần sau:
 * - Lấy chữ cái đầu của họ và tên đầu của tác giả. Ví dụ, với tác giả "John Doe", hai chữ cái đầu sẽ là "JD".
 * - Lấy hai chữ số cuối cùng của năm xuất bản (yearPublished). Ví dụ, nếu yearPublished là 1985, sẽ lấy "85".
 * - Lấy tổng số chữ cái trong title của sách.
 * - Lấy số chữ số của pageCount (số trang) và nếu số chữ số < 3, thêm các số 0 ở đầu để đạt đủ ba chữ số. Kết hợp tất cả các thành phần trên để tạo ra mã code theo định dạng: "[Chữ cái đầu tên tác giả][Hai chữ số cuối của năm xuất bản][Tổng số chữ cái trong title][Số chữ số của pageCount]". Ví dụ, nếu tác giả là "Jane Austen", yearPublished là 1813, title là "Pride and Prejudice" với 18 ký tự, và pageCount là 345, thì mã code sẽ là: "JA1318345".
 * c. Cập nhật giá trị code trong đối tượng Book.
 * d. Triệu gọi phương thức submitObject để gửi đối tượng Book đã được xử lý trở lại server.
 * e. Kết thúc chương trình client. *Lưu ý:*
 * *1. Ví dụ tác giả là Nguyen Van nAM, kể cả chưa chuẩn hoá thì lấy vào xâu cũng phải tự viết* *hoa cho nó. Chỉ lấy ký tự đầu của họ (tức là tên đầu) và ký tự đầu của tên (tức là tên cuối)*
 * *2. Hàm khởi tạo thuộc tính id phải là String, không phải int*
 *
 * *3. Đọc log xử lý như sau: Dòng 1 là input, bắt đầu với id, kế đến là các thuộc tính, mỗi thuộc* *tính phân định với nhau bằng dấu chấm phẩy. Dòng thứ 2 là output đề cho. Dòng thứ 3 là* *output của mình làm*
 * *4. Đối với mỗi dòng 2 và 3, mỗi thuộc tính được ngăn cách nhau bởi một dấu gạch đứng*
 */

import java.io.Serializable;
public class Book implements Serializable {
    private static final long serialVersionUID = 20241123L;
    private String id, title, author;
    private int yearPublished, pageCount;
    private String code;
    public Book() {}
    public Book(String id, String title, String author, int yearPublished, int pageCount) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.pageCount = pageCount;
    }
    // Getters and Setters
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
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                ", pageCount=" + pageCount +
                ", code='" + code + '\'' +
                '}';
    }
}
