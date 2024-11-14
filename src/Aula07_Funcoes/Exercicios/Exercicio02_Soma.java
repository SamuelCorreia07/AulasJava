package Aula07_Funcoes.Exercicios;

import java.util.Scanner;

public class Exercicio02_Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite um número inteiro: ");
        int numero2 = scanner.nextInt();

        int soma = somar(numero1,numero2);
        System.out.println("A soma dos dois números é igual a " + soma);
    }
    static int somar(int num1, int num2){
        return num1 + num2;
    }
}
