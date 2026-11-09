package RMI;

/**
 * RMI Object – Bài 1: SẢN PHẨM – 1
 * Mã câu hỏi (qCode): dx3nt4Ij
 *
 * [Mã câu hỏi (qCode): dx3nt4Ij]. Một chương trình (tạm gọi là RMI server) cung cấp giao diện cho phép triệu gọi từ xa với thông tin như sau: Giao diện từ xa public interface ObjectService extends Remote { public Serializable requestObject(String studentCode, String qAlias) throws RemoteException; public void submitObject(String studentCode, String qAlias, Serializable object) throws RemoteException; } Lớp Product gồm các thông tin: id String, code String, importPrice double, exportPrice double. Trường dữ liệu: private static final long serialVersionUID = 20151107L; 02 hàm khởi dựng public Product() public Product(String id, String code, String ImportPrice, String ExportPrice) Trong đó: -interface ObjectService và lớp Product được viết trong package RMI -Đối tượng cài đặt giao diện từ xa ObjectService được đăng ký với RegistryServer: RMIObjectService Yêu cầu: viết chương trình tại máy trạm (RMI client) thực hiện chuẩn hóa sản phẩm theo thứ tự:
 *
 * a. Triệu gọi phương thức requestObject để lấy về đối tượng sản phẩm cần chuẩn hóa.
 * b. Thực hiện chuẩn hóa đối tượng nhận được theo nguyên tắc:
 * - Chuyển mã sản phẩm thành in hoa.
 * - Cập nhật giá xuất (exportPrice) bằng giá nhập (importPrice) + 20%
 * c. Triệu gọi phương thức submitObject để gửi dữ liệu đã chuẩn hóa
 * d. Kết thúc chương trình client
 * *Note: Bài này lỗi kiểu dữ liệu: id phải là String, giá nhập và giá xuất phải là double thì mới chạy*
 *  *được code*
 */

import java.io.Serializable;
public class Product implements Serializable {
    private static final long serialVersionUID = 20151107L;
    private String id;
    private String code;
    private double importPrice;
    private double exportPrice; 
    public Product() {}
    public Product(String id, String code, double importPrice, double exportPrice) {
        this.id = id;
        this.code = code;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public double getImportPrice() {
        return importPrice;
    }
    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                '}';
    }
}
