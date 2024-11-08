package Aula05_EstruturasDeRepeticao.Exercicios;

import java.util.Scanner;

public class Exercicio07_ValEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        do {
            System.out.println("Digite uma nota de 0 a 10: ");
            nota = scanner.nextInt();
        } while(nota<0 && nota>10);

        System.out.println(nota);

        scanner.close();
    }
}
