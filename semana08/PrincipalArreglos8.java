
public class PrincipalArreglos8
{
    public static void main(String args[]) {

        int[] arr_edades = new int[3];
        arr_edades[0] = 18;
        arr_edades[1] = 25;

        System.out.println(arr_edades[2]);
        
        int[] arr_edades2 = PrincipalArreglos8.cambioRaro(arr_edades);
        System.out.println(arr_edades2[0]);
        System.out.println(arr_edades[0]);
        System.out.println(arr_edades[2]);
    }

    public static int[] cambioRaro(int[] edades) {

        edades[0] = 15;
        edades[2] = 50;

        return edades;
    }
}

