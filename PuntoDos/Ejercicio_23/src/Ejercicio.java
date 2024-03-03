// Ejercicio propuesto #23

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a = 0, b = 0, c = 0, d = 0, x1 = 0, x2 = 0;

        System.out.print("Ingrese el valor de A: ");
        a = entrada.nextDouble();

        System.out.print("Ingrese el valor de B: ");
        b = entrada.nextDouble();

        System.out.print("Ingrese el valor de C: ");
        c = entrada.nextDouble();

        d = b * b - 4 * a * c;

        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Las soluciones son:" );
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);

        } else if (d == 0) {
            x1 = -b / (2 * a);
            System.out.println("La solución x1 y x2: " + x1);
        } else {
            System.out.println("La ecuación no tiene soluciones reales");
        }


    }
}
