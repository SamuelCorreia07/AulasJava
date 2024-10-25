package Aula04_EstruturasDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio10_ConversaoMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em reais:");
        float real = scanner.nextFloat();

        System.out.println("\nSelecione a conversão para a moeda desejada:\n" +
                "\t1- Dolar\n" +
                "\t2- Euro\n" +
                "\t3- Libra");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                double dolar = real / 5.67;
                System.out.println("$" + dolar);
                break;
            case 2:
                double euro = real / 6.17;
                System.out.println("€" + euro);
                break;
            case 3:
                double libra = real / 7.36;
                System.out.println("£" + libra);
                break;
            default:
                System.out.println("Número inválido!");
        }
        scanner.close();
    }
}
