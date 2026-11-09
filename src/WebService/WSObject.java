package WebService;

import vn.medianews.EmployeeY;
import vn.medianews.ObjectService;
import vn.medianews.SoapObjectService;

import java.util.List;

public class WSObject {
    public static void main(String[] args) {
        String studentCode = "B23DCCN919";
        String qCode = "T1sudBl9";

        SoapObjectService service = new ObjectService().getSoapObjectServicePort();
        List<EmployeeY> employeeYS = service.requestListEmployeeY(studentCode, qCode);
        employeeYS.sort((a,b) -> a.getStartDate().compare(b.getStartDate()));

        service.submitListEmployeeY(studentCode, qCode, employeeYS);

    }
}
