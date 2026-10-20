public class Main {
    public static void main(String[] args) {
        Servicio servicio = new Servicio();
        System.out.println("login con contraseña");
        servicio.login(new AuthPassword(), "martin" , "12345");
        servicio.login(new AuthPassword(), "martin" , "0000");
        System.out.println("---------------------------------");
        System.out.println("login biometrico");
        servicio.login(new AuthBiometrica(), "martin" , "correcto");
        servicio.login(new AuthBiometrica(), "martin" , "incorrecto");
        System.out.println("---------------------------------");
        System.out.println("login con oauth");
        servicio.login(new AuthToken(), "martin" , "ABC123");
        servicio.login(new AuthToken(), "martin" , "Error");

    }
}
