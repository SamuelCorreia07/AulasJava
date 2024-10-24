package Aula04_EstruturasDeDecisao.Exemplos;

import java.util.Scanner;

public class Exemplo03_Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        if (idade > 0 && idade <= 12) {
            System.out.println("Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("Adulto");
        } else if (idade >= 65 && idade <= 150) {
            System.out.println("Idoso");
        } else {
            System.out.println("Idade inválida");
        }
        scanner.close();
    }
}
