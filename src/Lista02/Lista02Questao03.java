package Lista02;

import java.util.Scanner;

public class Lista02Questao03 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaAltura = 0;
        int totalPessoas = 10;

        for (int i = 0; i <= totalPessoas ; i++) {
            System.out.println("Digite a altura da pessoa: " + i);
            double altura = scanner.nextDouble();

            somaAltura += altura;
        }
            double media = somaAltura / totalPessoas;

        System.out.println("A media das alturas é "+ media);

        scanner.close();
        }
    }
