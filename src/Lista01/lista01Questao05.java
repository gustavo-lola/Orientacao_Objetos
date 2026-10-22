package Lista01;

//Questão 05: Escreva um programa que leia a base e a altura de um retângulo e retorne a
//sua área (b x h) e o seu perímetro (2b + 2h).

import java.util.Scanner;

public class lista01Questao05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base: " );
        double base = scanner.nextDouble();

        System.out.println("digite o valor da altura: ");
        double altura = scanner.nextDouble();

        System.out.println(altura * base);
        System.out.println(2 * base + 2 * altura);
    }
}
