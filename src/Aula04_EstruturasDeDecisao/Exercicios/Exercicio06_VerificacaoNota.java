package Aula04_EstruturasDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio06_VerificacaoNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        float nota = scanner.nextFloat();

        if (nota >= 7 && nota <= 10){
            System.out.println("Aluno aprovado!");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Aluno está em recuperação!");
        } else if (nota >= 0 && nota < 5) {
            System.out.println("Aluno reprovado!");
        } else {
            System.out.println("Número inválido.");
        }

        scanner.close();
    }
}
