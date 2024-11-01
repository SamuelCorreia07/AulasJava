package Aula05_EstruturasDeRepeticao.Exercicios;

public class Exercicio06_Fibonacci {
    public static void main(String[] args) {
        int numAtual = 1;
        int numAnterior = 1;
        int contador = 0;
        int proximo;

        while(contador<10) {
            contador++;
            System.out.println(numAnterior);
            proximo = numAnterior + numAtual;
            numAnterior = numAtual;
            numAtual = proximo;
        }

    }
}
