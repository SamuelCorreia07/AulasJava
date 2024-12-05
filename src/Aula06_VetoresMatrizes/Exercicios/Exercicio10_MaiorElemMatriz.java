package Aula06_VetoresMatrizes.Exercicios;

import java.util.Scanner;

public class Exercicio10_MaiorElemMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrizInt = new int[4][4];
        int numPares = 0;

        for (int[] vetorInt : matrizInt) {
            for (int i = 0; i < vetorInt.length; i++) {
                System.out.println("Digite um número inteiro: ");
                vetorInt[i] = scanner.nextInt();
            }
        }
        for (int[] vetorInt : matrizInt) {
            for (int valorInt : vetorInt) {
                if (valorInt % 2 == 0) {
                    numPares ++;
                }
            }
        }
    }
}
