package RMIexample;

import RMI.ObjectService;
import RMI.TicketSla;

import java.rmi.Naming;

public class RMIObject {
    public static void main(String[] args) throws Exception {
        ObjectService service = (ObjectService) Naming.lookup("rmi://36.50.135.242/RMIObjectService");

        String studentCode = "B23DCCN919";
        String qCode = "madOl8ud";

        TicketSla ticketSla = (TicketSla) service.requestObject(studentCode, qCode);

        String priority = ticketSla.getPriority();
        int openedHoursAgo = ticketSla.getOpenedHoursAgo();

        boolean breached;
        if ("CRITICAL".equals(priority) && openedHoursAgo > 2) breached = true;
        else if ("HIGH".equals(priority) && openedHoursAgo > 8) breached = true;
        else if ("MEDIUM".equals(priority) && openedHoursAgo > 24) breached = true;
        else if ("LOW".equals(priority) && openedHoursAgo > 72) breached = true;
        else breached = false;
        ticketSla.setBreached(breached);

        String action;
        if (!breached) action = "MONITOR";
        else if ("CRITICAL".equals(priority) || openedHoursAgo > 96) action = "ESCALATE_L2";
        else action = "ESCALATE_L1";
        ticketSla.setAction(action);

        System.out.printf("%s;%s;%d;%b;%s%n",
                ticketSla.getTicketId(), ticketSla.getPriority(), ticketSla.getOpenedHoursAgo(),
                ticketSla.isBreached(), ticketSla.getAction());

        // Gửi lại chính đối tượng TicketSla đã cập nhật
        service.submitObject(studentCode, qCode, ticketSla);
    }
}
