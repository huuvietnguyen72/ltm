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

/**
 * RMI Object – Bài 2: SẢN PHẨM – 2
 * Mã câu hỏi (qCode): PY43T66m
 *
 * [Mã câu hỏi (qCode): PY43T66m]. Một chương trình (tạm gọi là RMI Server) cung cấp các mã khuyến mãi sản phẩm ngẫu nhiên cho sinh viên, được mô tả như sau: Giao diện từ xa public interface ObjectService extends Remote { public Serializable requestObject(String studentCode, String qAlias) throws RemoteException; public void submitObject(String studentCode, String qAlias, Serializable object) throws RemoteException; } Lớp ProductX gồm các thuộc tính id String, code String, discountCode String, discount int.
 *
 * - Một hàm khởi dựng với đầy đủ các thuộc tính liệt kê ở trên
 * - Trường dữ liệu: private static final long serialVersionUID = 20171107;
 * * Đối tượng triệu gọi từ xa được đăng ký RegistryServer với tên: RMIObjectService
 * * Tất cả các lớp được viết trong package RMI Yêu cầu là xây dựng một chương trình client thực hiện các tương tác với hệ thống phần mềm ở trên theo kịch bản dưới đây:
 * 1. Triệu gọi phương thức từ xa requestObject từ RMI Server với tham số đầu vào là mã sinh viên, mã câu để nhận về đối tượng ProductX
 * 2. Nhận về đối tượng ProductX từ RMI Server với giá trị ban đầu đã được thiết lập. Tính tổng các chữ số nằm trong chuỗi mã giảm giá (discountCode) để ra giá trị được khuyến mãi của sản phẩm và cập nhật giá trị của khuyến mãi (discount)
 * 3. Triệu gọi phương thức từ xa submitObject với tham số đầu vào là đối tượng Product đã được cập nhật đầy đủ thông tin giá trị khuyến mãi
 * 4. Kết thúc chương trình
 */

/**
 * RMI Object – Bài 3: BÀI TOÁN QUẢN LÝ THU VIỆN – 1
 * Mã câu hỏi (qCode): nCOdwcKJ
 *
 * [Mã câu hỏi (qCode): nCOdwcKJ]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để gán mã code cho sách trong một hệ thống quản lý thư viện. Chương trình sẽ ngẫu nhiên tạo ra đối tượng Book với các giá trị ban đầu và cung cấp cho RMI client như sau:  Trang 9
 *
 * Giao diện từ xa:
 *
 * public interface ObjectService extends Remote { public Serializable requestObject(String studentCode, String qCode) throws RemoteException; public void submitObject(String studentCode, String qCode, Serializable object) throws RemoteException; } Lớp Book gồm các thuộc tính: id String, title String, author String, yearPublished int, pageCount int, code String. Trường dữ liệu: private static final long serialVersionUID = 20241123L; 02 hàm khởi dựng: public Book() public Book(String id, String title, String author, int yearPublished, int pageCount) Trong đó: Interface ObjectService và lớp Book được viết trong package RMI. Đối tượng cài đặt giao diện từ xa ObjectService được đăng ký với RegistryServer: RMIObjectService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với đối tượng sách được nhận từ RMI Server:
 *
 * a. Triệu gọi phương thức requestObject để nhận đối tượng Book ngẫu nhiên từ server.
 * b. Tạo mã code cho sách dựa trên các thành phần sau:
 * - Lấy chữ cái đầu của họ và tên đầu của tác giả. Ví dụ, với tác giả "John Doe", hai chữ cái đầu sẽ là "JD".
 * - Lấy hai chữ số cuối cùng của năm xuất bản (yearPublished). Ví dụ, nếu yearPublished là 1985, sẽ lấy "85".
 * - Lấy tổng số chữ cái trong title của sách.
 * - Lấy số chữ số của pageCount (số trang) và nếu số chữ số < 3, thêm các số 0 ở đầu để đạt đủ ba chữ số. Kết hợp tất cả các thành phần trên để tạo ra mã code theo định dạng: "[Chữ cái đầu tên tác giả][Hai chữ số cuối của năm xuất bản][Tổng số chữ cái trong title][Số chữ số của pageCount]". Ví dụ, nếu tác giả là "Jane Austen", yearPublished là 1813, title là "Pride and Prejudice" với 18 ký tự, và pageCount là 345, thì mã code sẽ là: "JA1318345".
 * c. Cập nhật giá trị code trong đối tượng Book.
 * d. Triệu gọi phương thức submitObject để gửi đối tượng Book đã được xử lý trở lại server.
 * e. Kết thúc chương trình client. *Lưu ý:*
 * *1. Ví dụ tác giả là Nguyen Van nAM, kể cả chưa chuẩn hoá thì lấy vào xâu cũng phải tự viết* *hoa cho nó. Chỉ lấy ký tự đầu của họ (tức là tên đầu) và ký tự đầu của tên (tức là tên cuối)*
 * *2. Hàm khởi tạo thuộc tính id phải là String, không phải int*
 *
 * *3. Đọc log xử lý như sau: Dòng 1 là input, bắt đầu với id, kế đến là các thuộc tính, mỗi thuộc* *tính phân định với nhau bằng dấu chấm phẩy. Dòng thứ 2 là output đề cho. Dòng thứ 3 là* *output của mình làm*
 * *4. Đối với mỗi dòng 2 và 3, mỗi thuộc tính được ngăn cách nhau bởi một dấu gạch đứng*
 */

