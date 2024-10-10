package Aula02_TiposDeDados.Exemplos;

public class Exemplo8_Strings {
    public static void main(String[] args) {
        String s = "abc";

        String textoMultilinha = """
                Este é um texto de multiplas linhas.
                Ele pode se estender por várias linhas
                sem a necessidade de caracteres de escape.
                """;
        String varString = "paralelepipedo\n";

        System.out.println(s);
        System.out.println(textoMultilinha);
        System.out.println(varString);

    }
}
