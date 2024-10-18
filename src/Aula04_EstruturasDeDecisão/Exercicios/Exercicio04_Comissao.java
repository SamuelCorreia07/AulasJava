package Aula04_EstruturasDeDecisão.Exercicios;

import java.util.Scanner;

public class Exercicio04_Comissao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorVendas;

        System.out.println("Digite o valor das vendas");
        valorVendas = scanner.nextDouble();

        if (valorVendas > 0 && valorVendas < 1000) {
            valorVendas = valorVendas * 0.05;
            System.out.println("A comissão é R$" + valorVendas);
        } else if (valorVendas >= 1000 && valorVendas <= 5000) {
            valorVendas = valorVendas * 0.1;
            System.out.println("A comissão é R$" + valorVendas);
        } else if (valorVendas > 5000) {
            valorVendas = valorVendas * 0.15;
            System.out.println("A comissão é R$" + valorVendas);
        } else {
            System.out.println("Valor inválido");
        }
        scanner.close();
    }
}
