import java.util.Scanner;

public class PrincipalArreglos3
{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] arr_int = new int[3];
        
        for (int i=0;i<3;i++) {
            System.out.println("Ingrese el valor de la posición "+i);
            arr_int[i] = scan.nextInt();
        }
        for (int i=0;i<3;i++) {
            System.out.println(arr_int[i]);
        }
    }
}
