package Aula02_TiposDeDados.Exercicios;

import java.util.Scanner;

public class Exercicio06_Comparacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int n2 = scanner.nextInt();

        boolean maior = n1 > n2, menor = n1 < n2, maiorIgual = n1 >= n2, menorIgual = n1 <= n2,
                igual = n1 == n2, diferente = n1 != n2;

        System.out.println(n1+" > "+n2+" = "+maior+
                "\n"+n1+" < "+n2+" = "+menor+
                "\n"+n1+" >= "+n2+" = "+maiorIgual+
                "\n"+n1+" <= "+n2+" = "+menorIgual+
                "\n"+n1+" == "+n2+" = "+igual+
                "\n"+n1+" != "+n2+" = "+diferente);

        scanner.close();
    }
}
