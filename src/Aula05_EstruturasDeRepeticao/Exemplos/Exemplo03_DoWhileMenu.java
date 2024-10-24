package Aula05_EstruturasDeRepeticao.Exemplos;

import java.util.Scanner;

public class Exemplo03_DoWhileMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:\n" +
                    "\t1- Para escolher opção 1\n" +
                    "\t2- Para escolher opção 2\n" +
                    "\t3- Para escolher opção 3\n" +
                    "\t4- Sair\n");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\nParabéns! Você escolheu a opção 1\n");
                    break;
                case 2:
                    System.out.println("\nParabéns! Você escolheu a opção 2\n");
                    break;
                case 3:
                    System.out.println("\nParabéns! Você escolheu a opção 3\n");
                    break;
                case 4:
                    System.out.println("\nTchau!");
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
            }
        } while (opcao!=4);

        scanner.close();
    }
}
