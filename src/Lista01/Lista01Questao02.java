package Lista01;

import java.util.Scanner;

public class Lista01Questao02 {
     static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Digite um numero: ");
         int par_ou_impar = sc.nextInt();

         if(par_ou_impar % 2 == 0){
             System.out.println("é par");
         }else{
             System.out.println("é impar");
         }
         sc.close();
    }
}
