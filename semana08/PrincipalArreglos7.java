
public class PrincipalArreglos7
{
    public static void main(String args[]) {
        
        int[] edades = PrincipalArreglos7.arregloDePrueba();
        System.out.println(edades[2]);
    }

    public static int[] arregloDePrueba() {
        int[] arr_edades = new int[3];
        arr_edades[0] = 18;
        arr_edades[1] = 25;
        arr_edades[2] = 30;
        return arr_edades;
    }
}

