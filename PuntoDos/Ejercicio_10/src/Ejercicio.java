// Ejercicio propuesto #10

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String num_ins, nombres;
        int estrato;
        double patrimonio, pago_matr = 50000;

        System.out.print("Ingrese su número de inscripción: ");
        num_ins = entrada.next();
        entrada.nextLine();

        System.out.print("Ingrese sus nombres: ");
        nombres = entrada.nextLine();
        System.out.print("Ingrese el valor de su patrimonio: ");
        patrimonio = entrada.nextDouble();
        System.out.print("Ingrese su estrato: ");
        estrato = entrada.nextInt();

        if ((patrimonio > 2000000) & (estrato > 3)) {
            pago_matr +=  0.03*patrimonio;
        }
        System.out.println("El estudiante con numero de inscripción " + num_ins + " y nombre " + nombres + " debe pagar: $" + pago_matr);

    }
}
