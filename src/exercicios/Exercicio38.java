package exercicios;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        int contador = 6;
        do {
            System.out.print(contador + " ");
            contador++;
        } while (contador >5 && contador <= 11);
        System.out.println("Acabou!");
    }
}
