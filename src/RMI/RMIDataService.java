package RMIexample;

import RMI.DataService;

import java.rmi.Naming;
import java.util.ArrayList;
import java.util.List;

public class RMIData {
    public static void main(String[] args) throws Exception {
        DataService service = (DataService) Naming.lookup("rmi://36.50.135.242/RMIDataService");

        String studentCode = "B23DCCN919";
        String qCode = "7Le7CsWr";

        Object object = service.requestData(studentCode, qCode);

        int[] a = toIntArray(object);

        List<Integer> peaks = new ArrayList<>();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean leftOk  = (i == 0)     || a[i] > a[i - 1];
            boolean rightOk = (i == n - 1) || a[i] > a[i + 1];
            if (n > 1 && leftOk && rightOk) {
                peaks.add(i + 1);
            }
        }
        service.submitData(studentCode, qCode, peaks);

    }

    static int[] toIntArray(Object object){
        if(object instanceof int[]){
            return (int[]) object;
        }

        if(object instanceof Integer[]){
            Integer[] arr = (Integer[]) object;
            int[] r = new int[arr.length];
            for (int i=0; i< arr.length; i++) r[i] = arr[i];
            return r;
        }
        if(object instanceof List){
            List<?> list = (List<?>) object;
            int[] r = new int[list.size()];
            for(int i=0; i<r.length; i++) r[i] = ((Number) list.get(i)).intValue();
            return r;
        }
        throw new IllegalArgumentException("Kieu khong ho tro: " + object.getClass());
    }
}
