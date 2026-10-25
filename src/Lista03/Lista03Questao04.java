package Lista03;

import java.util.Scanner;

public class Lista03Questao04 {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite o valor do número " + (i + 1) + ":");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Valores na ordem inversa:");

        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        scanner.close();
    }
}