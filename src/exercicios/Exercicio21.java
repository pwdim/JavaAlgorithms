package exercicios;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um ano: ");
        Integer ano = scan.nextInt();

        if (ano % 4 != 0 || ano % 400 != 0 || ano % 100 != 0) {
            System.out.printf("%d não é bissexto!", ano);
        } else {
            System.out.printf("%d é um ano bissexto!", ano);
        }

        scan.close();

    }

}
