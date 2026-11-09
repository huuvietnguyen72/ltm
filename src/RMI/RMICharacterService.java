package RMI;

import java.net.URI;
import java.rmi.Naming;

public class RMICharacterService {
    public static void main(String[] args) throws Exception {
        CharacterService service = (CharacterService) Naming.lookup("rmi://36.50.135.242/RMICharacterService");

        String studentCode = "B23DCCN919";
        String qCode = "8gsEWsPe";

        String s = service.requestCharacter(studentCode, qCode);
        String res = new URI(null, null, s, null).toASCIIString();

        service.submitCharacter(studentCode, qCode, res);

    }
}
