package exercicios;

import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        int soma = 0;
        int atual = 500;

        while (atual >= 0) {
            soma += atual;
            atual -= 50;
        }
        System.out.println(soma);
    }
}