package Aula06_VetoresMatrizes.Exercicios;

import java.util.Scanner;

public class Exercicio02_BuscaCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] caracteres = {"b","g","h","l","e","p"};
        boolean consulta = false;
        int posicao = 0;

        System.out.println("Digite uma letra: ");
        String letra = scanner.nextLine();

        for (int k = 0; k < caracteres.length; k++) {
            if (letra.equals(caracteres[k])) {
                consulta = true;
                posicao = k;
                break;
            }
        }
        if (consulta){
            System.out.println("A letra " + letra + " está na posição " + posicao + " do vetor");
        } else {
            System.out.println("Letra " + letra + " não encontrada no vetor");
        }
        scanner.close();
    }
}
