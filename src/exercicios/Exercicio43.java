package exercicios;

import java.util.Scanner;

public class Exercicio43 {

    public static void main(String[] args) {
        int contador = 30;


        while (contador >= 1) {
            double divisao = contador%4;
            if (divisao != 0) {
                System.out.print(contador + " ");
            } else {
                System.out.print("[" + contador + "] ");
            }

            contador-=1;

        }
    }



}
