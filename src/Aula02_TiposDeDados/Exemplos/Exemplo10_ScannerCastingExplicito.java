package Aula02_TiposDeDados.Exemplos;
import java.util.Scanner;

public class Exemplo10_ScannerCastingExplicito {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");

        int varInt = scanner.nextInt();
        short varShort = (short) varInt;
        byte varByte = (byte) varShort; //limite é 127

        System.out.println("O numero inteiro digitado é: " + varInt);
        System.out.println("varShort = " + varShort);
        System.out.println("varByte = " + varByte);

        System.out.println("Digite um numero decimal: ");
        double varDouble = scanner.nextDouble();
        float varFloat = (float) varDouble;
        System.out.println("O numero decimal digitado é: " + varDouble);
        System.out.println("varFloat = " + varFloat);

        scanner.close();
    }
}
