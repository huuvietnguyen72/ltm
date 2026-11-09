package UDP;

/**
 * UDP String (cổng 2208) – Bài B12: GIẢI MÃ QUERY STRING VÀ SẮP XẾP KEY
 * Mã câu hỏi (qCode): 4nh8amAn
 *
 * Một chương trình server cho phép giao tiếp qua giao thức UDP tại cổng 2208 theo cơ chế hai pha.
 * a. Gửi datagram đầu tiên chứa chuỗi theo định dạng ";studentCode;qCode". Ví dụ: ";B21DCCN001;XbYdNZ3A".
 * b. Nhận phản hồi từ server theo định dạng "requestId;data", trong đó data là query string. Ví dụ: "Qr12St34;role=risk%20team&user=alice".
 * c. Giải mã URL encoding cho key và value, sau đó sắp xếp key tăng dần theo thứ tự từ điển.
 * d. Gửi datagram nộp kết quả theo định dạng "requestId;key=value;key=value". Ví dụ: "Qr12St34;role=risk team;user=alice".
 * e. Đóng socket hoặc kết thúc client sau khi nộp kết quả.
 */

import java.util.*;
import java.net.*;
import java.io.*;

public class String12_GiaiMaQueryString {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        InetAddress sA = InetAddress.getByName("36.50.135.242");
        int port = 2208;
        String code = ";B23DCCN139;4nh8amAn";
        socket.send(new DatagramPacket(code.getBytes(), code.length(), sA, port));
        // Nhận: requestId;data
        byte[] buf = new byte[4096];
        DatagramPacket nhan = new DatagramPacket(buf, buf.length);
        socket.receive(nhan);
        String received = new String(nhan.getData(), 0, nhan.getLength()).trim();
        String[] parts = received.split(";", 2);
        String requestId = parts[0];
        String data = parts[1];
        // Tách cặp key=value, giải mã URL
        ArrayList<String[]> ds = new ArrayList<String[]>();
        for (String pair : data.split("&")) {
            if (pair.isEmpty()) continue;
            String[] kv = pair.split("=", 2);
            String key = URLDecoder.decode(kv[0], "UTF-8");
            String value = kv.length > 1 ? URLDecoder.decode(kv[1], "UTF-8") : "";
            ds.add(new String[]{key, value});
        }
        // Sắp xếp key tăng dần theo từ điển
        ds.sort((x, y) -> x[0].compareTo(y[0]));
        StringBuilder sb = new StringBuilder(requestId);
        for (String[] kv : ds) sb.append(";").append(kv[0]).append("=").append(kv[1]);
        // Gửi: requestId;key=value;key=value
        byte[] gui = sb.toString().getBytes("UTF-8");
        socket.send(new DatagramPacket(gui, gui.length, sA, port));
        socket.close();
    }
}
