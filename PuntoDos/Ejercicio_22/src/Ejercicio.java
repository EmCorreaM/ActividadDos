// Ejercicio propuesto #22

import java.util.Scanner;
import java.util.SplittableRandom;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int horasTraMes = 0;
        double salarioHora = 0, salario = 0;

        System.out.println("Información del empleado:");
        System.out.print("Ingrese el nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese el salario por hora: ");
        salarioHora = entrada.nextDouble();
        System.out.print("Ingrese el número de horas trabajadas al mes: ");
        horasTraMes = entrada.nextInt();

        salario = horasTraMes * salarioHora;

        if (salario > 450000) {
            System.out.println("El nombre del trabajador es: " + nombre);
            System.out.println("El salario es: $" + salario );
        } else {
            System.out.println("El nombre del trabajador es: " + nombre);
        }


    }
}
