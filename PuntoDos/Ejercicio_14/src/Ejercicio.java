// Ejercicio propuesto #14

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double ventDep1=0, ventDep2=0, ventDep3=0, salario=0, totalVentas=0, porcVentas = 0.33;
        double salario1 = 0, salario2 = 0, salario3=0;

        System.out.print("Ingrese las ventas del departamente uno: ");
        ventDep1 = entrada.nextDouble();
        System.out.print("Ingrese las ventas del departamente dos: ");
        ventDep2 = entrada.nextDouble();
        System.out.print("Ingrese las ventas del departamente tres: ");
        ventDep3 = entrada.nextDouble();
        System.out.print("Ingrese el salario que reciben los vedenddores por depatarmento: ");
        salario = entrada.nextDouble();

        // Calculos

        totalVentas = ventDep1 + ventDep2 + ventDep3;
        porcVentas *= totalVentas;

        if (ventDep1 > porcVentas) {
            salario1 = salario + 0.2*salario;
        } else {
            salario1 = salario;
        }
        if (ventDep2 > porcVentas) {
            salario2 = salario + 0.2*salario;
        } else {
            salario2 = salario;
        }
        if (ventDep3 > porcVentas) {
            salario3 = salario + 0.2*salario;
        } else {
            salario3 = salario;
        }

        System.out.println("Información de los Salarios");
        System.out.println("Salario vendedores depto. 1: " + salario1);
        System.out.println("Salario vendedores depto. 2: " + salario2);
        System.out.println("Salario vendedores depto. 3: " + salario3);

    }
}
