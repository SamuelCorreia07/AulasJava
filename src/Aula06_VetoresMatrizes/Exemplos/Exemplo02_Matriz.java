package Aula06_VetoresMatrizes.Exemplos;

public class Exemplo02_Matriz {
    public static void main(String[] args) {
        int[][] matrizNumeros = new int[2][3];

        matrizNumeros[0][0] = 1;
        matrizNumeros[0][1] = 2;
        matrizNumeros[0][2] = 3;
        matrizNumeros[1][0] = 4;
        matrizNumeros[1][1] = 5;
        matrizNumeros[1][2] = 6;

        System.out.println("Valor da matriz na posição [0][2] é " + matrizNumeros[0][2]);

        String[][] matrizNomes = new String[2][2];

        matrizNomes[0][0] = "Ana";
        matrizNomes[0][1] = "Maria";
        matrizNomes[1][0] = "Clara";
        matrizNomes[1][1] = "Vilma";

        System.out.println("Valor da matriz na posição [1][0] é " + matrizNomes[1][0]);

    }
}
