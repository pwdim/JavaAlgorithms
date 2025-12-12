package exercicios;

import java.util.Scanner;

public class Exercicio51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int limite = 8;
        int contador = 1;
        double total = 0;

        do {
            System.out.println("Insira o preço do "+contador+ "ª produto: ");
            Double preco = scan.nextDouble();
            contador++;
            total +=preco;
        } while (contador <= limite);
        System.out.printf("\nTotal a Pagar: R$%.2f", total);
    }
}
