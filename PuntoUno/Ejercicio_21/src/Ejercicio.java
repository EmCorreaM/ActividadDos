// Ejercicio 21

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado_a, lado_b, lado_c, perimetro, semP, area;

        System.out.print("Ingrese la longitud del lado a: ");
        lado_a = entrada.nextDouble();
        System.out.print("Ingrese la longitud del lado b: ");
        lado_b = entrada.nextDouble();
        System.out.print("Ingrese la longitud del lado c: ");
        lado_c = entrada.nextDouble();

        // El area se calculó con la formula de Heron

        perimetro = lado_a + lado_b + lado_c;
        semP = perimetro/2;
        area = Math.sqrt(semP*(semP - lado_a)*(semP - lado_b)*(semP - lado_c));

        System.out.println("\nCalculos del triángulo");
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Semiperímetro¨: " + semP);
        System.out.println("Área: " + area);

    }
}
