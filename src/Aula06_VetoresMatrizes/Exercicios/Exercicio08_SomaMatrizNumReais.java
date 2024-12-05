package Aula06_VetoresMatrizes.Exercicios;

import java.util.Scanner;

public class Exercicio08_SomaMatrizNumReais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matrizDouble = new double[2][2];
        double soma = 0;

        for (double[] vetorDouble : matrizDouble) {
            for (int i = 0; i < vetorDouble.length; i++) {
                System.out.println("Digite um número: ");
                vetorDouble[i] = scanner.nextDouble();
            }
        }
        for (double[] vetorDouble : matrizDouble) {
            for (double valorDouble : vetorDouble) {
                soma += valorDouble;
            }
        }
        System.out.println("A soma de todos os valores é igual a: " + soma);


        scanner.close();
    }
}
