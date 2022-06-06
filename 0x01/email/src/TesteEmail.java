

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TesteEmail {

    @Test
    public void testar_email_com_arroba() {
        Assertions.assertTrue(Pessoa.emailValid("email_teste@dominio.com.br"));
    }

    @Test
    public void testar_email_sem_arroba() {
        Assertions.assertTrue(Pessoa.emailValid("email_testedominio.com.br"));
    }

    @Test
    public void testar_email_mais_50_caracteres() {
        boolean result = Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br");
        int valor = result ? 0 : 1;
        Assertions.assertEquals(0, valor);
    }
}
