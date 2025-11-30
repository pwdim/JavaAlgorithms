package exercicios;

import java.util.Scanner;

public class Exercicio25 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        // a < b + c
        // b  < a + c
        // c < b + a

        System.out.println("Insira o segmento A (em cm): ");
        Double segmentoA = scan.nextDouble();

        System.out.println("Insira o segmento B (em cm): ");
        Double segmentoB = scan.nextDouble();

        System.out.println("Insira o segmento C (em cm): ");
        Double segmentoC = scan.nextDouble();

        Double somaA = segmentoB+segmentoC;
        Double somaB = segmentoA+segmentoC;
        Double somaC = segmentoA+segmentoB;

        if(segmentoA < somaA && segmentoB < somaB && segmentoC < somaC) {
            System.out.println("Isso é um triângulo!");
        } else {
            System.out.println("Não é um triângulo!");
        }
        scan.close();
    }
}
