
import org.junit.jupiter.api.Test;

public class Pessoa {

    @Test
    public static boolean emailValid(String email){
        if(email.contains("@") || email.length() <= 50){
            return true;
        }
        return false;
    }
}