/**
 * RMI Object – Bài 4: BÀI TOÁN QUẢN LÝ THƯ VIỆN - 2
 * Mã câu hỏi (qCode): CoWosBho
 *
 * [Mã câu hỏi (qCode): CoWosBho]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý mã hóa dữ liệu tác phẩm trong hệ thống quản lý thư viện. Chương trình sẽ ngẫu nhiên tạo ra đối tượng BookX với các giá trị ban đầu và cung cấp cho RMI client như sau: Giao diện từ xa: public interface ObjectService extends Remote { public Serializable requestObject(String studentCode, String qCode) throws RemoteException; public void submitObject(String studentCode, String qCode, Serializable object) throws RemoteException; } Lớp BookX gồm các thuộc tính: id String, title String, author String, yearPublished int, genre String, code String. Trường dữ liệu: private static final long serialVersionUID = 20241124L; 02 hàm khởi dựng: public BookX() public BookX(String id, String title, String author, int yearPublished, String genre) Trong đó: Interface ObjectService và lớp BookX được viết trong package RMI. Đối tượng cài đặt giao diện từ xa ObjectService được đăng ký với RegistryServer: RMIObjectService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với đối tượng sách được nhận từ RMI Server:
 *
 * a. Triệu gọi phương thức requestObject để nhận đối tượng BookX ngẫu nhiên từ server.
 * b. Tạo mã code cho sách dựa trên các quy tắc mã hóa sau:
 * - Lấy chữ cái đầu tiên và cuối cùng trong tên tác giả (author).
 * - Lấy hai chữ số cuối cùng của yearPublished.
 *
 * - Số lượng chữ cái trong genre của sách.
 * - Độ dài của title chia lấy dư cho 10 (ví dụ: với tiêu đề dài 32 ký tự, giá trị này sẽ là 2). Kết hợp tất cả các thành phần trên để tạo ra mã code theo định dạng: [Chữ cái đầu và cuối tên tác giả][Hai chữ số cuối của năm xuất bản][Số chữ cái của genre][Độ dài title modulo 10]. Ví dụ, nếu tác giả là "Mark Twain", năm xuất bản là 1884, thể loại là "Fiction" với 7 ký tự, và tiêu đề có 24 ký tự, mã code sẽ là: "Mn8474".
 * c. Cập nhật giá trị code trong đối tượng BookX.
 * d. Triệu gọi phương thức submitObject để gửi đối tượng BookX đã được xử lý trở lại server.
 * e. Kết thúc chương trình client. //Sai đề *Chú ý: Lấy chữ cái cuối cùng của từ cuối cùng chứ không lấy chữ cái đầu của từ cuối cùng như đề* *đã mô tả. Cách đọc log xử lý cũng tương tự như Đề số 4, có điều thuộc tính thay đổi*
 */

