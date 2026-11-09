package TCP;

/**
 * Data Stream (cổng 2207) – Bài 8: Trung Bình, P95 và Số Phần Tử Lớn Hơn Trung Bình
 * Mã câu hỏi (qCode): cập nhật sau
 *
 * Một chương trình server cho phép kết nối qua giao thức TCP tại cổng 2207, sử dụng DataInputStream và DataOutputStream để trao đổi dữ liệu số thực.
 * a. Gửi một chuỗi chứa mã sinh viên và mã câu hỏi bằng phương thức writeUTF theo định dạng "studentCode;qCode". Ví dụ: "B15DCCN999;1D25ED92".
 * b. Nhận từ server một số nguyên n, sau đó nhận tiếp n giá trị double.
 * c. Tính giá trị trung bình, giá trị p95 tại vị trí ceil(n * 0.95) - 1 sau khi sắp xếp tăng dần, và số phần tử lớn hơn giá trị trung bình.
 * d. Gửi kết quả bằng writeUTF theo định dạng average;p95;aboveAvg, trong đó các giá trị số thực được làm tròn 02 chữ số thập phân. Ví dụ: 18.45;30.12;4.
 * e. Đóng kết nối hoặc kết thúc client sau khi nộp kết quả.
 * Ví dụ: nếu dữ liệu nhận được là 90.0,47.66,81.95,93.56,9.72,77.04,13.72,88.62,5.34,85.55 thì dữ liệu nộp lại là 59.32;93.56;6.
 */

import java.io.*;
import java.net.*;
import java.util.*;

public class Data08_TrungBinhP95 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("36.50.135.242", 2207);
        socket.setSoTimeout(5000);
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        // ĐỔI qCode theo đề thực tế
        out.writeUTF("B23DCCN139;qCode_moi");
        out.flush();
        int n = in.readInt();
        double[] a = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.readDouble();
            sum += a[i];
        }
        double avg = sum / n;
        int above = 0;
        for (double x : a) if (x > avg) above++;
        Arrays.sort(a);
        double p95 = a[(int) Math.ceil(n * 0.95) - 1];
        String kq = String.format(Locale.US, "%.2f;%.2f;%d", avg, p95, above);
        out.writeUTF(kq);
        out.flush();
        in.close(); out.close(); socket.close();
    }
}
