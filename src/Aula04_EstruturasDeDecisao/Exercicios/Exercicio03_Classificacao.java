package Aula04_EstruturasDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio03_Classificacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoProduto;

        System.out.println("Digite o código do produto:");
        codigoProduto = scanner.nextInt();

        switch (codigoProduto){
            case 1:
                System.out.println("Eletrônicos");
                break;
            case 2:
                System.out.println("Alimentos");
                break;
            case 3:
                System.out.println("Vestuário");
                break;
            default:
                System.out.println("Código inválido");
        }
        scanner.close();
    }
}
