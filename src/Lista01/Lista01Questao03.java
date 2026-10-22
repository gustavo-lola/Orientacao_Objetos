package Lista01;

import java.util.Locale;
import java.util.Scanner;

public class Lista01Questao03 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double somaAlturas = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a altura da pessoa " + i + " : ");
            double altura = scanner.nextDouble();
            somaAlturas += altura;
        }

        double media = somaAlturas / 3;

        System.out.printf("A média das alturas é: %.2f metros%n", media);

        scanner.close();
    }
}
