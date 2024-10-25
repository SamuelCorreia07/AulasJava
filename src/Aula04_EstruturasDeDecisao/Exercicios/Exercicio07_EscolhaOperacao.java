package Aula04_EstruturasDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio07_EscolhaOperacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        float num1 = scanner.nextFloat();
        System.out.println("Digite o segundo número: ");
        float num2 = scanner.nextFloat();

        System.out.println("\nSelecione a operação desejada:\n" +
                "\t1- Soma\n" +
                "\t2- Subtração\n" +
                "\t3- Multiplicação\n" +
                "\t4- Divisão");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + num1+num2);
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + num1*num2);
                break;
            case 4:
                System.out.println(num1 + " / " + num2 + " = " + num1/num2);
                break;
            default:
                System.out.println("Número inválido!");
        }

        scanner.close();
    }
}
