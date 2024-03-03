// Ejercicio resuelto #15

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso_a = 0, peso_b = 0, peso_c = 0, peso_d;

        System.out.print("Ingrese el peso de la esfera A: ");
        peso_a = entrada.nextDouble();
        System.out.print("Ingrese el peso de la esfera B: ");
        peso_b = entrada.nextDouble();
        System.out.print("Ingrese el peso de la esfera C: ");
        peso_c = entrada.nextDouble();
        System.out.print("Ingrese el peso de la esfera D: ");
        peso_d = entrada.nextDouble();

        if ((peso_a == peso_b) & (peso_a == peso_c)){
            System.out.print("La esfera D es la diferente ");
            if (peso_d > peso_a) {
                System.out.println("y es de mayor peso");
            } else {
                System.out.println("y es de menor peso");
            }
        } else {
            if ((peso_a == peso_b) & (peso_a == peso_d)){
                System.out.print("La esfera C es la diferente ");
                if (peso_c > peso_a) {
                    System.out.println("y es de mayor peso");
                } else {
                    System.out.println("y es de menor peso");
                }
            } else {
                if ((peso_a == peso_c) & (peso_a == peso_d)) {
                    System.out.print("La esfera B es diferente" );
                    if (peso_b > peso_d) {
                        System.out.println("y es de mayor peso");
                    } else {
                        System.out.println("y es de menor peso");
                    }
                } else {
                    System.out.print("La esfera A es la diferente ");
                    if (peso_a > peso_b) {
                        System.out.println("y es de mayor peso");
                    } else {
                        System.out.println("y es de menor peso");
                    }
                }
            }
        }
    }
}
