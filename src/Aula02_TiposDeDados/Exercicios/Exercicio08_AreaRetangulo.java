package Aula02_TiposDeDados.Exercicios;

import java.util.Scanner;

public class Exercicio08_AreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura do retangulo: ");
        float largura = scanner.nextFloat();

        System.out.println("Digite a altura do retangulo: ");
        float altura = scanner.nextFloat();

        float area = largura * altura;
        System.out.println("A area do retângulo é igual a "+area);

        scanner.close();
    }
}
