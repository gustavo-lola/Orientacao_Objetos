package Lista06;

import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a opção que você deseja");
        int opc = scanner.nextInt();

        if(opc == 1){
            System.out.println("Voce digitou a opcao 1");
            new retangulo();
        }
        if( opc == 2){
            System.out.println("voce escolheu a opcao 2");
           new area();
        }
        if(opc == 3){
            System.out.println("voce escolheu a opcao 3");
            new calcularArea();
        }
    }
}
