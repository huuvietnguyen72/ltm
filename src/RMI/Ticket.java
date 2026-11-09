package RMI;

/**
 * RMI Object – Bài 9: QUẢN LÝ VÉ SỰ KIỆN
 * Mã câu hỏi (qCode): Uct8bABt
 *
 * [Mã câu hỏi (qCode): Uct8bABt]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để quản lý thông tin vé trong hệ thống bán vé sự kiện. Chương trình sẽ ngẫu nhiên tạo ra đối tượng Ticket với các giá trị ban đầu và cung cấp cho RMI client như sau: Giao diện từ xa: public interface ObjectService extends Remote { public Serializable requestObject(String studentCode, String qCode) throws RemoteException; public void submitObject(String studentCode, String qCode, Serializable object) throws RemoteException; } Lớp Ticket gồm các thuộc tính: id String, eventName String, saleDate String, ticketCode String. //Điều chỉnh
 *
 * - Trường dữ liệu: private static final long serialVersionUID = 20241133L;
 * - 02 hàm khởi dựng: public Ticket() public Ticket(id String, String eventName, String saleDate) Trong đó:
 * - Interface ObjectService và lớp Ticket được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa ObjectService được đăng ký với RegistryServer: RMIObjectService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với đối tượng vé được nhận từ RMI Server:
 * a. Triệu gọi phương thức requestObject để nhận đối tượng Ticket ngẫu nhiên từ server.
 * b. Tạo mã ticketCode cho vé dựa trên các quy tắc sau:
 * - Bắt đầu với hai chữ cái là: Chữ cái đầu tiên và cuối cùng của eventName, viết hoa.
 * - Thêm ngày và tháng từ saleDate (theo định dạng "MMdd")
 * - Kết thúc bằng hai chữ số là: Chữ số lớn nhất và nhỏ nhất không xuất hiện trong saleDate.
 *
 * Ví dụ: tên sự kiện là "Charity Concert", và ngày bán là "15/06/2024", mã ticketCode sẽ là "CT061593".
 *
 * c. Cập nhật giá trị ticketCode trong đối tượng Ticket.
 * d. Triệu gọi phương thức submitObject để gửi đối tượng Ticket đã được xử lý trở lại server.
 * e. Kết thúc chương trình client.
 */

import java.io.Serializable;
public class Ticket implements Serializable{
    private static final long serialVersionUID = 20241133L;
    private String id;
    private String eventName, saleDate, ticketCode;
    public Ticket(){}
    public Ticket(String id, String eventName, String saleDate) {
        this.id = id;
        this.eventName = eventName;
        this.saleDate = saleDate;
    }
    public String getEventName() {
        return eventName;
    }
    public String getSaleDate() {
        return saleDate;
    }
    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }
    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", eventName=" + eventName + ", saleDate=" + saleDate + ", ticketCode=" + ticketCode + '}';
    }
}
