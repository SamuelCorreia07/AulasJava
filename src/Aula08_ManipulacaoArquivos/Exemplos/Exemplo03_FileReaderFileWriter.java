package Aula08_ManipulacaoArquivos.Exemplos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo03_FileReaderFileWriter {
    public static void main(String[] args) {

        File arquivo = new File("src\\Aula08_ManipulacaoArquivos\\Exemplos\\arquivo.txt");

        try {
            FileWriter fileWriter = new FileWriter(arquivo);
            fileWriter.write("Texto a ser gravado no arquivo.\n");
            fileWriter.close(); // Sempre feche o stream após a escrita

            FileReader fileReader = new FileReader(arquivo);
            int caracter;
            while ((caracter = fileReader.read()) != -1) {
                System.out.print((char)caracter);
            }
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
