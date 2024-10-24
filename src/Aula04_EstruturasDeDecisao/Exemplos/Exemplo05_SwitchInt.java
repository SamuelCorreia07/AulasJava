package Aula04_EstruturasDeDecisao.Exemplos;

import java.util.Scanner;

public class Exemplo05_SwitchInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Escolha uma opção: \n" +
                "\t1- Viagem para Londres \n" +
                "\t2- Viagem para Nova Iorque \n" +
                "\t3- Viagem para Paris\n");
        opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("\nParabéns, você ganhou uma viagem para Londres!");
                break;
            case 2:
                System.out.println("\nParabéns, você ganhou uma viagem para Nova Iorque!");
                break;
            case 3:
                System.out.println("\nParabéns, você ganhou uma viagem para Paris!");
                break;
            default:
                System.out.println("\nQue pena que você digitou uma opção inválida. \nAgora você perdeu a viagem dos seus sonhos e vai se arrepender por não ter digitado um número só e ganhar uma viagem de graça. Parabéns!");
        }

        scanner.close();
    }
}
