package Aula04_EstruturasDeDecisão.Exercicios;

import java.util.Scanner;

public class Exercicio02_Compra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorCompra;

        System.out.println("Digite o valor da compra: ");
        valorCompra = scanner.nextDouble();

        if (valorCompra >= 100) {
            valorCompra = valorCompra * 0.9;
            System.out.println("O valor final da compra é " + valorCompra);
        } else if (valorCompra > 0 && valorCompra < 100) {
            System.out.println("O valor final da compra é " + valorCompra);
        } else {
            System.out.println("Valor inválido");
        }

        scanner.close();
    }
}
