package Lista03;

import java.util.Scanner;

public class Lista03Questao03 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int aprovado = 0;
        int reprovado = 0;

        for (int i = 0 ; i < vetor.length ; i++){
            System.out.println("Digite o valor da media do aluno");
            vetor[i] = scanner.nextInt();

            if(vetor[i] >=  6){
                System.out.println("aprovado");
                aprovado++;
            } else {
                System.out.println("nao aprovado");
                reprovado++;
            }

            System.out.println("total de aprovados" + aprovado);
            System.out.println("Total de reprovados" + reprovado);
        }

    }
}
