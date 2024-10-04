package Aula02_TiposDeDados.Exemplos;

public class Exemplo2_OperadoresAritmeticos { //OPERADORES ARITMÉTICOS
    public static void main(String[] args) {
        float totalFloat, numero1Float = 2;
        int total, numero1 = 2, numero2 = 4;

        total = numero1 + numero2;
        System.out.println("A soma dos números é = " + total);
        total = numero1 - numero2;
        System.out.println("A subtração dos números é = " + total);
        total = numero1 * numero2;
        System.out.println("A multiplicação dos números é = " + total);
        totalFloat = numero1Float / numero2;
        System.out.println("A divisão dos números é = " + totalFloat);

        float modulo = numero1Float % numero2;
        System.out.println("O resto da divisão de "+numero1Float+" por "+numero2+" é igual a "+modulo);
    }
}
