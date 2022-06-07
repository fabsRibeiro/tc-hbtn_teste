package password.src;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class PersonTest {

    @BeforeAll
    public static void setup(){
        new Person();
    }

    @ParameterizedTest(name = "Validar usuario {0}")
    @ValueSource(strings = {"PaulMcCartney2", "NeilArms2"})
    public void check_user_valid(String valor){
        Person p = new Person();
        p.setUsuario(valor);
        Assertions.assertFalse(Person.checkUser(valor));
    }

    @ParameterizedTest(name = "Validar usuario {0}")
    @ValueSource(strings = {"Paul#McCartney", "Neil@Arms"})
    public void check_user_not_valid(String valor){
        Person p = new Person();
        p.setUsuario(valor);
        Assertions.assertFalse(Person.checkUser(valor));
    }

    @ParameterizedTest(name = "Validar senha {0}")
    @ValueSource(strings = {"123456789", "#$%1234"})
    public void does_not_have_letters(String valor){
        Person p = new Person();
        p.setSenha(valor);
        Assertions.assertFalse(Person.checkPassword(valor));
    }

    @ParameterizedTest(name = "Validar senha {0}")
    @ValueSource(strings = {"Abcabcdefgh@", "#hbtn@%tc"})
    public void does_not_have_numbers(String valor){
        Person p = new Person();
        p.setSenha(valor);
        Assertions.assertFalse(Person.checkPassword(valor));
    }

    @ParameterizedTest(name = "Validar senha {0}")
    @ValueSource(strings = {"Abc@123", "12$@hbt"})
    public void does_not_have_eight_chars(String valor){
        Person p = new Person();
        p.setSenha(valor);
        Assertions.assertFalse(Person.checkPassword(valor));
    }

    @ParameterizedTest(name = "Validar senha {0}")
    @ValueSource(strings = {"abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123"})
    public void check_password_valid(String valor){
        Person p = new Person();
        p.setSenha(valor);
        Assertions.assertFalse(Person.checkPassword(valor));
    }
}
