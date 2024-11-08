package Aula05_EstruturasDeRepeticao.Exercicios;

import java.util.Scanner;

public class Exercicio08_ParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int impar = 0, par =0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            num = scanner.nextInt();
            num = num%2 == 0 ? par++ : impar++;
        }
        System.out.println("Numeros pares: "+ par + "\nNumeros impares: "+impar);

        scanner.close();
    }
}
