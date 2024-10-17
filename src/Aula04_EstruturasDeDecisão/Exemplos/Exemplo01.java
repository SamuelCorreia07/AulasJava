package Aula04_EstruturasDeDecisão.Exemplos;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.println("Diite um número inteiro");
        x = scanner.nextInt();

        if (x >= 30) {
            System.out.println("Número é maior ou igual a 30");
        } else {
            System.out.println("Numero é menor que 30");
        }
        scanner.close();
    }
}
