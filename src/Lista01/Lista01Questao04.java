package Lista01;

import java.util.Scanner;

public class Lista01Questao04 {
    static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o primerio numero");
        double num1 = scanner.nextByte();
        System.out.println("Digite o segundo numero");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("O maio e " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior e " + num2);
        } else {
            System.out.println("iguais");
        }

        scanner.close();
    }

    // identidade: cada objeto e unico nao e exatamente um id
    // caracteristica: cada objeto pode assumir nova atribuicoes como a cor ir modificando
    // objeto: intansciar o objeto
}