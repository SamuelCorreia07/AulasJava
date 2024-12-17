package Aula08_ManipulacaoArquivos.Exercicios;

import java.io.*;

public class Exercicio03_Copiar {
    public static void main(String[] args) {

        File alunos = new File("src\\Aula08_ManipulacaoArquivos\\Exercicios\\alunos.txt");
        File backupAlunos = new File("src\\Aula08_ManipulacaoArquivos\\Exercicios\\backup_alunos.txt");

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
        if (backupAlunos.exists()) {
            System.out.println("O arquivo já existe!");
        } else {
            try {
                // Cria o arquivo
                if (backupAlunos.createNewFile()) {
                    System.out.println("Arquivo criado com sucesso: " + backupAlunos.getName());
                } else {
                    System.out.println("Falha ao criar o arquivo.");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(alunos)); BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(backupAlunos))) {
            String linha;
            StringBuilder conteudoDoArquivo = new StringBuilder();

            while ((linha = bufferedReader.readLine())!=null) {
                conteudoDoArquivo.append(linha).append("\n");
            }

            String[] linhaAlunos = conteudoDoArquivo.toString().split("\n");

            for (String linhaAluno : linhaAlunos) {
                bufferedWriter.write(linhaAluno+"\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
