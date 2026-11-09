package TCP;

/**
 * Object Stream (cổng 2209) – Bài 5: Sản phẩm giảm giá
 * Mã câu hỏi (qCode): 151GNZvT
 *
 * Một chương trình server cho phép kết nối qua giao thức TCP tại cổng 2209 (hỗ trợ thời gian giao tiếp tối đa cho mỗi yêu cầu là 5 giây).
 * Yêu cầu là xây dựng một chương trình client tương tác với server sử dụng các luồng đối tượng (ObjectOutputStream/ObjectInputStream) theo kịch bản dưới đây:
 * Biết lớp TCP.Product gồm các thuộc tính (id int, name String, price double, discount int) và private static final long serialVersionUID = 20231107;
 * a. Gửi đối tượng là một chuỗi gồm mã sinh viên và mã câu hỏi với định dạng "studentCode;qCode". Ví dụ: "B15DCCN999;1E08CA31"
 * b. Nhận một đối tượng là thể hiện của lớp TCP.Product từ server.
 * c. Tính toán giá trị giảm giá theo price theo nguyên tắc: Giá trị giảm giá (discount) bằng tổng các chữ số trong phần nguyên của giá sản phẩm (price). Thực hiện gán giá trị cho thuộc tính discount và gửi đối tượng nhận được lên server.
 * d. Đóng kết nối và kết thúc chương trình.
 */

/**
 * Object Stream (cổng 2209) – Bài 7: Sản phẩm tính giá sau giảm, thuế và phí
 * Mã câu hỏi (qCode): cập nhật sau
 *
 * Một chương trình server cho phép kết nối qua giao thức TCP tại cổng 2209, sử dụng các luồng đối tượng (ObjectOutputStream/ObjectInputStream).
 * Biết lớp TCP.Product gồm các thuộc tính (id int, name String, price double, discount int) và private static final long serialVersionUID = 20231107;
 * a. Gửi một đối tượng String chứa mã sinh viên và mã câu hỏi theo định dạng studentCode;qCode bằng ObjectOutputStream. Ví dụ: B21DCCN001;5AD2B818.
 * b. Nhận từ server một đối tượng TCP.Product đã có sẵn id, name, price và discount. Ví dụ: id=2001; price=1000.00; discount=10.
 * c. Tính lại price theo công thức round2(price * (100 - discount) / 100 * 1.08 + fee), trong đó fee = 15 nếu giá gốc từ 800 trở lên, ngược lại fee = 0.
 * d. Gửi lại đối tượng TCP.Product đã cập nhật price, giữ nguyên id, name và discount. Ví dụ giá nộp lại: 987.00.
 * e. Đóng kết nối và kết thúc chương trình.
 */

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 20231107;
    private int id, discount;
    private double price;
    private String name;
    public Product(int id, double price, String name) {
        this.id = id; this.price = price; this.name = name;
    }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getDiscount() { return discount; }
    public void setDiscount(int discount) { this.discount = discount; }
}
