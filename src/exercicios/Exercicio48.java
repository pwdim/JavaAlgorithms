package exercicios;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        int n = 1;
        int soma = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Insira o "+n+"º inteiro");
            Integer i = scan.nextInt();
            n++;
            soma+=i;

        } while (n <= 7);
        System.out.println(soma);

    }
}
