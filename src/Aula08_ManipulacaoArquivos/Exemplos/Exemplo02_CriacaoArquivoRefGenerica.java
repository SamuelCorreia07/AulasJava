package Aula08_ManipulacaoArquivos.Exemplos;

import java.io.File;
import java.io.IOException;

public class Exemplo02_CriacaoArquivoRefGenerica {
    public static void main(String[] args) {
        //Caminho do arquivo que será criado
        File arquivo = new File("src\\Aula08_ManipulacaoArquivos\\Exemplos\\arquivo.txt");

        // verifica se o arquivo já existe
        if (arquivo.exists()) {
            System.out.println("O arquivo já existe!");
        } else {
            try {
                // Cria o arquivo
                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo criado com sucesso: " + arquivo.getName());
                } else {
                    System.out.println("Falha ao criar o arquivo.");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
