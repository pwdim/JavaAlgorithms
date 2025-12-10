package exercicios;

import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro Valor: ");
        Integer primeiro = scan.nextInt();

        System.out.println("Digite o último Valor: ");
        Integer ultimo = scan.nextInt();

        System.out.println("Digite o incremento: ");
        Integer incremento = scan.nextInt();

        while (primeiro < ultimo) {
            System.out.print(primeiro + " ");
            primeiro += incremento;
        }

        while (ultimo < primeiro) {
            System.out.print(ultimo + " ");
            ultimo += incremento;
        }
        System.out.println("Acabou!");
        scan.close();
    }
}
