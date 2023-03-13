import java.util.Scanner;

public class ArreglosEjercicio1
{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese tamaño del arreglo: ");
        int num = scan.nextInt();
        int[] arr_int = new int[num];
        for (int i=0;i<num;i++) {
            arr_int[i] = 5;
        }
        for (int i=0;i<num;i++) {
            System.out.println(arr_int[i]);
        }
    }
}
