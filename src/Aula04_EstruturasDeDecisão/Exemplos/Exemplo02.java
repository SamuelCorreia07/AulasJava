package Aula04_EstruturasDeDecisão.Exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String corSemaforo;

        System.out.println("Cor do semáforo:");
        corSemaforo = scanner.next();

        if (corSemaforo.equals("verde") || corSemaforo.equals("Verde")){
            System.out.println("Siga!");
        } else if (corSemaforo.equals("amarelo") || corSemaforo.equals("Amarelo")) {
            System.out.println("Atenção!");
        } else if (corSemaforo.equals("vermelho") || corSemaforo.equals("Vermelho")) {
            System.out.println("Pare!");
        } else {
            System.out.println("Nunca vi semáforo com a cor "+corSemaforo);
        }
        scanner.close();
    }
}
