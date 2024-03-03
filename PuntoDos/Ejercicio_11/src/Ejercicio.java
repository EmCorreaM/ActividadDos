
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, mayor = 0 ;

        System.out.print("Ingrese el número 1: ");
        num1 = entrada.nextInt();
        System.out.print("Ingrese el número 2: ");
        num2 = entrada.nextInt();
        System.out.print("Ingrese el número 3: ");
        num3 = entrada.nextInt();

        if ((num1 > num2) & (num1 > num3)){
            mayor = num1;
        } else{
            if (num2 > num3) {
                mayor = num2;
            } else {
                mayor = num3;
            }

        }

        System.out.println("El valor mayor entre " +num1 +", " + num2 + ", " + num3 +" es: " + mayor);
    }
}
