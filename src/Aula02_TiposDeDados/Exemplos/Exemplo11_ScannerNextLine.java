package Aula02_TiposDeDados.Exemplos;
import java.util.Scanner;

public class Exemplo11_ScannerNextLine {
    public static void main(String[] args) {
        String texto = "\tEste texto está na primeira linha\n" +
                "\tdfbdfbfdnrththt\n" +
                "\tgbfdbfb.bd.bdf.\n" +
                "\tgfdbfnmtjysngh\n";

        System.out.println(texto);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); //Este comando serve para consumir o \n que o nextInt deixou na memória
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Seu nome é " + nome + " e sua idade é " + idade + ".");

    }
}
