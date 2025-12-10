package exercicios;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro Valor: ");
        int valor1 = scan.nextInt();
        System.out.println("Digite o último Valor: ");
        int valor2 = scan.nextInt();
        System.out.println("Digite o incremento: ");
        int incremento = scan.nextInt();

        while (valor2 >= valor1) {
            System.out.print(valor1 + " ");
            valor1+=incremento;
        }
        System.out.println("Acabou!");
        scan.close();
    }
}
