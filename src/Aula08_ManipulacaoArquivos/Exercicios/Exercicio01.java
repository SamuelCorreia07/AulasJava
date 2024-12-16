package Aula08_ManipulacaoArquivos.Exercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vetorAlunos = new String[5];

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

        System.out.println("Digite o nome de 5 alunos: ");

        for (int i = 0; i < vetorAlunos.length; i++) {
            vetorAlunos[i] = scanner.nextLine();
        }
        try (FileWriter fileWriter = new FileWriter(alunos)) {
            for (String aluno : vetorAlunos) {
                fileWriter.write(aluno + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
