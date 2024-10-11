package Aula02_TiposDeDados.Exercicios;

import java.util.Scanner;

public class Exercicio05_OperadoresAritmeticos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite a segunda nota: ");
        int n2 = scanner.nextInt();

        System.out.println("Digite a terceira nota: ");
        int n3 = scanner.nextInt();

        int soma = n1 + n2 + n3;

        System.out.println("A soma total das notas é igual a " + soma);

        scanner.close();
    }
}
