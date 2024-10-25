package Aula04_EstruturasDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio09_DetermTurno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora atual do dia:");
        int hora = scanner.nextInt();

        if (hora >= 5 && hora < 12){
            System.out.println("Manhã");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Tarde");
        } else if (hora >= 18 && hora < 22) {
            System.out.println("Noite");
        } else if (hora >= 22 && hora < 24 || hora >= 0 && hora < 5) {
            System.out.println("Madrugada");
        } else {
            System.out.println("Horário inválido");
        }

        scanner.close();
    }
}
