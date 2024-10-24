package Aula05_EstruturasDeRepeticao.Exemplos;

import java.util.Scanner;

public class Exemplo04_For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para calcular a tabuada: ");
        int x = scanner.nextInt();

        for (int multiplicador = 0; multiplicador <= 10; multiplicador++) {
            System.out.println(x + " * " + multiplicador + " = " + x * multiplicador);
        }
        scanner.close();
    }
}
