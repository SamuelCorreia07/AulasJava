package Aula02_TiposDeDados.Exemplos;

public class Exemplo6_Casting {
    public static void main(String[] args) {
        float x = 2.0F;
        int y = (int) x;
        System.out.println("x = " + x + " y = " + y);

        byte varByte = (byte) 128;
        short varShort = varByte;
        int varInt = varShort;
        long varLong = varInt;

        varShort = (short) 100000;

        double varDouble = 4.5;
        varInt = (int) varDouble;

        System.out.println(varLong);
        System.out.println(varShort);
        System.out.println(varInt);

    }
}
