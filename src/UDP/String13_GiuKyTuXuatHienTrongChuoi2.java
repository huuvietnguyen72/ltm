package UDP;

/**
 * UDP String (cổng 2208) – Bài B13: GIỮ KÝ TỰ CỦA CHUỖI 1 XUẤT HIỆN TRONG CHUỖI 2
 * Mã câu hỏi (qCode): nKozTQfN
 *
 * Một chương trình server cho phép kết nối qua giao thức UDP tại cổng 2208. Yêu cầu là xây dựng một chương trình client trao đổi thông tin với server theo kịch bản dưới đây:
 * a. Gửi thông điệp là một chuỗi chứa mã sinh viên và mã câu hỏi theo định dạng ";studentCode;qCode". Ví dụ: ";B21DCCN001;B34D51E0"
 * b. Nhận thông điệp là một chuỗi từ server theo định dạng "requestId;str1;str2".
 *    - requestId là chuỗi ngẫu nhiên duy nhất
 *    - str1, str2 lần lượt là chuỗi thứ nhất và chuỗi thứ hai
 * c. Giữ lại các ký tự trong chuỗi thứ nhất mà xuất hiện trong chuỗi thứ hai, giữ nguyên thứ tự xuất hiện. Gửi thông điệp là một chuỗi theo định dạng "requestId;strOutput", trong đó chuỗi strOutput là chuỗi đã được xử lý ở trên.
 * d. Đóng socket và kết thúc chương trình.
 */

import java.util.*;
import java.net.*;
import java.io.*;

public class String13_GiuKyTuXuatHienTrongChuoi2 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        InetAddress sA = InetAddress.getByName("36.50.135.242");
        int port = 2208;
        String code = ";B23DCCN139;nKozTQfN";
        socket.send(new DatagramPacket(code.getBytes(), code.length(), sA, port));
        // Nhận: requestId;str1;str2
        byte[] buf = new byte[4096];
        DatagramPacket nhan = new DatagramPacket(buf, buf.length);
        socket.receive(nhan);
        String received = new String(nhan.getData(), 0, nhan.getLength()).trim();
        String[] parts = received.split(";", 3);
        String requestId = parts[0];
        String str1 = parts[1];
        String str2 = parts[2];
        // Giữ ký tự của str1 có trong str2, giữ thứ tự
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (str2.indexOf(c) >= 0) sb.append(c);
        }
        String strOutput = sb.toString();
        // Gửi: requestId;strOutput
        String result = requestId + ";" + strOutput;
        socket.send(new DatagramPacket(result.getBytes(), result.length(), sA, port));
        socket.close();
    }
}
