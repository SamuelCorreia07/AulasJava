package Aula04_EstruturasDeDecisao.Exercicios;

import java.util.Scanner;

public class Exercicio05_HorasExtras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horasTrabalhadas;
        int valorPorHora;
        float valorHoraExtra = 1.5f;
        float pagamento;

        System.out.println("Digite a quantidade de horas trabalhadas:");
        horasTrabalhadas = scanner.nextInt();
        System.out.println("Digite o valor pago por hora trabalhada:");
        valorPorHora = scanner.nextInt();

        pagamento = horasTrabalhadas > 40 ? ((horasTrabalhadas - 40) * valorHoraExtra*valorPorHora) + (40*valorPorHora) : horasTrabalhadas * valorPorHora;

        System.out.println("O pagamento será de R$"+pagamento);

        scanner.close();
    }
}
