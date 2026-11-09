package TCP;

/**
 * Object Stream (cổng 2209) – Bài 1: Laptop
 * Mã câu hỏi (qCode): mM5m0V4s
 *
 * Một chương trình server cho phép kết nối qua giao thức TCP tại cổng 2209 (hỗ trợ thời gian giao tiếp tối đa cho mỗi yêu cầu là 5s). Yêu cầu là xây dựng một chương trình client tương tác với server sử dụng các luồng đối tượng (ObjectInputStream / ObjectOutputStream) thực hiện gửi/nhận đối tượng máy tính xách tay và thay đổi thông tin. Cụ thể:
 * a. Đối tượng trao đổi là thể hiện của lớp Laptop được mô tả như sau:
 * • Tên đầy đủ của lớp: TCP.Laptop
 * • Các thuộc tính: id int, code String, name String, quantity int
 * • Hàm khởi tạo đầy đủ các thuộc tính được liệt kê ở trên
 * • Trường dữ liệu: private static final long serialVersionUID = 20150711L;
 * b. Tương tác với server theo kịch bản dưới đây:
 * 1) Gửi đối tượng là một chuỗi gồm mã sinh viên và mã câu hỏi ở định dạng "studentCode;qCode". Ví dụ: "B15DCCN999;F2DA54F3"
 * 2) Nhận một đối tượng là thể hiện của lớp Laptop từ server với các thông tin đã được thiết lập
 * 3) Thay đổi thông tin theo các yêu cầu dưới đây và gán vào các thuộc tính tương ứng:
 * - Đảo vị trí từ đầu tiên và từ cuối cùng trong thuộc tính name. Ví dụ: Laptop Acer Predator Helios → Helios Acer Predator Laptop
 * - Đảo ngược các chữ số trong thuộc tính quantity. Ví dụ: 358 → 853
 * Gửi đối tượng đã được sửa đổi lên server.
 * 4) Đóng socket và kết thúc chương trình.
 */

/**
 * Object Stream (cổng 2209) – Bài 4: Sản phẩm Laptop v2
 * Mã câu hỏi (qCode): W7S23nSu
 *
 * Thông tin sản phẩm laptop vì một lý do nào đó đã bị sửa đổi thành không đúng, cụ thể:
 * a. Tên sản phẩm bị đổi ngược từ đầu tiên và từ cuối cùng. Ví dụ: "lenovo thinkpad T520" bị chuyển thành "T520 thinkpad lenovo"
 * b. Số lượng sản phẩm cũng bị đảo ngược các chữ số. Ví dụ: từ 358 thành 853
 * Một chương trình server cho phép kết nối qua giao thức TCP tại cổng 2209 (hỗ trợ thời gian giao tiếp tối đa cho mỗi yêu cầu là 5s). Yêu cầu là xây dựng một chương trình client tương tác với server sử dụng các luồng đối tượng (ObjectInputStream / ObjectOutputStream) để gửi/nhận và sửa các thông tin bị sai của sản phẩm. Chi tiết dưới đây:
 * a. Đối tượng trao đổi là thể hiện của lớp Laptop được mô tả như sau:
 * • Tên đầy đủ của lớp: TCP.Laptop
 * • Các thuộc tính: id int, code String, name String, quantity int
 * • Hàm khởi tạo đầy đủ các thuộc tính được liệt kê ở trên
 * • Trường dữ liệu: private static final long serialVersionUID = 20150711L;
 * b. Tương tác với server theo kịch bản:
 * 1) Gửi đối tượng là chuỗi chứa mã sinh viên và mã câu hỏi với định dạng "studentCode;qCode"
 * 2) Nhận một đối tượng là thể hiện của lớp TCP.Laptop từ server
 * 3) Sửa lại tên (đảo vị trí từ đầu và từ cuối) và số lượng (đảo ngược chữ số). Gửi đối tượng đã sửa lên server
 * 4) Đóng socket và kết thúc chương trình
 */

import java.io.Serializable;

public class Laptop implements Serializable {
    private static final long serialVersionUID = 20150711L;
    private int id;
    private String code, name;
    private int quantity;
    public Laptop(int id, String code, String name, int quantity) {
        this.id = id; this.code = code; this.name = name; this.quantity = quantity;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
