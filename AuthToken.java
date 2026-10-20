public class AuthToken implements MetodoAutenticacion {
    public boolean autenticar(String usuario, String token) {
        return token.equals("ABC123");
    }
}
