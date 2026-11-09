package RMI;

/**
 * RMI Data – Bài 1: BỘ BA SỐ PYTAGO
 * Mã câu hỏi (qCode): NMATI6Zw
 *
 * - Interface DataService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa DataService được đăng ký với RegistryServer với tên là: RMIDataService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhận được từ RMI Server:
 * a. Triệu gọi phương thức requestData để nhận một số nguyên dương N từ server, đại diện cho giới hạn trên của khoảng cần kiểm tra.
 * b. Xác định tất cả các bộ ba số nguyên (a, b, c) sao cho a² + b² = c² và a < b < c ≤ N. Kết quả trả về là danh sách các bộ ba số Pythagore thỏa mãn yêu cầu. Ví dụ: Với N = 20, kết quả là [(3, 4, 5), (5, 12, 13), (8, 15, 17)].
 * c. Triệu gọi phương thức submitData để gửi đối tượng List<List<Integer>> danh sách các bộ ba số Pytago đã tìm được trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Data – Bài 2: HOÁN VỊ KẾ TIẾP
 * Mã câu hỏi (qCode): 3Qe0Qb5w
 *
 * [Mã câu hỏi (qCode): 3Qe0Qb5w]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý dữ liệu. Giao diện từ xa: public interface DataService extends Remote { public Object requestData(String studentCode, String qCode) throws RemoteException; public void submitData(String studentCode, String qCode, Object data) throws RemoteException; } Trong đó:
 *
 * - Interface DataService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa DataService được đăng ký với RegistryServer với tên là: RMIDataService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhận được từ RMI Server:
 * a. Triệu gọi phương thức requestData để nhận một chuỗi các số nguyên.
 * b. Sử dụng thuật toán sinh hoán vị kế tiếp để tìm hoán vị kế tiếp của chuỗi số này theo thứ tự từ điển. Nếu chuỗi đã là hoán vị lớn nhất, trả về hoán vị nhỏ nhất (sắp xếp lại từ đầu theo thứ tự từ điển). Ví dụ: Với chuỗi 1, 2, 3 tổ hợp kế tiếp là 1, 3, 2. Nếu chuỗi là 3, 2, 1 (hoán vị lớn nhất), kết quả sẽ là 1, 2, 3 (hoán vị nhỏ nhất).
 * c. Triệu gọi phương thức submitData để gửi chuỗi chứa hoán vị kế tiếp đã tìm được trở lại server.
 * d. Kết thúc chương trình client.
 * *Note: Khi in tổ hợp thì giữa các số chỉ cách nhau đúng một dấu phẩy thôi*
 */

/**
 * RMI Data – Bài 3: PHẦN TỬ LỚN THỨ K
 * Mã câu hỏi (qCode): wzG6G9ji
 *
 * [Mã câu hỏi (qCode): wzG6G9ji]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý dữ liệu. Giao diện từ xa: public interface DataService extends Remote { public Object requestData(String studentCode, String qCode) throws RemoteException; public void submitData(String studentCode, String qCode, Object data) throws RemoteException; } Trong đó:
 *
 * - Interface DataService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa DataService được đăng ký với RegistryServer với tên là: RMIDataService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhận được từ RMI Server:
 * a. Triệu gọi phương thức requestData để nhận một chuỗi chứa mảng số nguyên và một số nguyên K từ server với định dạng: “mảng; số nguyên K”.
 * b. Sử dụng thuật toán phù hợp để tìm phần tử lớn thứ K trong mảng số nguyên đã cho. Ví dụ: Với Chuỗi “3, 1, 5, 12, 2, 11; 3” nghĩa là mảng [3, 1, 5, 12, 2, 11] và K = 3 à cần tìm phần tử lớn thứ 3 là 5.
 * c. Triệu gọi phương thức submitData để gửi kết quả phần tử lớn thứ K đã tìm được trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Data – Bài 4: ĐỔI TIỀN
 * Mã câu hỏi (qCode): Iz06p8Zw
 *
 * [Mã câu hỏi (qCode): Iz06p8Zw]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý dữ liệu. Giao diện từ xa: public interface DataService extends Remote { public Object requestData(String studentCode, String qCode) throws RemoteException; public void submitData(String studentCode, String qCode, Object data) throws RemoteException; } Trong đó:
 *
 * - Interface DataService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa DataService được đăng ký với RegistryServer với tên là: RMIDataService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhận được từ RMI Server:
 * a. Triệu gọi phương thức requestData để nhận một số nguyên dương amount từ server, đại diện cho số tiền cần đạt được.
 * b. Sử dụng thuật toán xếp đồng xu với các mệnh giá cố định [1, 2, 5, 10] để xác định số lượng đồng xu tối thiểu cần thiết để đạt được số tiền amount. Nếu không thể đạt được số tiền đó với các mệnh giá hiện có, trả về -1. Ví dụ: Với amount = 18 và mệnh giá đồng xu cố định [1, 2, 5, 10], kết quả là 4 (18 = 10 + 5 + 2 +
 * 1). Chuỗi cần gửi lên server là: 4; 10,5,2,1
 * c. Triệu gọi phương thức submitData để gửi chuỗi chứa kết quả số lượng đồng xu tối thiểu và giá trị các đồng xu tương ứng trở lại server.
 * d. Kết thúc chương trình client. *Output format sẽ có dạng như hình dưới*
 */

