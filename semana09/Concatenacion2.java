
public class Concatenacion2
{
    public static void main(String args[]) {
        int num1 = 2;
        int num2 = 3;
        String str1 = "num1 + num2 = ";
        String str2 = " = num1 + num2";
        System.out.println(str1 + num1 + num2);
        System  .out.println(num1 + num2 + str2);
        System.out.println(str1 + (num1 + num2));
    }
}
