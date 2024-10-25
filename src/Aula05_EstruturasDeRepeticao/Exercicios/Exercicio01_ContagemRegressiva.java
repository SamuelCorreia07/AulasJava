package Aula05_EstruturasDeRepeticao.Exercicios;

import java.util.Scanner;

public class Exercicio01_ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i > 0 ; i--) {
            System.out.println(i);
        }
        System.out.println("Fim!");

        scanner.close();
    }
}