/**
 * RMI Object – Bài 5: BÀI TOÁN QUẢN LÝ HỆ THỐNG THƯƠNG MẠI ĐIỆN TỬ
 * Mã câu hỏi (qCode): vLJWvWpf
 *
 * Mã câu hỏi (qCode): vLJWvWpf]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để quản lý thông tin đơn hàng trong hệ thống thương mại điện tử. Chương trình sẽ ngẫu nhiên tạo ra đối tượng Order với các giá trị ban đầu và cung cấp cho RMI client như sau: Giao diện từ xa: public interface ObjectService extends Remote { public Serializable requestObject(String studentCode, String qCode) throws RemoteException; public void submitObject(String studentCode, String qCode, Serializable object) throws RemoteException; } Lớp Order gồm các thuộc tính: id String, customerCode String, orderDate String, shippingType String, orderCode String.
 *
 * - Trường dữ liệu: private static final long serialVersionUID = 20241132L;
 * - 02 hàm khởi dựng: public Order() public Order(int id, String customerCode, String orderDate, String shippingType) Trong đó:
 * - Interface ObjectService và lớp Order được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa ObjectService được đăng ký với RegistryServer: RMIObjectService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với đối tượng đơn hàng được nhận từ RMI Server:
 * a. Triệu gọi phương thức requestObject để nhận đối tượng Order ngẫu nhiên từ server.
 * b. Tạo mã orderCode cho đơn hàng dựa trên các quy tắc sau:
 * - Bắt đầu bằng hai ký tự đầu của shippingType, viết in hoa.
 * - Kế đến là ba ký tự cuối của customerCode.
 *
 * - Cuối cùng là ngày và tháng từ orderDate (theo định dạng "ddMM"). Ví dụ: Nếu đơn hàng có mã khách hàng là "C123456", ngày đặt hàng là "2023-10-05", và loại giao hàng là "Express", thì mã orderCode sẽ là "EX4560510".
 * c. Cập nhật giá trị orderCode trong đối tượng Order.
 * d. Triệu gọi phương thức submitObject để gửi đối tượng Order đã được xử lý trở lại server.
 * e. Kết thúc chương trình client.
 */

/**
 * RMI Object – Bài 6: BÀI TOÁN QUẢN LÝ SINH VIÊN
 * Mã câu hỏi (qCode): lNV6xzmk
 *
 * [Mã câu hỏi (qCode): lNV6xzmk]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý thông tin sinh viên trong hệ thống quản lý giáo dục. Chương trình sẽ ngẫu nhiên tạo ra đối tượng Student với các giá trị ban đầu và cung cấp cho RMI client như sau: Giao diện từ xa: public interface ObjectService extends Remote { public Serializable requestObject(String studentCode, String qCode) throws RemoteException; public void submitObject(String studentCode, String qCode, Serializable object) throws RemoteException; } Lớp Student gồm các thuộc tính: id String, name String, enrollmentYear int, code String. Trường dữ liệu: private static final long serialVersionUID = 20241130L; 02 hàm khởi dựng: public Student() public Student(String id, String name, int enrollmentYear) Trong đó: Interface ObjectService và lớp Student được viết trong package RMI. Đối tượng cài đặt giao diện từ xa ObjectService được đăng ký với RegistryServer: RMIObjectService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với đối tượng sinh viên được nhận từ RMI Server:
 *
 * a. Triệu gọi phương thức requestObject để nhận đối tượng Student ngẫu nhiên từ server.
 * b. Thực hiện Tạo mã code cho sinh viên dựa trên các quy tắc sau:
 * - Bắt đầu bằng ký tự "B".
 * - Kế đến là hai chữ số cuối của enrollmentYear.
 * - Sau đó là TÊN của sinh viên, tất cả các ký tự của tên viết in hoa.
 * - Kết thúc với các chữ cái đầu tiên của Họ và Họ lót, đều viết in hoa.
 *
 * Ví dụ: Nếu sinh viên có tên là "Nguyen Van Tuan", năm nhập học là 2022, mã code sẽ là "B22TUAN_NV". Chuẩn hóa tên (name) theo quy tắc:
 *
 * - Chữ cái đầu tiên của Tên, Họ, và Tên lót phải viết hoa, các chữ cái khác viết thường.
 * - Ví dụ: Nếu name ban đầu là "nguYEn van tAi tUAN", sau khi chuẩn hóa sẽ trở thành "Nguyen Van Tai TUAN".
 * c. Cập nhật giá trị mã (code) và tên (name) trong đối tượng Student và
 * d. Triệu gọi phương thức submitObject để gửi đối tượng Student đã được xử lý trở lại server.
 * e. Kết thúc chương trình client. //Điều chỉnh kiểu dữ liệu hàm khởi tạo của id từ int thành String
 */