/**
 * RMI Data – Bài 5: LIỆT KÊ SỐ NGUYÊN TỐ
 * Mã câu hỏi (qCode): nD8MdtME
 *
 * [Mã câu hỏi (qCode): nD8MdtME]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý dữ liệu. Giao diện từ xa: public interface DataService extends Remote { public Object requestData(String studentCode, String qCode) throws RemoteException; public void submitData(String studentCode, String qCode, Object data) throws RemoteException; } Trong đó:
 *
 * - Interface DataService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa DataService được đăng ký với RegistryServer với tên là: RMIDataService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhận được từ RMI Server:
 * a. Triệu gọi phương thức requestData để nhận một số nguyên dương N từ server, đại diện cho giới hạn trên của khoảng cần kiểm tra.
 * b. Thực hiện tìm tất cả các số nguyên tố trong khoảng từ 1 đến N. Ví dụ: Với N = 10, kết quả là danh sách các số nguyên tố “2, 3, 5, 7”.
 * c. Triệu gọi phương thức submitData để gửi List< Integer> danh sách các số nguyên tố đã tìm được trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Data – Bài 6: PHƯƠNG SAI – ĐỘ LỆCH CHUẨN
 * Mã câu hỏi (qCode): uZMEY3Zg
 *
 * [Mã câu hỏi (qCode): uZMEY3Zg]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý dữ liệu. Giao diện từ xa: public interface DataService extends Remote { public Object requestData(String studentCode, String qCode) throws RemoteException; public void submitData(String studentCode, String qCode, Object data) throws RemoteException; } Trong đó:
 *
 * - Interface DataService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa DataService được đăng ký với RegistryServer với tên là: RMIDataService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhận được từ RMI Server:
 * a. Triệu gọi phương thức requestData để nhận một chuỗi các tập hợp các số thực từ server.
 * b. Tính toán phương sai (variance) và độ lệch chuẩn (standard deviation) của tập hợp dữ liệu này (làm tròn tới 02 chữ số thập phân) Ví dụ: Với tập dữ liệu nhận được “2.0, 4.0, 4.0, 4.0, 5.0, 5.0, 7.0, 9.0”, phương sai là 4.00 và độ lệch chuẩn là 2.00
 * c. Triệu gọi phương thức submitData để gửi chuỗi chứa kết quả phương sai và độ lệch chuẩn trở lại server dưới dạng một cặp giá trị “variance : standard deviation”
 * d. Kết thúc chương trình client. *Không làm tròn trước, để nguyên giá trị, lúc in dùng String.format*(“%.2f%.2f)
 */

