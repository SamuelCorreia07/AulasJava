package Aula06_VetoresMatrizes.Exemplos;

public class Exemplo04_AtribuicaoMatriz {
    public static void main(String[] args) {
        int[][] matrizNumeros = {
                                    {1,2,3},
                                    {4,5,6},
                                    {7,8,9}
        };
        System.out.println("Valor da posição [1][2] é " + matrizNumeros[1][2]);

        String[][] matrizNomes = {{"Kauan", "Ramon", "Miguel"}, {"Matheus", "Luiza", "Isabely"}, {"Raphaela", "Karina", "Jéssica"}};
        System.out.println("Valor da posição [1][0] é " + matrizNomes[1][0]);
    }
}
