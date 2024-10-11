package Aula02_TiposDeDados.Exercicios;

import java.util.Scanner;

public class Exercicio09_ConversaoDeTipos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor decimal: ");
        float varFloat = scanner.nextFloat();

        long varLong = (long) varFloat;

        double varDouble = varLong;

        System.out.println("varFloat = "+varFloat+"\nVarLong = "+varLong+"\nVarDouble = "+varDouble);

        scanner.close();
    }
}
