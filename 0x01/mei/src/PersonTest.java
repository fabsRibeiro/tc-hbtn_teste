

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class PersonTest {

    @BeforeAll
    public static void setup(){
        Person pessoa = new Person();
        pessoa.setName("Paul");
        pessoa.setSurname("McCartney");
        pessoa.setBirthDate(new Date(2000));
        pessoa.setAnotherCompanyOwner(true);
        pessoa.setPensioner(true);
        pessoa.setPublicServer(true);
    }

    @Test
    public void show_full_name(){
        String nomeFull = Person.fullname();
        Assertions.assertEquals("Paul McCartney", nomeFull);
    }

    @Test
    public void test_calculateYearlySalary(){
        double salarioAtual = Person.calculateYearlySalary(1200);
        Assertions.assertEquals(14400, salarioAtual);
    }

    @Test
    public void person_is_MEI(){
        Person pessoa2 = new Person();
        pessoa2.setSalary(6501);
        pessoa2.setBirthDate(new Date(1990));
        pessoa2.setPensioner(false);
        pessoa2.setPublicServer(false);
        pessoa2.setAnotherCompanyOwner(false);

        Assertions.assertTrue(pessoa2.isMEI());
    }

    @Test
    public void person_is_not_MEI(){
        Person pessoa3 = new Person();
        pessoa3.setSalary(6499);
        pessoa3.setBirthDate(new Date(2003));
        pessoa3.setPensioner(true);
        pessoa3.setPublicServer(true);
        pessoa3.setAnotherCompanyOwner(true);

        Assertions.assertFalse(pessoa3.isMEI());
    }
}
