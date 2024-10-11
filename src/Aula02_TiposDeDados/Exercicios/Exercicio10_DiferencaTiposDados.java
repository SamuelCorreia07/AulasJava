package Aula02_TiposDeDados.Exercicios;

import java.util.Scanner;

public class Exercicio10_DiferencaTiposDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número pequeno: ");
        short varShort = scanner.nextShort();

        int varInt = varShort;

        byte varByte = (byte) varInt;

        System.out.println("varShort = "+varShort+"\nvarInt = "+varInt+"\nvarByte = "+varByte);

        scanner.close();
    }
}
