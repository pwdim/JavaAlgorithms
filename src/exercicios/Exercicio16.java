package exercicios;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Há quantos anos você fuma? ");
        Double anos = scan.nextDouble();

        System.out.println("Quantos cigarros você fuma por dia? ");
        Double cigarrospordia = scan.nextDouble();

        Double totalDias = anos * 365;

        Double totalCigarros = cigarrospordia * totalDias;

        Double minutosPerdidos = totalCigarros * 10;

        Double diasPerdidos = (minutosPerdidos/60)/24;

        System.out.printf("Você perdeu %.2f dias de vida", diasPerdidos);
    }
}