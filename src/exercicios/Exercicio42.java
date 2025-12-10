package exercicios;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int i = scan.nextInt();
        int contador = 1;

        while (contador <= i) {
            System.out.print(contador + " ");
            contador+=1;
        }
        System.out.println("Acabou!");
        scan.close();

    }
}
