package Lista02;

import java.util.Scanner;

public class Lista02Questao04 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maiorNumero = 0;
        double leitura = 10;

        for (int i = 0; i <= leitura; i++) {
            System.out.println("Digite o numero que iremos avaliar qual sera o menor :");
            double numero = scanner.nextDouble();

            if(numero > maiorNumero){
                maiorNumero = numero;
            }
        }

        System.out.println("O valor do maior numero é" + maiorNumero);

        scanner.close();

    }
}