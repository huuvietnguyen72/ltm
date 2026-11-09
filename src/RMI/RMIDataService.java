package RMI;

import java.rmi.Naming;
import java.util.ArrayList;
import java.util.List;

public class RMIDataService {
    public static void main(String[] args) throws Exception {
        DataService service = (DataService) Naming.lookup("rmi://36.50.135.242/RMIDataService");

        String studentCode = "B23DCCN919";
        String qCode = "7Le7CsWr";

        // Server có thể trả về int[], Integer[], List hoặc String -> xử lý tất cả
        Object raw = service.requestData(studentCode, qCode);
        List<Integer> a = new ArrayList<>();
        if (raw instanceof int[]) {
            for (int x : (int[]) raw) a.add(x);
        } else if (raw instanceof Integer[]) {
            for (Integer x : (Integer[]) raw) a.add(x);
        } else if (raw instanceof List) {
            for (Object x : (List<?>) raw) a.add(((Number) x).intValue());
        } else {
            // Bỏ dấu [ ] và khoảng trắng, ví dụ "[3, 8, 5, 10, 7]"
            String s = raw.toString().replaceAll("[\\[\\]\\s]", "");
            for (String t : s.split(",")) {
                if (!t.isEmpty()) a.add(Integer.parseInt(t));
            }
        }
        System.out.println("Data: " + a);

        // Đỉnh cục bộ: lớn hơn các phần tử kề; phần tử đầu/cuối chỉ cần lớn hơn 1 phần tử kề
        int n = a.size();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean left = (i == 0) || a.get(i) > a.get(i - 1);
            boolean right = (i == n - 1) || a.get(i) > a.get(i + 1);
            if (left && right) list.add(i + 1); // vị trí tính từ 1
        }
        System.out.println("Result: " + list);

        service.submitData(studentCode, qCode, list);
    }
}
