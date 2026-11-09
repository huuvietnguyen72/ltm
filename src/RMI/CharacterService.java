package RMI;

/**
 * RMI Character – Bài 1: XỬ LÝ XÂU KÝ TỰ
 * Mã câu hỏi (qCode): NFldNPp6
 *
 * [Mã câu hỏi (qCode): NFldNPp6]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý chuỗi. Giao diện từ xa: public interface CharacterService extends Remote { public String requestCharacter(String studentCode, String qCode) throws RemoteException; public void submitCharacter(String studentCode, String qCode, String strSubmit) throws RemoteException; } Trong đó:
 *
 * - Interface CharacterService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa CharacterService được đăng ký với RegistryServer với tên là: RMICharacterService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với chuỗi được nhận từ RMI Server:
 *
 * a. Triệu gọi phương thức requestCharacter để nhận chuỗi JSON ngẫu nhiên từ server với định dạng: "Chuỗi JSON đầu vào".
 * b. Phân tích cú pháp chuỗi JSON nhận được và trích xuất các cặp key: value dựa trên vị trí của chúng:
 * - Các cặp key: value ở vị trí chẵn sẽ được đưa vào chuỗi đầu tiên.
 * - Các cặp key: value ở vị trí lẻ sẽ được đưa vào chuỗi thứ hai.
 * - Hai chuỗi kết quả sẽ được nối với nhau và phân tách bởi dấu; Ví dụ: Chuỗi JSON ban đầu {"name": "Alice", "age": 25, "city": "Wonderland", "country": "Fictionland"} à Kết quả trích xuất: "name: Alice, city: Wonderland; age: 25, country: Fictionland".
 * c. Triệu gọi phương thức submitCharacter để gửi chuỗi kết quả trích xuất đã được định dạng trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Character – Bài 2: ĐẾM SỐ LẦN XUẤT HIỆN – 1
 * Mã câu hỏi (qCode): U5BEBBOW
 *
 * [Mã câu hỏi (qCode): U5BEBBOW]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý chuỗi. Giao diện từ xa: public interface CharacterService extends Remote { public String requestCharacter(String studentCode, String qCode) throws RemoteException; public void submitCharacter(String studentCode, String qCode, String strSubmit) throws RemoteException; } Trong đó:
 *
 * - Interface CharacterService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa CharacterService được đăng ký với RegistryServer với tên là: RMICharacterService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với chuỗi được nhận từ RMI Server:
 * a. Triệu gọi phương thức requestCharacter để nhận chuỗi ngẫu nhiên từ server với định dạng: "Chuỗi đầu vào".
 * b. Thực hiện đếm tần số xuất hiện của mỗi ký tự trong chuỗi đầu vào và tạo ra chuỗi kết quả theo định dạng <Ký tự><Số lần xuất hiện>, sắp xếp theo thứ tự xuất hiện của các ký tự trong chuỗi. Ví dụ: Chuỗi đầu vào "AAABBC" à Kết quả: "A3B2C1".
 * c. Triệu gọi phương thức submitCharacter để gửi chuỗi kết quả trở lại server.
 * d. Kết thúc chương trình client.
 * *Note: Đếm cả dấu cách nhé*
 */

