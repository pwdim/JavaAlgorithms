package exercicios;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int contador = 1;
        int limite = 20;
        int maiorQue5 = 0;
        int dividePorTres = 0;

        ArrayList<Integer> mais5 = new ArrayList<>();
        ArrayList<Integer> divide3 = new ArrayList<>();


        while (contador <= limite) {
            System.out.print("Número: " + contador+"º ");
            int n = random.nextInt(11);
            if (n > 5 && (n%3) == 0) {
                System.out.print("["+n+"] ");
                maiorQue5++;
                dividePorTres++;
                mais5.add(n);
                divide3.add(n);

            } else if ((n % 3) == 0) {
                System.out.print("["+n+"] ");
                dividePorTres++;
                divide3.add(n);
            } else if (n > 5) {
                System.out.print("["+n+"] ");
                maiorQue5++;
                mais5.add(n);
            } else {
                System.out.print("["+n+"] ");
            }
            contador++;
        }
        System.out.println("\nNumeros maiores que 5: "+maiorQue5 +" "+ mais5);
        System.out.println("Numeros divisiveis por 3: "+dividePorTres +" "+ divide3);

    }
}
