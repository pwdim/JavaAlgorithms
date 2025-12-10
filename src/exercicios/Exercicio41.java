package exercicios;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        int contador = 105;

        while (contador >= 1) {
            contador-=5;
            System.out.print(contador + " ");
        }
        System.out.println("Acabou!");
    }
}
