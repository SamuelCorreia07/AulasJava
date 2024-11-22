package Aula08_ManipulacaoArquivos.Exemplos;

import java.io.*;

public class Exemplo04_Buffered {
    public static void main(String[] args) {
        File arquivo = new File("src\\Aula08_ManipulacaoArquivos\\Exemplos\\arquivo.txt");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivo));
            bufferedWriter.write("Novo texto a ser gravado no arquivo.");
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha); // Lê linha por linha do arquivo
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
