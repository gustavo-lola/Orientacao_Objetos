package Lista01;
import java.util.Scanner;

public class Lista01Questao01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a data de nascimento do ususario :");
        int anoNascimento = input.nextInt();

        System.out.println("Digite o ano atual :");
        int anoAtual = input.nextInt();

        int idade = idadeAtual(anoNascimento, anoAtual);
        System.out.println("A idade do ususario é: " + idade + "anos.");

        input.close();
    }
    public static int idadeAtual ( int anoNascimento, int anoAtual){
        return anoAtual - anoNascimento;
    }
}
