package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio34 {
    public static void main (String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o seu peso em kg e a sua altura em m: ");
        Double peso = scan.nextDouble();
        Double altura = scan.nextDouble();

        double imc = (peso/(altura*altura));

        boolean abaixo = imc < 18.5;
        boolean ideal = imc >= 18.5 && imc < 25.0;
        boolean sobrepeso = imc >= 25.0 && imc < 30.0;
        boolean obesidade = imc >= 30.0 && imc < 40.0;
        boolean obesidademorbida = imc >= 40.0;

        if (abaixo) {
            System.out.printf("<- Indíce de Massa Corporal -> \n" +
                    "Peso: %.2fKg \n" +
                    "Altura: %fcm \n" +
                    "IMC: %.1f  \n" +
                    "Resultado:  Abaixo do Peso", peso, altura, imc);

        } else if (ideal){
            System.out.printf("<- Indíce de Massa Corporal -> \n" +
                    "Peso: %.2fKg \n" +
                    "Altura: %.2fcm \n" +
                    "IMC: %.1f  \n" +
                    "Resultado:  Peso Ideal", peso, altura, imc);

        } else if (sobrepeso) {
            System.out.printf("<- Indíce de Massa Corporal -> \n" +
                    "Peso: %.2fKg \n" +
                    "Altura: %.2fcm \n" +
                    "IMC: %.1f  \n" +
                    "Resultado:  Sobrepeso", peso, altura, imc);

        } else if (obesidade) {
            System.out.printf("<- Indíce de Massa Corporal -> \n" +
                    "Peso: %.2fKg \n" +
                    "Altura: %.2fcm \n" +
                    "IMC: %.1f  \n" +
                    "Resultado:  Obesidade", peso, altura, imc);

        } else if (obesidademorbida) {
            System.out.printf("<- Indíce de Massa Corporal -> \n" +
                    "Peso: %.2fKg \n" +
                    "Altura: %.2fcm \n" +
                    "IMC: %.1f  \n" +
                    "Resultado:  Obesidade mórbida", peso, altura, imc);

        } else {
            System.out.println("Valores inválidos");
        }
        scan.close();
    }
}
