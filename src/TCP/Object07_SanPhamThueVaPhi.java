package TCP;

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

import java.util.*; import java.io.*; import java.net.*;

public class Object07_SanPhamThueVaPhi {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("36.50.135.242", 2209);
        socket.setSoTimeout(5000);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        // ĐỔI qCode theo đề thực tế
        out.writeObject("B23DCCN139;qCode_moi");
        out.flush();
        Product p = (Product) in.readObject();
        double price = p.getPrice();
        int discount = p.getDiscount();
        double fee = (price >= 800) ? 15 : 0;
        double newPrice = price * (100 - discount) / 100 * 1.08 + fee;
        newPrice = Math.round(newPrice * 100) / 100.0;
        p.setPrice(newPrice);
        out.writeObject(p);
        out.flush();
        in.close(); out.close(); socket.close();
    }
}
