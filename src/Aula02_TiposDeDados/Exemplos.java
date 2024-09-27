package Aula02_TiposDeDados;

public class Exemplos {
    //public static void main == psvm
    public static void main(String[] args) {
        System.out.println("Hello and welcome! \nOla Mundo!!!");
        System.out.println();
        int anoNasc;
        double peso;
        char sexo;
        boolean canhoto;

        anoNasc = 1980;
        peso = 65.7;
        sexo = 'M';
        canhoto = false;
        double altura = 1.8;

        int contador = 20;
        int novoContador = contador + 1;

        var x = 2;
        var y = 10.3;
        var z = true;

        int n1 = 10;
        int n2 = ++n1;
        int n3 = 10;
        int n4 = n3++;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
}