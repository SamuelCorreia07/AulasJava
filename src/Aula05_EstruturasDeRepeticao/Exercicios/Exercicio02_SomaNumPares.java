package Aula05_EstruturasDeRepeticao.Exercicios;

import java.util.Scanner;

public class Exercicio02_SomaNumPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0, soma = 0;

        while (x < 100) {
            x = x + 2;
            soma = soma + x;
        }

        System.out.println("A soma dos números pares de 1 a 100 é igual a " + soma);

        scanner.close();
    }
}
