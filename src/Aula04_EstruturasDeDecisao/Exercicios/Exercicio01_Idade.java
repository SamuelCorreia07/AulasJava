package Aula04_EstruturasDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio01_Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Acesso ao sistema permitido");
        } else if (idade >=0 && idade < 18) {
            System.out.println("Acesso ao sistema negado");
        } else {
            System.out.println("Idade Inválida");
        }

        scanner.close();
    }
}
