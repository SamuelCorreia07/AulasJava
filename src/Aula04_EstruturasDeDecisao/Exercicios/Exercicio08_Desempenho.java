package Aula04_EstruturasDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio08_Desempenho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Em uma escala de 1 a 5, avalie o desempenho do funcionário:");
        int desempenho = scanner.nextInt();

        switch (desempenho) {
            case 1:
                System.out.println("Precisa melhorar");
                break;
            case 2:
                System.out.println("Abaixo da média");
                break;
            case 3:
                System.out.println("Média");
                break;
            case 4:
                System.out.println("Acima da média");
                break;
            case 5:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Número inválido!");
        }

        scanner.close();
    }
}
