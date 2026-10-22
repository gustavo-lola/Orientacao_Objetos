package Lista06;

import java.util.Scanner;

public class retangulo {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        double base = scanner.nextDouble();

        System.out.println("Digite o valor da altura");
        double altura = scanner.nextDouble();

        double Area = base * altura;
        double perimetro  = 2 * base * 2 * altura;

        System.out.println("esse é o valor do retangulo");
        System.out.println(Area);
        System.out.println("Esse é o valor do perimetro");
        System.out.println(perimetro);

    }
}
