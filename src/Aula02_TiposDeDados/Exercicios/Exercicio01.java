package Aula02_TiposDeDados.Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        float altura = scanner.nextFloat();

        System.out.println("Digite o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("idade = " + idade + "\naltura = " + altura + "\npeso = " + peso);

        scanner.close();
    }
}
