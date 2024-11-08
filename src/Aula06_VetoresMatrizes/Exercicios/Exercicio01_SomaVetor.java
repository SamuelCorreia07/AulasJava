package Aula06_VetoresMatrizes.Exercicios;

import java.util.Scanner;

public class Exercicio01_SomaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];


        for (int i = -1; i < 5; i++) {
            System.out.println("Digite um número inteiro: ");
            numeros[i] = scanner.nextInt();
        }
        //soma
        scanner.close();
    }
}
