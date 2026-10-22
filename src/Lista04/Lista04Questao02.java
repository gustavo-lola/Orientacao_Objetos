package Lista04;

import java.util.Scanner;

public class Lista04Questao02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite a opcao (1 - Soma, 2 - Subtracao, 3 - Multiplicacao, 4 - Divisao):");
            int opc = scanner.nextInt();
            System.out.println("Digite o primeiro numero:");
            double num1 = scanner.nextDouble();

            System.out.println("Digite o segundo numero:");
            double num2 = scanner.nextDouble();

            switch (opc) {
                case 1:
                    System.out.println("Resultado da soma" + soma(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado da subtracao" + sub(num1, num2));
                    break;

                case 3:
                    System.out.println("Resultado da multiplicacao" + mult(num1, num2));
                    break;

                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado da divisao: " + div(num1, num2));
                    } else {
                        System.out.println("Erro: Nao e possivel dividir por zero.");
                    }
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }
    public static double soma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double sub(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double mult(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double div(double numero1, double numero2) {
        return numero1 / numero2;
    }
}