
public class PrincipalString2
{
    public static void main(String args[]) {
        String msg = "Bienvenida(o)s a la Plenaria";
        System.out.println(msg);
        cambio(msg);
        System.out.println(msg);
    }

    public static void cambio(String m) {
        m = "bienvenido a EAFIT";
    }
}
