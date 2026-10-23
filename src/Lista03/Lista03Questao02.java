package Lista03;

import java.util.Arrays;
import java.util.Scanner;

public class Lista03Questao02 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite o valor do numero");
            vetor[i] = scanner.nextInt();
        }

        int menor = Arrays.stream(vetor).min().orElse(0);
        int maior = Arrays.stream(vetor).max().orElse(0);
        double media = (double) Arrays.stream(vetor).sum() / vetor.length;

        System.out.println("Este é o valor do menor" + menor);
        System.out.println("Este é o valor do maior" + maior);
        System.out.println("Este é o valor da media" +  media);

    }
}
