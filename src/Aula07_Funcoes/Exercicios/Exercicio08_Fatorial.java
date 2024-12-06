package Aula07_Funcoes.Exercicios;

import java.util.Scanner;

public class Exercicio08_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo");
        int numero = scanner.nextInt();

        int fatorial = calcularFatorial(numero);
        System.out.println("O fatorial desse número é igual a " + fatorial);

        scanner.close();
    }

    static int calcularFatorial (int numero) {
        int fatorial = numero;
        int multiplicador = numero;

        do {
            multiplicador--;
            fatorial = fatorial * multiplicador;
        } while (1 < multiplicador);

        return fatorial;
    }
}
