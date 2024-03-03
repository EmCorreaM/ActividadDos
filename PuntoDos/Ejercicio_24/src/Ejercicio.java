// Ejercicio propuesto #24

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pesoA = 0, pesoB = 0, pesoC = 0;

        System.out.print("Ingrese el peso de la esfera A: ");
        pesoA = entrada.nextDouble();

        System.out.print("Ingrese el peso de la esfera B: ");
        pesoB = entrada.nextDouble();

        System.out.print("Ingrese el peso de la esfera C: ");
        pesoC = entrada.nextDouble();

        if ((pesoA > pesoB) & (pesoA > pesoC)) {
            System.out.println("La esfera A es la de mayor peso con un peso de " + pesoA);
        } else if ((pesoB > pesoA) & (pesoB > pesoC)) {
            System.out.println("La esfera B es la de mayor peso con un peso de " + pesoB);
        } else if ((pesoC > pesoA) & (pesoC > pesoB)) {
            System.out.println("La esfera C es la de mayor peso con un peso de " + pesoC);
        } else {
            System.out.println("Las esferas tienen el mismo peso");
        }
    }
}