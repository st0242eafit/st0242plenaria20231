import java.util.Scanner;
public class PrincipalString7
{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un Texto: ");
        //String message = teclado.next();
        String message = teclado.nextLine();
        int contA = 0;
        for (int i=0;i<message.length();i++) {
            char current = message.charAt(i);
            if (current == 'a') {
                contA++;
            }
        }
        System.out.println("Total aes: "+contA+" en: "+message);
        teclado.close();
    }
}
