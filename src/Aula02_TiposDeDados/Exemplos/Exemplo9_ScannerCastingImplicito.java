package Aula02_TiposDeDados.Exemplos;
import java.util.Scanner;

public class Exemplo9_ScannerCastingImplicito {
    public static void main(String[] args) {

        //Criando um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        //Solicitando um número inteiro ao usuário
        System.out.println("Digite um numero inteiro: ");

        int varInt = scanner.nextInt();
        long varLong = varInt;
        float varFloat = varInt;

        //Exibindo o número digitado
        System.out.println("Você digitou o número: " + varInt);
        System.out.println("varLong = " + varLong);
        System.out.println("varFloat = " + varFloat);

        //Solicitando um número decimal ao usuário
        System.out.println("Digite um numero decimal: ");
        varFloat = scanner.nextFloat();
        System.out.println("O numero decimal digitado é: " + varFloat);

        //Fechando o Scanner
        scanner.close();

    }
}
