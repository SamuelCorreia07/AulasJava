package Aula05_EstruturasDeRepeticao.Exercicios;

import java.util.Scanner;

public class Exercicio05_MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite sua nota: ");
            somaNotas += scanner.nextDouble();
        }

        double media = somaNotas / 5;
        System.out.println("A média das suas notas é igual a "+ media);

        scanner.close();
    }
}
