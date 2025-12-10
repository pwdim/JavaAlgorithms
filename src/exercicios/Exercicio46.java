package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio46 {
    public static void main(String[] args) {
        int soma = 0;
        int atual = 6;
        int max = 100;
        while (atual <= max) {
            soma +=atual;
            atual +=2;
        }

        System.out.println(soma);
    }
}
