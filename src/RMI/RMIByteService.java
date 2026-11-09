package RMI;

import java.rmi.Naming;
import java.util.LinkedHashMap;
import java.util.Map;

public class RMIByteService {
    public static void main(String[] args) throws Exception {
        ByteService service = (ByteService) Naming.lookup("rmi://36.50.135.242/RMIByteService");

        String studentCode = "B23DCCN919";
        String qCode = "3PAjyRe3";

        byte[] data = service.requestData(studentCode, qCode);

        LinkedHashMap<Byte, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i<data.length; i++){
            if(map.containsKey(data[i])){
                map.put(data[i], map.get(data[i]) + 1 );
            }
            else {
                map.put(data[i], 1 );
            }
        }
        byte minValue = 0;
        int minCount = Integer.MAX_VALUE;
        for(Map.Entry<Byte, Integer> x : map.entrySet()){
            if(minCount > x.getValue()){
                minCount = x.getValue();
                minValue = x.getKey();
            }
        }
        byte[] res = {minValue, (byte) minCount};
        service.submitData(studentCode, qCode, res);
    }
}
