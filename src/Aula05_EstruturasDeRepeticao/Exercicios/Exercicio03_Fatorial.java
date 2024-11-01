package Aula05_EstruturasDeRepeticao.Exercicios;

import java.util.Scanner;

public class Exercicio03_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro para calcular o seu fatorial: ");
        int num = scanner.nextInt();
        int fat = num;

        do {
            fat--;
            num = num * fat;
        } while (1 < fat);

        System.out.println("O fatorial é igual a " + num);

        scanner.close();
    }
}
