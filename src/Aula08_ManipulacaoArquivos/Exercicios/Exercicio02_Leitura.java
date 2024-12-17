package Aula08_ManipulacaoArquivos.Exercicios;

import java.io.*;

public class Exercicio02_Leitura {
    public static void main(String[] args) {

        File alunos = new File("src\\Aula08_ManipulacaoArquivos\\Exercicios\\alunos.txt");

        if (alunos.exists()) {
            System.out.println("O arquivo já existe!");
        } else {
            try {
                // Cria o arquivo
                if (alunos.createNewFile()) {
                    System.out.println("Arquivo criado com sucesso: " + alunos.getName());
                } else {
                    System.out.println("Falha ao criar o arquivo.");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(alunos))) {
            String linha;
            StringBuilder conteudoDoArquivo = new StringBuilder();

            while ((linha = bufferedReader.readLine())!=null) {
                conteudoDoArquivo.append(linha).append("\n");
            }

            String[] linhaAlunos = conteudoDoArquivo.toString().split("\n");

            for (String linhaAluno : linhaAlunos) {
                System.out.println(linhaAluno);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
