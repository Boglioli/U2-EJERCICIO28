public class Servicio {
    public void login(MetodoAutenticacion metodo, String usuario, String clave) {
        if (metodo.autenticar(usuario, clave)){
            System.out.println("acceso permitido");
        } else {
            System.out.println("acceso denegado");
        }
    }
}
