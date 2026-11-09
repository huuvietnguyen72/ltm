package UDP;

/**
 * UDP Object (cổng 2209) – Bài C4: CHUẨN HOÁ THÔNG TIN SÁCH
 * Mã câu hỏi (qCode): LFACr5Bi
 *
 * [Mã câu hỏi (qCode): LFACr5Bi]. Một chương trình server cho phép giao tiếp qua giao thức UDP tại cổng 2209. Yêu cầu là xây dựng một chương trình client trao đổi thông tin với server theo kịch bản sau: Đối tượng trao đổi là thể hiện của lớp UDP.Book được mô tả:
 * - Tên đầy đủ lớp: UDP.Book
 * - Các thuộc tính: id (String), title (String), author (String), isbn (String), publishDate (String)
 * - Hàm khởi tạo: public Book(String id, String title, String author, String isbn, String publishDate)
 * - Trường dữ liệu: private static final long serialVersionUID = 20251107L
 * Thực hiện:
 * a. Gửi thông điệp là một chuỗi chứa mã sinh viên và mã câu hỏi theo định dạng ";studentCode;qCode". Ví dụ: ";B23DCCN005;eQkvAeId"
 * b. Nhận thông điệp chứa: 08 byte đầu chứa chuỗi requestId, các byte còn lại chứa một đối tượng là thể hiện của lớp Book từ server. Trong đó, các thuộc tính id, title, author, isbn, và publishDate đã được thiết lập sẵn.
 * c. Thực hiện:
 * 1. Chuẩn hóa title: Với mỗi từ, viết hoa chữ cái đầu tiên, viết thường các chữ cái còn lại.
 * 2. Chuẩn hóa author theo định dạng "Họ, Tên": Họ là từ đầu tiên, viết hoa tất cả; Tên là các từ còn lại, mỗi từ viết hoa chữ cái đầu tiên, viết thường các chữ cái còn lại, giữa mỗi từ chỉ có đúng một dấu cách.
 * 3. Chuẩn hóa mã ISBN theo định dạng "978-3-16-148410-0"
 * 4. Chuyển đổi publishDate từ yyyy-mm-dd sang mm/yyyy.
 * d. Gửi lại đối tượng đã được chuẩn hóa về server với cấu trúc: 08 byte đầu chứa chuỗi requestId và các byte còn lại chứa đối tượng Book đã được sửa đổi.
 * e. Đóng socket và kết thúc chương trình.
 * Test ví dụ: Input title "wAsSegd NCAxhCY" → Output "Wassegd Ncaxhcy". Input author "cFPISv tlpiAvv TzfHf" → Output "CFPISV, Tlpiavv Tzfhf". ISBN 13 chữ số → xxx-x-xx-xxxxxx-x.
 * Lưu ý: Hệ thống còn có mã câu hỏi qAuSMw4o cùng đề này — chỉ đổi qCode.
 */

import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 20251107L;
    public String id, title, author, isbn, publishDate;
}
