package Aula02_TiposDeDados.Exercicios;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Digite o valor pago por hora: ");
        int valorPagoPorHora = scanner.nextInt();

        int salarioTotal = horasTrabalhadas * valorPagoPorHora;

        System.out.println("O salário total é " + salarioTotal);

        scanner.close();
    }
}
