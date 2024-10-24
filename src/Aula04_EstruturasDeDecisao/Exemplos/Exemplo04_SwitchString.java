package Aula04_EstruturasDeDecisao.Exemplos;

import java.util.Scanner;

public class Exemplo04_SwitchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String corSemaforo;

        System.out.println("Digite a cor do semáforo");
        corSemaforo = scanner.nextLine();

        switch (corSemaforo) {
            case "verde","Verde":
                System.out.println("Siga!");
                break; //o break serve para interromper o switch, caso tire ele, o código executará o próximo case
            case "amarelo","Amarelo":
                System.out.println("Atenção!");
                break;
            case "vermelho","Vermelho":
                System.out.println("Pare!");
                break;
            default:
                System.out.println("Nunca vi semáforo com a cor " + corSemaforo);
        }
        scanner.close();
    }
}
