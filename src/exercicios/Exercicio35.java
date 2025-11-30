package exercicios;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tipo de carro: ");
        String tipo = scan.nextLine();
        System.out.println("Dias: ");
        Float dias = scan.nextFloat();
        System.out.println("Km: ");
        Double km = scan.nextDouble();
        String[] validos = new String[]{"popular", "pop", "comum", "vip", "premium", "luxo"};
        boolean condicao = Arrays.asList(validos).contains(tipo);
        if (condicao) {
            if (!tipo.equalsIgnoreCase("popular") && !tipo.equalsIgnoreCase("pop") && !tipo.equalsIgnoreCase("p") && !tipo.equalsIgnoreCase("normal")) {
                if (tipo.equalsIgnoreCase("vip") || tipo.equalsIgnoreCase("premium") || tipo.equalsIgnoreCase("luxo") || tipo.equalsIgnoreCase("l")) {
                    if (km <= (double)200.0F) {
                        Double total = 0.3 * km + (double)(dias * 150.0F);
                        System.out.println("Valor total: R$" + total);
                    } else {
                        Double total = (double)0.25F * km + (double)(dias * 150.0F);
                        System.out.println("Valor total: R$" + total);
                    }
                }
            } else if (km <= (double)100.0F) {
                Double total = km * 0.2 + (double)(dias * 90.0F);
                System.out.println("Valor total: R$" + total);
            } else {
                Double total = km * 0.1 + (double)(dias * 90.0F);
                System.out.println("Valor total: R$" + total);
            }
        } else {
            System.out.println("Tipo inválido");
        }

    }
}