/**
 * RMI Data – Bài 7: LIỆT KÊ SỐ ĐỐI XỨNG
 * Mã câu hỏi (qCode): t3cBY2uk
 *
 * [Mã câu hỏi (qCode): t3cBY2uk]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý dữ liệu. Giao diện từ xa: public interface DataService extends Remote { public Object requestData(String studentCode, String qCode) throws RemoteException; public void submitData(String studentCode, String qCode, Object data) throws RemoteException;
 *
 * } Trong đó:
 *
 * - Interface DataService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa DataService được đăng ký với RegistryServer với tên là: RMIDataService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhận được từ RMI Server:
 * a. Triệu gọi phương thức requestData để nhận hai số nguyên dương N và K từ server, đại diện cho khoảng cần kiểm tra (N ≤ số < K).
 * b. Xác định tất cả các số nguyên đối xứng (Palindrome Number) trong khoảng từ N đến K. Kết quả trả về là danh sách các số đối xứng thỏa mãn yêu cầu. Ví dụ: Với N = 50 và K = 150, kết quả là [55, 66, 77, 88, 99, 101, 111, 121, 131, 141].
 * c. Triệu gọi phương thức submitData để gửi đối tượng List<Integer> danh sách các số nguyên đối xứng đã tìm được trở lại server.
 * d. Kết thúc chương trình client.
 * *Note: Input format là một String gồm 2 số n và k, cách nhau bởi dấu chấm phẩy, chứ không phải*
 *  *triệu gọi 2 lần nhận 2 số*
 */

/**
 * RMI Data – Bài 8: PHÂN TÍCH RA THỪA SỐ NGUYÊN TỐ
 * Mã câu hỏi (qCode): zzmmquoc
 *
 * [Mã câu hỏi (qCode): zzmmquoc]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý dữ liệu. Giao diện từ xa: public interface DataService extends Remote { public Object requestData(String studentCode, String qCode) throws RemoteException; public void submitData(String studentCode, String qCode, Object data) throws RemoteException; } Trong đó:
 *
 * - Interface DataService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa DataService được đăng ký với RegistryServer với tên là: RMIDataService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhận được từ RMI Server:
 * a. Triệu gọi phương thức requestData để nhận một số nguyên dương lớn từ server, gọi là N.
 * b. Thực hiện phân rã số N thành các thừa số nguyên tố. Kết quả trả về là danh sách các thừa số nguyên tố của N. Ví dụ: Với N = 84, kết quả là danh sách “2, 2, 3, 7”.
 * c. Triệu gọi phương thức submitData để gửi danh sách các thừa số nguyên tố đã tìm được trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Data – Bài 9: LIỆT KÊ SỐ CHÍNH PHƯƠNG
 * Mã câu hỏi (qCode): eTHcAYZh
 *
 * [Mã câu hỏi (qCode): eTHcAYZh]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý dữ liệu. Giao diện từ xa: public interface DataService extends Remote { public Object requestData(String studentCode, String qCode) throws RemoteException; public void submitData(String studentCode, String qCode, Object data) throws RemoteException; } Trong đó:
 *
 * - Interface DataService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa DataService được đăng ký với RegistryServer với tên là: RMIDataService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhận được từ RMI Server:
 * a. Triệu gọi phương thức requestData để nhận một số nguyên dương N từ server.
 * b. Xác định tất cả các số chính phương nhỏ hơn N. Kết quả trả về là danh sách các số chính phương thỏa mãn yêu cầu. Ví dụ: Với N = 20, kết quả là [1, 4, 9, 16].
 * c. Triệu gọi phương thức submitData để gửi đối tượng List<Integer> danh sách các số chính phương đã tìm được trở lại server.
 * d. Kết thúc chương trình client.
 */

