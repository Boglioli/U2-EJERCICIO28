import java.util.Locale;

public class AuthBiometrica implements MetodoAutenticacion {
    public boolean autenticar(String usuario, String huella) {
        return huella.equals("correcta");
    }
}
