package exercicios;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        int n = 1;
        int somaPar = 0;
        int somaImpar = 0;
        Scanner scan = new Scanner(System.in);
        String r = "S";
        do {
            System.out.println("Insira o "+n+"º inteiro");
            Integer i = scan.nextInt();

            if ((i % 2) == 0) {
                System.out.println(i + " é par");
                somaPar++;
                n++;
            } else {
                System.out.println(i + " é impar");
                somaImpar++;
                n++;
            }
            System.out.println("Digite S pra continuar ou N pra sair");
            r = scan.next();
        } while (r.equalsIgnoreCase("S"));
        System.out.println("Quantidade de numeros pares: "+somaPar);
        System.out.println("Quantidade de numeros impares: "+somaImpar);
        scan.close();

    }
    }

