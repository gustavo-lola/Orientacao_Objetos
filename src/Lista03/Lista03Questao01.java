package Lista03;

import java.util.Scanner;

public class Lista03Questao01 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor do numero");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Os numeros digitados sao:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}
