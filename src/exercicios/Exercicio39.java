package exercicios;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        int contador = 10;

        do {
            System.out.print(contador + " ");
            contador--;
        } while (contador >= 3);
        System.out.println("Acabou!");
    }
}
