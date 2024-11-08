package Aula06_VetoresMatrizes.Exemplos;

public class Exemplo08_ForItMatriz {
    public static void main(String[] args) {
        int[][] matrizNumeros = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int[] matrizNumero : matrizNumeros) {
            for (int i : matrizNumero) {
                System.out.println(i);
            }
        }

        String[][] matrizNomes = {{"Kauan", "Ramon", "Miguel"}, {"Matheus", "Luiza", "Isabely"}, {"Raphaela", "Karina", "Jéssica"}};

        for (String[] matrizNome : matrizNomes) {
            for (String s : matrizNome) {
                System.out.println(s);
            }
        }
    }
}
