package Aula02_TiposDeDados.Exemplos;

public class Exemplo4_OperadoresLogicos {
    public static void main(String[] args){
        int num1 = 4, num2 = 5, num3 = 4, num4 = 9;
        boolean resposta;

        resposta = num1 < num2 && num3 != num4;

        System.out.println(num1 + " < " + num2 + " && " + num3 + " != " + num4 + " = " + resposta);

        resposta = num1 < num2 || num3 != num4;

        System.out.println(num1 + " < " + num2 + " || " + num3 + " != " + num4 + " = " + resposta);

        resposta = ! (num1 == num2); //negação só inverte se for boolean (false or true)

        System.out.println(num1 + " == " + num2 + " = " + resposta);
    }
}
