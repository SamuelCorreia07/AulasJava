package Aula06_VetoresMatrizes.Exercicios;

import java.util.Scanner;

public class Exercicio07_SomaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrizInt = new int[3][3];
        int soma = 0;

        for (int[] vetorInt : matrizInt) {
            for (int i = 0; i < vetorInt.length; i++) {
                System.out.println("Digite um número inteiro: ");
                vetorInt[i] = scanner.nextInt();
            }
        }
        for (int[] vetorInt : matrizInt) {
            for (int valorInt : vetorInt) {
                soma += valorInt;
            }
        }
        System.out.println("A soma de todos os valores é igual a: " + soma);

        scanner.close();
    }
}