/**
 * RMI Data – Bài 10: SINH TỔ HỢP
 * Mã câu hỏi (qCode): juC3u7C6
 *
 * [Mã câu hỏi (qCode): juC3u7C6]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý dữ liệu. Giao diện từ xa: public interface DataService extends Remote { public Object requestData(String studentCode, String qCode) throws RemoteException; public void submitData(String studentCode, String qCode, Object data) throws RemoteException; } Trong đó:
 *
 * - Interface DataService được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa DataService được đăng ký với RegistryServer với tên là: RMIDataService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với dữ liệu nhận được từ RMI Server:
 * a. Triệu gọi phương thức requestData để nhận một chuỗi gồm tập hợp số nguyên và một số nguyên K từ server với định dạng: “mảng; số nguyên K”.
 * b. Sử dụng thuật toán sinh tổ hợp để tạo ra tất cả các tổ hợp kích thước K của tập hợp đã cho. Kết quả trả về là danh sách các tổ hợp con có K phần tử. Ví dụ: Với tập hợp [1, 2, 3, 4] và K = 2, kết quả là danh sách các tổ hợp [[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]].
 * c. Triệu gọi phương thức submitData để gửi chuỗi chứa danh sách các tổ hợp đã sinh được trở lại server.
 * d. Kết thúc chương trình client. *Chú ý:*
 * *1. Định dạng input là String như đề bài đã mô tả. Định dạng Output là* ArrayList<ArrayList<Integer>>*(Mỗi list bên trong là một tổ hợp chập k của n, list bên ngoài* *để chứa các tổ hợp). Bạn nào cố tạo String thì output cho dù đúng nhưng máy chấm vẫn là* *sai (Được tính là không gửi gì)*
 * *2. Khi sinh tổ hợp cần bảo toàn trật tự ban đầu của mảng, không sắp xếp*
 * *3. Test ví dụ*
 */

/**
 * RMI Data – Bài 11: Tìm vị trí đỉnh cục bộ
 * Mã câu hỏi (qCode): TPD9fy3r
 *
 * Một chương trình RMI Server cung cấp giao diện DataService trong package RMI, được đăng ký với RegistryServer bằng tên RMIDataService.
 * a. Sử dụng mã sinh viên và mã câu hỏi làm tham số khi gọi RMI.
 * b. Triệu gọi requestData(studentCode, qCode) để nhận một mảng số nguyên từ server. Ví dụ: [3,8,5,10,7].
 * c. Một phần tử là đỉnh cục bộ nếu lớn hơn phần tử liền kề bên trái và bên phải; phần tử đầu/cuối chỉ cần lớn hơn phần tử kề duy nhất. Trả về vị trí theo chỉ số bắt đầu từ 1.
 * d. Triệu gọi submitData(studentCode, qCode, data) để gửi List<Integer> các vị trí đỉnh cục bộ. Ví dụ: [2,4].
 * e. Kết thúc chương trình client.
 */

/**
 * RMI Data – Bài 12: Thống kê số thực nâng cao
 * Mã câu hỏi (qCode): HNCj8VEs
 *
 * Một chương trình RMI Server cung cấp giao diện DataService trong package RMI, được đăng ký với RegistryServer bằng tên RMIDataService.
 * a. Sử dụng mã sinh viên và mã câu hỏi làm tham số khi gọi RMI.
 * b. Triệu gọi requestData(studentCode, qCode) để nhận chuỗi CSV các số thực. Ví dụ: 10.00,20.00,30.00,40.00.
 * c. Tính giá trị trung bình, độ lệch chuẩn trên toàn bộ dãy và phân vị 95 tại vị trí ceil(n * 0.95) - 1 sau khi sắp xếp tăng dần.
 * d. Triệu gọi submitData(studentCode, qCode, data) để gửi chuỗi average=<avg>;stddev=<stddev>;p95=<p95>, các số thực làm tròn 02 chữ số thập phân. Ví dụ: average=25.00;stddev=11.18;p95=40.00.
 * e. Kết thúc chương trình client.
 */

import java.rmi.*;
public interface DataService extends Remote {
    public Object requestData(String studentCode, String qCode) throws RemoteException;
    public void submitData(String studentCode, String qCode, Object data) throws RemoteException;
}
