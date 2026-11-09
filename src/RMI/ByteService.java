package RMI;

/**
 * RMI Byte – Bài 1: PHẦN TỬ XUẤT HIỆN NHIỀU LẦN NHẤT
 * Mã câu hỏi (qCode): 1mPMIkGJ
 *
 * [Mã câu hỏi (qCode): 1mPMIkGJ]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý dữ liệu nhị phân. Giao diện từ xa: public interface ByteService extends Remote { public byte[] requestData(String studentCode, String qCode) throws RemoteException; public void submitData(String studentCode, String qCode, byte[] data) throws RemoteException; } Trong đó:
 *
 * - Interface ByteService được viết trong package RMI. Đối tượng cài đặt giao diện từ xa ByteService được đăng ký với RegistryServer với tên là: RMIByteService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhị phân nhận được từ RMI Server:
 * a. Triệu gọi phương thức requestData để nhận một mảng dữ liệu nhị phân (byte[]) từ server.
 * b. Tìm phần tử xuất hiện nhiều nhất trong mảng byte[]. Nếu có nhiều phần tử có cùng số lần xuất hiện cao nhất, chỉ cần trả về phần tử đầu tiên xuất hiện trong các phần tử đó. Ví dụ: Nếu mảng dữ liệu nhận được là [1, 2, 3, 2, 1, 2], phần tử xuất hiện nhiều nhất là 2, với tần suất xuất hiện 3 lần.
 * c. Triệu gọi phương thức submitData để gửi mảng byte chứa phần tử phổ biến nhất, cùng với tần suất xuất hiện của nó trở lại server.
 * d. Kết thúc chương trình client
 */

