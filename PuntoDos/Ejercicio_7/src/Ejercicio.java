// Ejercicio propuesto #7

import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b;

        System.out.print("Ingrese el valor de A: ");
        a = entrada.nextDouble();

        System.out.print("Ingrese el valor de B: ");
        b = entrada.nextDouble();

        if (a > b){
            System.out.println("A es mayor que B");
        } else if (a < b) {
            System.out.println("A es menor que B");

        }else{
            System.out.println("A es igual B");
        }
    }
}
