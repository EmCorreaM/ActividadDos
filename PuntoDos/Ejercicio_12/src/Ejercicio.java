// Ejercicio propuesto #12

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombres;
        int horTraba, horasExtra, horExtraEx8;
        double valorHora, salario;

        System.out.print("Ingrese los nombres: ");
        nombres = entrada.nextLine();
        System.out.print("Ingrese el numero de horas trabajadas: ");
        horTraba = entrada.nextInt();
        System.out.print("Ingrese el valor normal por hora: ");
        valorHora = entrada.nextDouble();

        if (horTraba > 40) {
            horasExtra = horTraba - 40;
            if (horasExtra > 8) {
                horExtraEx8 = horasExtra - 8;
                salario = 40*valorHora + 16*valorHora + horExtraEx8*3*valorHora;
            } else {
                salario = 40*valorHora + horasExtra*2*valorHora;
            }
        } else {
            salario = valorHora*horTraba;
        }

        System.out.println("El trabajador " + nombres +" devengó: $" + salario);
    }

}
