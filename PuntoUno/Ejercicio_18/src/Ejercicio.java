// Ejercicio #18

import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String codEmpleado, nombres;
        double horasMes = 0, valor_hora = 0, retFuente = 0, salBruto =0, salNeto = 0;

        System.out.print("Código de empleado: ");
        codEmpleado = entrada.nextLine();

        System.out.print("Nombres: ");
        nombres = entrada.nextLine();

        System.out.print("Horas trabajadas al mes: ");
        horasMes = entrada.nextDouble();

        System.out.print("Valor por hora: ");
        valor_hora = entrada.nextDouble();

        System.out.print("Porcentaje de retención en la fuente: ");
        retFuente = entrada.nextDouble();

        salBruto = valor_hora * horasMes;
        salNeto = salBruto - salBruto*(retFuente/100);


        System.out.println("Información del empleado: ");
        System.out.println("Código: " + codEmpleado);
        System.out.println("Nombres: " + nombres);
        System.out.println("Salario Bruto: " + salBruto);
        System.out.println("Salario Neto: " + salNeto);

    }
}
