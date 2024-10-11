package Aula02_TiposDeDados.Exercicios;

import java.util.Scanner;

public class Exercicio07_OpLogBasicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Abaixo, diga seis números e eu compararei, em pares, se sao maior, menor e igual, respectivamente." +
                "\nDepois compararei as condicoes entre si.\n");

        System.out.println("Digite um numero inteiro: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int n2 = scanner.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int n3 = scanner.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int n4 = scanner.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int n5 = scanner.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int n6 = scanner.nextInt();

        boolean cond1 = n1 > n2, cond2 = n3 < n4, cond3 = n5 == n6;

        boolean resposta;

        resposta = cond1 && cond2 && cond3;
        System.out.println(cond1 + " && " + cond2 + " && " + cond3 + " = " + resposta);

        resposta = cond1 && cond2 || cond3;
        System.out.println(cond1 + " && " + cond2 + " || " + cond3 + " = " + resposta);

        resposta = cond1 || cond2 && cond3;
        System.out.println(cond1 + " || " + cond2 + " && " + cond3 + " = " + resposta);

        resposta = cond1 || cond2 || cond3;
        System.out.println(cond1 + " || " + cond2 + " || " + cond3 + " = " + resposta);

        scanner.close();
    }
}
