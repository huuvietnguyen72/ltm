package RMI;

/**
 * RMI Object – Bài 10: Phân tầng xử lý SLA ticket
 * Mã câu hỏi (qCode): OKVHS9qH
 *
 * Một chương trình RMI Server cung cấp giao diện từ xa ObjectService, được đăng ký với RegistryServer bằng tên RMIObjectService.
 * Tạo interface và lớp trong package RMI của project client, đúng tên, chữ ký phương thức, serialVersionUID, tên và kiểu của từng thuộc tính:
 *   ObjectService: Serializable requestObject(String studentCode, String qCode); void submitObject(String studentCode, String qCode, Serializable object)
 *   TicketSla (serialVersionUID = 20260517L): ticketId String, priority String (LOW, MEDIUM, HIGH, CRITICAL), openedHoursAgo int, breached boolean, action String;
 *   hàm khởi dựng TicketSla() và TicketSla(String ticketId, String priority, int openedHoursAgo); getter/setter cho tất cả thuộc tính.
 * a. Dùng mã sinh viên và mã câu hỏi làm tham số khi gọi RMI.
 * b. Triệu gọi requestObject(studentCode, qCode) để nhận đối tượng RMI.TicketSla. Ví dụ: priority=HIGH; openedHoursAgo=10.
 * c. Thiết lập breached = true khi vượt ngưỡng theo priority:
 *    CRITICAL: openedHoursAgo > 2; HIGH: > 8; MEDIUM: > 24; LOW: > 72.
 *    Thiết lập action: MONITOR nếu không vi phạm; ESCALATE_L2 nếu vi phạm và (priority là CRITICAL hoặc openedHoursAgo > 96); ESCALATE_L1 cho các trường hợp vi phạm còn lại.
 * d. Triệu gọi submitObject(studentCode, qCode, object) để gửi lại đối tượng đã cập nhật. Ví dụ: breached=true; action=ESCALATE_L1.
 * e. Kết thúc chương trình client.
 */

import java.io.Serializable;

public class TicketSla implements Serializable {
    private static final long serialVersionUID = 20260517L;
    private String ticketId;
    private String priority;      // LOW, MEDIUM, HIGH, CRITICAL
    private int openedHoursAgo;
    private boolean breached;
    private String action;

    public TicketSla() { }

    public TicketSla(String ticketId, String priority, int openedHoursAgo) {
        this.ticketId = ticketId;
        this.priority = priority;
        this.openedHoursAgo = openedHoursAgo;
    }

    public String getTicketId() { return ticketId; }
    public void setTicketId(String ticketId) { this.ticketId = ticketId; }
    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }
    public int getOpenedHoursAgo() { return openedHoursAgo; }
    public void setOpenedHoursAgo(int openedHoursAgo) { this.openedHoursAgo = openedHoursAgo; }
    public boolean isBreached() { return breached; }
    public void setBreached(boolean breached) { this.breached = breached; }
    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }

    @Override
    public String toString() {
        return "TicketSla{ticketId=" + ticketId + ", priority=" + priority + ", openedHoursAgo=" + openedHoursAgo
                + ", breached=" + breached + ", action=" + action + "}";
    }
}
