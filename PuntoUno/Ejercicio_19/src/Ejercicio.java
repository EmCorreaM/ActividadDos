// Ejercicio 19

import  java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado = 0, perimetro = 0, altura = 0, area = 0;

        System.out.println("Triángulo equilatero");
        System.out.print("Ingrese la longitud del lado: ");
        lado = entrada.nextDouble();

        // Calculos
        perimetro = lado*3;
        altura = Math.sqrt(Math.pow(lado, 2) - Math.pow(lado/2, 2));
        area = (Math.pow(lado, 2)*Math.sqrt(3))/(4);

        // Mostrar información
        System.out.println("\nCalculos del triángulo equilatero");
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + area);
    }
}
