package exercicios;

import java.util.Scanner;

public class Exercicio30 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        // a < b + c
        // b  < a + c
        // c < b + a

        System.out.println("Insira o segmento A, B e C (em cm): ");
        Double segmentoA = scan.nextDouble();
        Double segmentoB = scan.nextDouble();
        Double segmentoC = scan.nextDouble();

        boolean condicao1 = segmentoA < segmentoB + segmentoC;
        boolean condicao2 = segmentoB < segmentoA + segmentoC;
        boolean condicao3 = segmentoC < segmentoA + segmentoB;

        boolean equilatero = segmentoA.equals(segmentoB) && segmentoB.equals(segmentoC);
        boolean isoceles = segmentoA.equals(segmentoB)||segmentoB.equals(segmentoC)||segmentoC.equals(segmentoA);
        boolean escaleno = !segmentoA.equals(segmentoB) && !segmentoB.equals(segmentoC) && !segmentoC.equals(segmentoA);

        if (condicao1 && condicao2 && condicao3) {
            System.out.println("Os segmentos podem formar um triângulo!");

            if (equilatero) {
                System.out.println("É um triângulo equilatero!");

            } else if (isoceles) {
                System.out.println("É um triângulo isoceles");
            } else {
                System.out.println("É um triangulo escaleno");
            }

        } else {
            System.out.println("Não é possivel formar um triângulo com esses segmentos!");
        }
        scan.close();
    }
}
