// Ejercicio propuesto #13

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorCompra, valorPagar, porDescuento = 0;
        String color;

        System.out.print("Ingrese el valor de la compra: ");
        valorCompra = entrada.nextDouble();

        System.out.print("Ingrese el color de la bolita: ");
        color = entrada.next();

        switch (color){
            case "verde":
                porDescuento = 10;
                break;
            case "amarillo":
                porDescuento = 25;
                break;
            case "azul":
                porDescuento = 50;
                break;
            case "rojo":
                porDescuento = 100;
                break;

        }

        valorPagar = valorCompra - valorCompra*(porDescuento/100);
        System.out.println("El cliente debe pagar: $" + valorPagar);

    }
}
