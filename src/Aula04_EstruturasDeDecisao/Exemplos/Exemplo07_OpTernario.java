package Aula04_EstruturasDeDecisao.Exemplos;

import java.util.Scanner;

public class Exemplo07_OpTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float valorFinal;
        float desconto = 0.2f;

        System.out.println("Digite o valor da compra: ");
        float valorCompra = scanner.nextFloat();

        valorFinal = valorCompra > 100 ? valorCompra-valorCompra*desconto : valorCompra;

        System.out.println("O valor final da ompra será de "+valorFinal);

        scanner.close();
    }
}
