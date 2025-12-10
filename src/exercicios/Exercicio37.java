package exercicios;

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o seu genero: ");
        String genero = scan.nextLine();
        System.out.println("Insira o seu salário: ");
        double salario = scan.nextDouble();
        System.out.println("Insira os anos de empresa: ");
        Integer anos = scan.nextInt();

        double novoSalario = 0;
        double reajuste = 0;

        String[] generoTipos = new String[]{"masculino", "feminino", "homem", "mulher", "m", "f"};

        boolean homem = genero.equalsIgnoreCase(generoTipos[0])||genero.equalsIgnoreCase(generoTipos[2])||genero.equalsIgnoreCase(generoTipos[4]);
        boolean mulher = genero.equalsIgnoreCase(generoTipos[1])||genero.equalsIgnoreCase(generoTipos[3])||genero.equalsIgnoreCase(generoTipos[5]);


        if (homem) {
            if (anos < 20.0) {
                reajuste = ((3.0/100.0)*salario);
                novoSalario = reajuste + salario;
                System.out.printf("""
                        Genêro: Masculino
                        Anos de Empresa: %d 
                        Salário Atual: R$%.2f 
                        Reajuste: + R$%.2f 
                        Novo Salário: R$%.2f 
                        """, anos, salario, reajuste, novoSalario);
            } else if (anos > 30.0) {
                reajuste = ((25.0/100.0)*salario);
                novoSalario = reajuste + salario;
                System.out.printf("""
                        Genêro: Masculino
                        Anos de Empresa: %d 
                        Salário Atual: R$%.2f 
                        Reajuste: + R$%.2f 
                        Novo Salário: R$%.2f 
                        """, anos, salario, reajuste, novoSalario);
            } else {
                reajuste = ((13.0/100.0)*salario);
                novoSalario = reajuste + salario;
                System.out.printf("""
                        Genêro: Masculino
                        Anos de Empresa: %d 
                        Salário Atual: R$%.2f 
                        Reajuste: + R$%.2f 
                        Novo Salário: R$%.2f 
                        """, anos, salario, reajuste, novoSalario);
            }
        } else if (mulher) {
            if (anos < 15.0) {
                reajuste = ((5.0/100.0)*salario);
                novoSalario = reajuste + salario;
                System.out.printf("""
                        Genêro: Feminino
                        Anos de Empresa: %d 
                        Salário Atual: R$%.2f 
                        Reajuste: + R$%.2f 
                        Novo Salário: R$%.2f 
                        """, anos, salario, reajuste, novoSalario);

            } else if (anos > 20.0) {
                reajuste = ((23.0/100.0)*salario);
                novoSalario = reajuste + salario;
                System.out.printf("""
                        Genêro: Feminino
                        Anos de Empresa: %d 
                        Salário Atual: R$%.2f 
                        Reajuste: + R$%.2f 
                        Novo Salário: R$%.2f 
                        """, anos, salario, reajuste, novoSalario);
            } else {
                reajuste = ((12.0/100.0)*salario);
                novoSalario = reajuste + salario;
                System.out.printf("""
                        Genêro: Feminino
                        Anos de Empresa: %d 
                        Salário Atual: R$%.2f 
                        Reajuste: + R$%.2f 
                        Novo Salário: R$%.2f 
                        """, anos, salario, reajuste, novoSalario);

            }

        } else {
            System.out.println("ERROR");
        }
        scan.close();

    }
}
