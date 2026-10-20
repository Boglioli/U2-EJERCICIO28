public class AuthPassword implements MetodoAutenticacion {
    public boolean autenticar(String usuario, String clave) {
        return usuario.equals("martin") && clave.equals("12345");
    }

}
