package Lista04;

import java.util.Scanner;

public class Lista04Questao03 {

    public static double calcularImposto(double salario) {
        double imposto = 0;

        while (true) {
            if (salario <= 2000.00) {
                imposto = 0;
            } else if (salario <= 3500.00) {
                imposto = salario * 0.15;
            } else if (salario <= 5000.00) {
                imposto = salario * 0.22;
            } else {
                imposto = salario * 0.30;
            }

            return imposto;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe Seu Salario: R$ ");
        double salario = scanner.nextDouble();

        double valorImposto = calcularImposto(salario);

        System.out.printf("O imposto a ser pago é: R$ %.2f%n", valorImposto);

    }
}