package exercicios;

import java.util.Scanner;


public class Exercicio33 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Insira o valor da casa, o seu salário atual e em quantos anos pretende quitar: ");
        Double casa = scan.nextDouble();
        Double salario = scan.nextDouble();
        Double anos = scan.nextDouble();

        double porcentagem = (salario*(30.0/100.0));

        boolean condicao = (porcentagem) > (casa/(anos*12));

        if (condicao) {
            System.out.printf("""
                    <- Empréstimo Aprovado ->\s
                    Valo do ben: R$%.2f\s
                    Salário do Pagante: R$%.2f\s
                    Anos para Quitação: %.1f\s
                    Valor máximo da Parcela: R$%.2f\s""", casa, salario, anos, porcentagem);

        } else {
            System.out.printf("""
                    <- Empréstimo Negado ->\s
                    Valo do ben: R$%.2f\s
                    Salário do Pagante: R$%.2f\s
                    Anos para Quitação: %.1f\s
                    Valor máximo da Parcela: R$%.2f\s""", casa, salario, anos, porcentagem);

        }
    }
}