/**
 * RMI Character – Bài 3: PHÉP XOR - 1
 * Mã câu hỏi (qCode): Xidb0Thk
 *
 * BÀI 2 [Character] PHÉP XOR - 1
 *
 * [Mã câu hỏi (qCode): Xidb0Thk]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý chuỗi. Giao diện từ xa: public interface CharacterService extends Remote { public String requestCharacter(String studentCode, tring qCode) throws RemoteException; public void submitCharacter(String studentCode, String qCode, String strSubmit) throws RemoteException; } Trong đó:
 *
 * - Interface CharacterService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa CharacterService được đăng ký với RegistryServer với tên là: RMICharacterService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với chuỗi được nhận từ RMI Server:
 * a. Triệu gọi phương thức requestCharacter để nhận chuỗi ngẫu nhiên từ server với định dạng: "Khóa XOR;Chuỗi đầu vào".
 *
 * b. Thực hiện thao tác mã hóa XOR cho chuỗi đầu vào với khóa XOR nhận được từ server. Mã hóa XOR thực hiện bằng cách áp dụng phép XOR trên từng ký tự trong chuỗi đầu vào và ký tự tương ứng trong khóa (khóa được lặp lại để khớp độ dài chuỗi đầu vào). Ví dụ: Chuỗi ban đầu "A;HELLO" -> Khóa "A" à chuỗi mã hóa là: "IFMMN"
 * c. Triệu gọi phương thức submitCharacter để gửi chuỗi đã được mã hóa trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Character – Bài 4: ĐẾM SỐ LẦN XUẤT HIỆN - 2
 * Mã câu hỏi (qCode): ctRfIejL
 *
 * [Mã câu hỏi (qCode): ctRfIejL]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý chuỗi. Giao diện từ xa: public interface CharacterService extends Remote { public String requestCharacter(String studentCode, String qCode) throws RemoteException; public void submitCharacter(String studentCode, String qCode, String strSubmit) throws RemoteException; } Trong đó:
 *
 * - Interface CharacterService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa CharacterService được đăng ký với RegistryServer với tên là: RMICharacterService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với chuỗi được nhận từ RMI Server:
 * a. Triệu gọi phương thức requestCharacter để nhận chuỗi ngẫu nhiên từ server với định dạng: "Chuỗi văn bản đầu vào".
 * b. Thực hiện thao tác đếm tần số xuất hiện của từng ký tự trong chuỗi đầu vào. Kết quả trả về là danh sách các ký tự kèm theo số lần xuất hiện của mỗi ký tự. Ví dụ: Chuỗi ban đầu "Hello world" -> Kết quả đếm tần số ký tự: {"H": 1, "e": 1, "l": 3, "o": 2, " ": 1, "w": 1, "r": 1, "d": 1}.
 * c. Triệu gọi phương thức submitCharacter để gửi kết quả đếm tần số ký tự trở lại server dưới dạng chuỗi kết quả đã được định dạng.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Character – Bài 5: CHUYỂN ĐỔI LA MÃ – THẬP PHÂN
 * Mã câu hỏi (qCode): 0JaasIw6
 *
 * BÀI 2 [Character] CHUYỂN ĐỔI LA MÃ – THẬP PHÂN
 *
 * [Mã câu hỏi (qCode): 0JaasIw6]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý chuỗi. Giao diện từ xa: public interface CharacterService extends Remote { public String requestCharacter(String studentCode, String qCode) throws RemoteException; public void submitCharacter(String studentCode, String qCode, String strSubmit) throws RemoteException; } Trong đó:
 *
 * - Interface CharacterService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa CharacterService được đăng ký với RegistryServer với tên là: RMICharacterService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với chuỗi được nhận từ RMI Server:
 * a. Triệu gọi phương thức requestCharacter để nhận chuỗi ngẫu nhiên từ server với định dạng: "Chuỗi số La Mã đầu vào".
 * b. Thực hiện chuyển đổi chuỗi số La Mã nhận được thành số thập phân (Decimal).
 * c. Triệu gọi phương thức submitCharacter để gửi số thập phân đã chuyển đổi trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Character – Bài 6: MÃ HOÁ VIGENERE
 * Mã câu hỏi (qCode): Y7YMXHs4
 *
 * [Mã câu hỏi (qCode): Y7YMXHs4]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý chuỗi. Giao diện từ xa: public interface CharacterService extends Remote { public String requestCharacter(String studentCode, String qCode) throws RemoteException; public void submitCharacter(String studentCode, String qCode, String strSubmit) throws RemoteException; } Trong đó:
 *
 * - Interface CharacterService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa CharacterService được đăng ký với RegistryServer với tên là: RMICharacterService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với chuỗi được nhận từ RMI Server:
 * a. Triệu gọi phương thức requestCharacter để nhận chuỗi ngẫu nhiên từ server với định dạng: "Từ khóa;Chuỗi đầu vào"
 *
 * b. Thực hiện thao tác mã hóa Vigenère cho chuỗi nhận được. Biết rằng, mã hóa Vigenère thực hiện mã hóa mỗi ký tự trong chuỗi đầu vào được dịch đi một khoảng bằng với vị trí tương ứng của ký tự trong từ khóa. (Từ khóa được lặp lại để khớp với độ dài của chuỗi) Ví dụ: chuỗi ban đầu "PTIT;HELLO" à từ khóa "PTIT" và chuỗi mã hóa là: "WXTED"
 * c. Triệu gọi phương thức submitCharacter để gửi chuỗi đã được mã hóa trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Character – Bài 7: MÃ HOÁ CAESAR -1
 * Mã câu hỏi (qCode): j4rStb2a
 *
 * [Mã câu hỏi (qCode): j4rStb2a]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý chuỗi. Cụ thể: Giao diện từ xa: public interface CharacterService extends Remote { public String requestCharacter(String studentCode, String qCode) throws RemoteException; public void submitCharacter(String studentCode, String qCode, String strSubmit) throws RemoteException; }
 *
 * Trong đó:
 *
 * - Interface CharacterService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa CharacterService được đăng ký với RegistryServer với tên là: RMICharacterService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với chuỗi được nhận từ RMI Server:
 * a. Triệu gọi phương thức requestCharacter để nhận chuỗi ngẫu nhiên từ server.
 * b. Thực hiện thao tác giải mã Caesar (mã hóa chuỗi bằng cách dịch từng ký tự đi một số lượng vị trí nhất định). Biết rằng giá trị dịch đúng bằng kích thước của chuỗi chia lấy dư cho 7.
 * c. Triệu gọi phương thức submitCharacter để gửi chuỗi đã được giải mã trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Character – Bài 8: MÃ HOÁ Base64
 * Mã câu hỏi (qCode): psd4Jmnt
 *
 * [Mã câu hỏi (qCode): psd4Jmnt]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý chuỗi. Giao diện từ xa: public interface CharacterService extends Remote { public String requestCharacter(String studentCode, String qCode) throws RemoteException; public void submitCharacter(String studentCode, String qCode, String strSubmit) throws RemoteException; } Trong đó:
 *
 * - Interface CharacterService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa CharacterService được đăng ký với RegistryServer với tên là: RMICharacterService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với chuỗi được nhận từ RMI Server:
 * a. Triệu gọi phương thức requestCharacter để nhận chuỗi ngẫu nhiên từ server với định dạng: "Chuỗi đầu vào".
 * b. Thực hiện thao tác mã hóa Base64 cho chuỗi đầu vào nhận được từ server. Mã hóa Base64 chuyển đổi chuỗi nhị phân thành định dạng văn bản ASCII bằng cách mã hóa mỗi nhóm 6 bit của chuỗi thành một ký tự. Ví dụ: Chuỗi ban đầu "HELLO" à Chuỗi mã hóa Base64 là: "SEVMTE8="
 * c. Triệu gọi phương thức submitCharacter để gửi chuỗi đã được mã hóa trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Character – Bài 9: CHUYỂN ĐỔI THẬP PHÂN – LA MÃ
 * Mã câu hỏi (qCode): ADu6zRYE
 *
 * [Mã câu hỏi (qCode): ADu6zRYE]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý chuỗi. Giao diện từ xa: public interface CharacterService extends Remote { public String requestCharacter(String studentCode, String qCode) throws RemoteException; public void submitCharacter(String studentCode, String qCode, String strSubmit) throws RemoteException; } Trong đó:
 *
 * - Interface CharacterService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa CharacterService được đăng ký với RegistryServer với tên là: RMICharacterService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với chuỗi được nhận từ RMI Server:
 * a. Triệu gọi phương thức requestCharacter để nhận chuỗi ngẫu nhiên từ server với định dạng: "Số thập phân đầu vào".
 * b. Thực hiện chuyển đổi số thập phân nhận được thành chuỗi số La Mã (Roman).
 *
 * Quy tắc chuyển đổi: Các ký tự La Mã chính bao gồm: I=1, V=5, X=10, L=50, C=100, D=500, M=1000. Ví dụ: 58 à "LVIII".
 *
 * c. Triệu gọi phương thức submitCharacter để gửi chuỗi số La Mã đã chuyển đổi trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Character – Bài 10: MÃ HOÁ URL
 * Mã câu hỏi (qCode): KkihaRAB
 *
 * [Mã câu hỏi (qCode): KkihaRAB]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý chuỗi. Giao diện từ xa: public interface CharacterService extends Remote { public String requestCharacter(String studentCode, String qCode) throws RemoteException; public void submitCharacter(String studentCode, String qCode, String strSubmit) throws RemoteException; } Trong đó:
 *
 * - Interface CharacterService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa CharacterService được đăng ký với RegistryServer với tên là: RMICharacterService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với chuỗi được nhận từ RMI Server:
 * a. Triệu gọi phương thức requestCharacter để nhận chuỗi ngẫu nhiên từ server với định dạng: "Chuỗi đầu vào".
 * b. Thực hiện thao tác mã hóa URL (URL Encoding) cho chuỗi đầu vào nhận được từ server. Mã hóa URL chuyển đổi các ký tự đặc biệt thành định dạng URL an toàn bằng cách thay thế các ký tự đó bằng ký hiệu phần trăm (%) và mã ASCII của chúng. Ví dụ: Chuỗi ban đầu "Hello World!" à Chuỗi mã hóa URL là: "Hello%20World%21"
 * c. Triệu gọi phương thức submitCharacter để gửi chuỗi đã được mã hóa trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Character – Bài 11: Mã hóa URL theo quy tắc đường dẫn URI
 * Mã câu hỏi (qCode): QOZD6MLM
 *
 * Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý chuỗi.
 * Giao diện từ xa:
 * public interface CharacterService extends Remote {
 *     public String requestCharacter(String studentCode, String qCode) throws RemoteException;
 *     public void submitCharacter(String studentCode, String qCode, String strSubmit) throws RemoteException;
 * }
 * Trong đó:
 * - Interface CharacterService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa CharacterService được đăng ký với RegistryServer với tên là: RMICharacterService.
 * Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với chuỗi được nhận từ RMI Server:
 * a. Triệu gọi phương thức requestCharacter để nhận chuỗi ngẫu nhiên từ server. Chuỗi này gồm chữ, số, dấu cách và các ký tự đặc biệt như ~=+%^* /()[]{}!@#$?|. (trong đề không có dấu cách sau dấu *; thêm để không đóng comment)
 * b. Thực hiện thao tác mã hóa URL (URL Encoding) cho chuỗi đầu vào nhận được từ server. Mã hóa theo quy tắc phần đường dẫn của URI (tương đương new java.net.URI(null, null, s, null).toASCIIString()): dấu cách, ký tự không hợp lệ trong URI (như % " < > [ ] { } | \ ^), ?, # và ký tự ngoài ASCII được thay bằng %XX (UTF-8); chữ, số và - _ . ~ ! * ' ( ) ; : @ & = + $ , và dấu gạch chéo giữ nguyên.
 * Ví dụ: Chuỗi ban đầu "Hello World!" -> Chuỗi mã hóa URL là: "Hello%20World!"
 * c. Triệu gọi phương thức submitCharacter để gửi chuỗi đã được mã hóa trở lại server.
 * d. Kết thúc chương trình client.
 */

import java.rmi.*;
public interface CharacterService extends Remote {
    public String requestCharacter(String studentCode, String qCode) throws RemoteException;
    public void submitCharacter(String studentCode, String qCode, String strSubmit) throws RemoteException;
}