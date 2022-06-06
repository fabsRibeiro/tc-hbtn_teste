

public class Person {

    public String usuario;
    public String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static boolean checkUser(String usuario){
        if(usuario.length() <= 8 && !usuario.matches("(?=.*[}{,.^?~=+\\-_\\/*\\-+.\\|])(?=.*[a-zA-Z])(?=.*[0-9]).{8,}")){
            return true;
        }
        return false;
    }

    public static boolean checkPassword(String senha){
        if(senha.matches("(?=.*[}{,.^?~=+\\-_\\/*\\-+.\\|])(?=.*[a-zA-Z])(?=.*[0-9]).{8,}")){
            return true;
        }
        return false;
    }
}