/**
 * RMI Byte – Bài 2: PHẦN TỬ XUẤT HIỆN ÍT LẦN NHẤT
 * Mã câu hỏi (qCode): L7A2NPQU
 *
 * BÀI 3 [Byte]. PHẦN TỬ XUẤT HIỆN ÍT LẦN NHẤT
 *
 * Mã câu hỏi (qCode): L7A2NPQU]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý dữ liệu nhị phân. Giao diện từ xa: public interface ByteService extends Remote { public byte[] requestData(String studentCode, String qCode) throws RemoteException; public void submitData(String studentCode, String qCode, byte[] data) throws RemoteException; } Trong đó:
 *
 * - Interface ByteService được viết trong package RMI. Đối tượng cài đặt giao diện từ xa ByteService được đăng ký với RegistryServer với tên là: RMIByteService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhị phân nhận được từ RMI Server:
 * a. Triệu gọi phương thức requestData để nhận một mảng dữ liệu nhị phân (byte[]) từ server.
 * b. Tìm phần tử có số lần xuất hiện ít nhất trong mảng, nếu có nhiều phần tử có cùng số lần xuất hiện ít nhất, chỉ cần trả về phần tử đầu tiên xuất hiện trong các phần tử đó Ví dụ: Nếu mảng dữ liệu nhận được là [1, 2, 3, 2, 1], chương trình sẽ tìm ra phần tử xuất hiện ít nhất là 3.
 * c. Triệu gọi phương thức submitData để gửi mảng byte kết quả chứa phần tử có số lần xuất hiện ít nhất và số lần xuất hiện trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Byte – Bài 3: CHUYỂN ĐỔI HỆ BÁT PHÂN
 * Mã câu hỏi (qCode): HhPAxeDw
 *
 * [Mã câu hỏi (qCode): HhPAxeDw]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý dữ liệu nhị phân. Giao diện từ xa: public interface ByteService extends Remote { public byte[] requestData(String studentCode, String qCode) throws RemoteException; public void submitData(String studentCode, String qCode, byte[] data) throws RemoteException; } Trong đó:
 *
 * - Interface ByteService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa ByteService được đăng ký với RegistryServer với tên là: RMIByteService.
 * Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhị phân nhận được từ RMI Server:
 *
 * a. Triệu gọi phương thức requestData để nhận một mảng dữ liệu nhị phân (byte[]) từ server.
 * b. Chuyển đổi mỗi byte trong mảng dữ liệu nhận được thành chuỗi biểu diễn số bát phân (octal). Mỗi byte sẽ được chuyển thành một chuỗi số bát phân gồm ba chữ số (nếu cần, thêm các chữ số 0 ở đầu để đảm bảo đúng định dạng). Ví dụ: Nếu mảng dữ liệu nhận được là [72, 101, 108], chương trình sẽ thực hiện chuyển đổi từng byte thành dạng bát phân:
 *
 * |•|72 à "110"|
 * |---|---|
 * |•|101 à "145"|
 * |•|108 à "154"|
 *  Kết quả là chuỗi octal "110145154". Chuyển chuỗi bát phân này trở lại thành mảng byte[] (mỗi ký tự trong chuỗi octal được mã hóa dưới dạng ASCII byte) để gửi về server.
 * c. Triệu gọi phương thức submitData để gửi mảng byte[] chứa chuỗi bát phân trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Byte – Bài 4: PHÉP XOR – 2
 * Mã câu hỏi (qCode): 4BraNTI5
 *
 * BÀI 3 [Byte]. PHÉP XOR – 2
 *
 * [Mã câu hỏi (qCode): 4BraNTI5]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý dữ liệu nhị phân. Giao diện từ xa: public interface ByteService extends Remote { public byte[] requestData(String studentCode, String qCode) throws RemoteException; public void submitData(String studentCode, String qCode, byte[] data) throws RemoteException; } Trong đó:
 *
 * - Interface ByteService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa ByteService được đăng ký với RegistryServer với tên là: RMIByteService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhị phân nhận được từ RMI Server:
 *
 * a. Triệu gọi phương thức requestData để nhận một mảng dữ liệu nhị phân (byte[]) từ server, đại diện cho một chuỗi văn bản ASCII.
 * b. Thực hiện mã hóa XOR cho mảng dữ liệu nhị phân bằng cách sử dụng một khóa là chuỗi "PTIT". Thực hiện phép XOR trên từng byte trong mảng dữ liệu với byte tương ứng trong khóa (khóa sẽ được lặp lại để khớp với độ dài của mảng dữ liệu). Ví dụ: Nếu dữ liệu nhị phân nhận được là [72, 101, 108, 108, 111] (tương ứng với chuỗi "Hello"), và khóa là "PTIT", chương trình sẽ thực hiện mã hóa như sau:
 * - Chuyển khóa "PTIT" thành mảng byte [80, 84, 73, 84].
 * - Lặp lại khóa để khớp độ dài dữ liệu: [80, 84, 73, 84, 80].
 * - Thực hiện phép XOR trên từng byte của dữ liệu với khóa:
 * - Kết quả mã hóa là mảng [24, 49, 37, 56, 63].
 * c. Triệu gọi phương thức submitData để gửi mảng dữ liệu đã được mã hóa bằng XOR trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Byte – Bài 5: GIẢI MÃ
 * Mã câu hỏi (qCode): oeJljCIf
 *
 * [Mã câu hỏi (qCode): oeJljCIf]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý dữ liệu nhị phân. Giao diện từ xa: public interface ByteService extends Remote { public byte[] requestData(String studentCode, String qCode) throws RemoteException; public void submitData(String studentCode, String qCode, byte[] data) throws RemoteException; } Trong đó:
 *
 * - Interface ByteService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa ByteService được đăng ký với RegistryServer với tên là: RMIByteService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhị phân đã mã hóa dưới dạng Base64 nhận được từ RMI Server:
 * a. Triệu gọi phương thức requestData để nhận một mảng dữ liệu nhị phân (byte[]) từ server, trong đó mảng này chứa một chuỗi Base64 được mã hóa.
 * b. Thực hiện giải mã dữ liệu nhận được từ định dạng Base64 về dữ liệu gốc. Sử dụng giải mã Base64 để chuyển mảng byte Base64 thành mảng byte nguyên bản ban đầu.
 *
 * Ví dụ: Nếu dữ liệu Base64 nhận được là chuỗi mã hóa SGVsbG8gV29ybGQ= (tương ứng với chuỗi "Hello World" trong ASCII), chương trình sẽ thực hiện giải mã để nhận được mảng dữ liệu nhị phân [72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100].
 *
 * c. Triệu gọi phương thức submitData để gửi mảng dữ liệu gốc đã giải mã trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Byte – Bài 6: MÃ HOÁ CAESAR – 2
 * Mã câu hỏi (qCode): i0EVI2TB
 *
 * Trong đó:
 *
 * - Interface ByteService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa ByteService được đăng ký với RegistryServer với tên là: RMIByteService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhị phân nhận được từ RMI Server:
 * a. Triệu gọi phương thức requestData để nhận một mảng dữ liệu nhị phân (byte[]) từ server, đại diện cho một chuỗi văn bản ASCII.
 * b. Thực hiện mã hóa Caesar cho mảng dữ liệu nhị phân bằng cách dịch chuyển mỗi byte trong mảng đi một số bước cố định trong bảng mã ASCII. Số bước dịch chuyển là số ký tự ASCII trong mảng dữ liệu. Ví dụ: Nếu dữ liệu nhị phân nhận được là [72, 101, 108, 108, 111] (tương ứng với chuỗi "Hello"), chương trình sẽ thực hiện mã hóa Caesar với độ dịch là 5. Kết quả mã hóa là mảng [77, 105, 113, 113, 116], tương ứng với chuỗi "Mlqqt".
 * c. Triệu gọi phương thức submitData để gửi mảng dữ liệu đã được mã hóa bằng Caesar trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Byte – Bài 7: SẮP XẾP CHẴN LẺ
 * Mã câu hỏi (qCode): A7hytb1V
 *
 * [Mã câu hỏi (qCode): A7hytb1V]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý dữ liệu nhị phân. Giao diện từ xa: public interface ByteService extends Remote { public byte[] requestData(String studentCode, String qCode) throws RemoteException; public void submitData(String studentCode, String qCode, byte[] data) throws RemoteException; } Trong đó:
 *
 * - Interface ByteService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa ByteService được đăng ký với RegistryServer với tên là: RMIByteService.
 * Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhị phân nhận được từ RMI Server:
 *
 * a. Triệu gọi phương thức requestData để nhận một mảng dữ liệu nhị phân (byte[]) từ server.
 * b. Thực hiện phân chia mảng byte[] nhận được thành hai phần: phần đầu chứa các byte có giá trị chẵn và phần sau chứa các byte có giá trị lẻ, duy trì thứ tự xuất hiện của các phần tử trong từng nhóm. Ví dụ: Nếu mảng dữ liệu nhận được là [1, 2, 3, 4, 5], sau khi phân chia chẵn-lẻ, mảng kết quả sẽ là [2, 4, 1, 3, 5] (tất cả phần tử chẵn được đặt trước, theo sau là tất cả phần tử lẻ).
 * c. Triệu gọi phương thức submitData để gửi mảng byte[] đã được phân chia chẵn-lẻ trở lại server.
 *
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Byte – Bài 8: MÃ HOÁ HEXA
 * Mã câu hỏi (qCode): pK0IZNnt
 *
 * [Mã câu hỏi (qCode): pK0IZNnt]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý dữ liệu nhị phân. Giao diện từ xa: public interface ByteService extends Remote { public byte[] requestData(String studentCode, String qCode) throws RemoteException; public void submitData(String studentCode, String qCode, byte[] data) throws RemoteException; } Trong đó:
 *
 * - Interface ByteService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa ByteService được đăng ký với RegistryServer với tên là: RMIByteService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhị phân nhận được từ RMI Server:
 * a. Triệu gọi phương thức requestData để nhận một mảng dữ liệu nhị phân (byte[]) từ server.
 * b. Chuyển đổi mảng dữ liệu nhị phân nhận được thành một chuỗi biểu diễn hex. Mỗi byte trong mảng sẽ được chuyển đổi thành hai ký tự hex tương ứng. Ví dụ: Nếu dữ liệu nhị phân nhận được là [72, 101, 108, 108, 111], chương trình sẽ chuyển đổi mảng này thành chuỗi hex "48656c6c6f", tương ứng với chuỗi "Hello" trong ASCII.
 * c. Triệu gọi phương thức submitData để gửi chuỗi biểu diễn hex đã chuyển đổi thành mảng byte trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Byte – Bài 9: NÉN RLE
 * Mã câu hỏi (qCode): 2uG0lQGi
 *
 * [Mã câu hỏi (qCode): 2uG0lQGi]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý dữ liệu nhị phân. Giao diện từ xa: public interface ByteService extends Remote { public byte[] requestData(String studentCode, String qCode) throws RemoteException; public void submitData(String studentCode, String qCode, byte[] data) throws RemoteException; } Trong đó:
 *
 * - Interface ByteService được viết trong package RMI.
 *
 * - Đối tượng cài đặt giao diện từ xa ByteService được đăng ký với RegistryServer với tên là: RMIByteService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu byte nhận được từ RMI Server:
 * a. Triệu gọi phương thức requestData để nhận một mảng dữ liệu byte từ server, đại diện cho một chuỗi dữ liệu byte tổng quát.
 * b. Thực hiện nén dữ liệu sử dụng thuật toán Run-Length Encoding (RLE) bằng cách ghi nhận mỗi byte và *số lần lặp liên tiếp* của nó. Kết quả nén là một mảng mới biểu diễn các cặp (byte, số lần lặp). Ví dụ: Nếu dữ liệu byte nhận được là [10, 10, 10, 20, 20, 30, 30, 30, 30], chương trình sẽ thực hiện nén RLE như sau: Kết quả nén RLE là mảng [10, 3, 20, 2, 30, 4].
 * c. Triệu gọi phương thức submitData để gửi mảng dữ liệu đã được nén RLE trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Byte – Bài 10: PHẦN TỬ LỚN THỨ K
 * Mã câu hỏi (qCode): uIKHCTWG
 *
 * [Mã câu hỏi (qCode): uIKHCTWG]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý dữ liệu nhị phân. Giao diện từ xa: public interface ByteService extends Remote { public byte[] requestData(String studentCode, String qCode) throws RemoteException; public void submitData(String studentCode, String qCode, byte[] data) throws RemoteException; } Trong đó:
 *
 * - Interface ByteService được viết trong package RMI. Đối tượng cài đặt giao diện từ xa ByteService được đăng ký với RegistryServer với tên là: RMIByteService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhị phân nhận được từ RMI Server:
 * a. Triệu gọi phương thức requestData để nhận một mảng dữ liệu nhị phân (byte[]) từ server, cùng với một số nguyên K, đại diện cho thứ tự phần tử cần tìm.
 *
 * b. Tìm phần tử lớn thứ K trong mảng byte[] với K là phần tử cuối cùng của mảng. Ví dụ: Nếu mảng dữ liệu nhận được là [3, 1, 5, 12, 2, 11, 3], giá trị K = 3, chương trình sẽ tìm phần tử lớn thứ ba à Kết quả là 5.
 * c. Triệu gọi phương thức submitData để gửi mảng byte gồm phần tử lớn thứ K và vị trí của K trở lại server.
 * d. Kết thúc chương trình client. *Chú ý: Khi in vị trí của K thì đó là vị trí tính từ 1*
 */

import java.rmi.*;
public interface ByteService extends Remote {
    public byte[] requestData(String studentCode, String qCode) throws RemoteException;
    public void submitData(String studentCode, String qCode, byte[] data) throws RemoteException;
}