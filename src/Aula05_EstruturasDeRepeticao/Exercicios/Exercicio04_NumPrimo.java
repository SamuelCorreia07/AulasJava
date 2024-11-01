package Aula05_EstruturasDeRepeticao.Exercicios;

import java.util.Scanner;

public class Exercicio04_NumPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        boolean primo = false;

        for (int divisor = 2; divisor < num-1; divisor++) {
            if (num % divisor == 0){
                primo = true;
                break;
            }
        }

        if (primo) {
            System.out.println("Esse número não é primo");
        } else {
            System.out.println("Esse número é primo!");
        }


        scanner.close();
    }
}