/**
 * RMI Object – Bài 7: TỔ CHỨC SỰ KIỆN
 * Mã câu hỏi (qCode): FKrGvwLM
 *
 * [Mã câu hỏi (qCode): FKrGvwLM]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để quản lý thông tin các sự kiện trong hệ thống tổ chức sự kiện. Chương trình sẽ ngẫu nhiên tạo ra đối tượng Event với các giá trị ban đầu và cung cấp cho RMI client như sau: Giao diện từ xa: public interface ObjectService extends Remote { public Serializable requestObject(String studentCode, String qCode) throws RemoteException; public void submitObject(String studentCode, String qCode, Serializable object) throws RemoteException; } Lớp Event gồm các thuộc tính: id String, eventName String, eventDate String, expectedAttendance int, eventCode String.
 *
 * - Trường dữ liệu: private static final long serialVersionUID = 20241131L;
 * - 02 hàm khởi dựng:
 *
 * public Event() public Event(int id, String eventName, String eventDate, int expectedAttendance) Trong đó:
 *
 * - Interface ObjectService và lớp Event được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa ObjectService được đăng ký với RegistryServer: RMIObjectService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với đối tượng sự kiện được nhận từ RMI Server:
 * a. Triệu gọi phương thức requestObject để nhận đối tượng Event ngẫu nhiên từ server.
 * b. Tạo mã eventCode cho sự kiện dựa trên các quy tắc sau:
 * - Nếu expectedAttendance >= 1000, thêm "L" vào eventCode; Nếu expectedAttendance từ 500 đến 999, thêm "M" vào eventCode; Nếu expectedAttendance dưới 500, thêm "S" vào eventCode.
 * - Thêm chữ cái đầu và cuối của eventName, tất cả viết hoa.
 * - Thêm ngày và tháng từ eventDate (theo định dạng "ddMM"). Ví dụ: Nếu sự kiện có tên là "Charity Run", ngày diễn ra là "2024-05-12" và số lượng người tham gia dự kiến là 1200, mã eventCode sẽ là "LCR1205".
 * c. Cập nhật giá trị eventCode trong đối tượng Event.
 * d. Triệu gọi phương thức submitObject để gửi đối tượng Event đã được xử lý trở lại server.
 * e. Kết thúc chương trình client.
 */

/**
 * RMI Object – Bài 8: BÀI TOÁN QUẢN LÝ NHÂN VIÊN
 * Mã câu hỏi (qCode): 7fSWnlHB
 *
 * [Mã câu hỏi (qCode): 7fSWnlHB]. Một chương trình (tạm gọi là RMI Server) cung cấp giao diện cho phép triệu gọi từ xa để xử lý thông tin nhân viên. Chương trình sẽ ngẫu nhiên tạo ra đối tượng Employee với các giá trị ban đầu và cung cấp cho RMI client như sau: Giao diện từ xa: public interface ObjectService extends Remote { public Serializable requestObject(String studentCode, String qCode) throws RemoteException; public void submitObject(String studentCode, String qCode, Serializable object) throws RemoteException; } Lớp Employee gồm các thuộc tính: id String, name String, baseSalary double, experienceYears int, finalSalary double. Trường dữ liệu: private static final long serialVersionUID = 20241119L; 02 hàm khởi dựng: public Employee() public Employee(String id, String name, double baseSalary, int experienceYears) //Điều chỉnh Trong đó:
 *
 * - Interface ObjectService và lớp Employee được viết trong package RMI.
 * - Đối tượng cài đặt giao diện từ xa ObjectService được đăng ký với RegistryServer với tên là: RMIObjectService. Yêu cầu: Viết chương trình tại máy trạm (RMI client) để thực hiện các công việc sau với đối tượng nhân viên được nhận từ RMI Server:
 * a. Triệu gọi phương thức requestObject với tham số đầu vào là mã sinh viên và mã câu hỏi để nhận đối tượng Employee ngẫu nhiên từ server.
 *
 * b. Tính toán finalSalary dựa trên baseSalary, experienceYears, và áp dụng thuật toán xử lý số phức tạp để tạo hệ số điều chỉnh, yêu cầu sinh viên phải thao tác và xử lý experienceYears như sau:
 * - Tách experienceYears thành tổng các chữ số (ví dụ, 14 sẽ thành 1 + 4 = 5).
 * - Tính số lượng ước số nguyên của experienceYears (ví dụ, nếu experienceYears là 12, các ước số là 1, 2, 3, 4, 6, 12, nên có 6 ước số).
 * - Xác định hệ số điều chỉnh factor dựa trên công thức sau: factor = (Số năm làm việc + tổng các chữ số + số lượng ước số) / 100.0
 * - Tính finalSalary theo công thức: finalSalary = baseSalary * (1 + factor)
 * c. Cập nhật giá trị finalSalary trong đối tượng Employee.
 * d. Triệu gọi phương thức submitObject để gửi đối tượng Employee đã được xử lý trở lại server.
 * e. Kết thúc chương trình client.
 */

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
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface ObjectService extends Remote {
    public Serializable requestObject(String studentCode, String qAlias) throws RemoteException;
    public void submitObject(String studentCode, String qAlias, Serializable object) throws RemoteException;
}
