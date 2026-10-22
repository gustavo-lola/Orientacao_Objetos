package Lista01;

import java.util.Scanner;

public class Lista01Questao06 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do seu peso");
        double peso = scanner.nextDouble();

        System.out.println("Digite o valor da sua altura");
        double altura = scanner.nextDouble();

        System.out.println("O valor do seu imc é:" + (peso / (altura * altura)));

    }
}
