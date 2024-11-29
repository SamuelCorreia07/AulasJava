package Aula06_VetoresMatrizes;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de usuários que deseja cadastrar: ");
        int qtdUsuarios = scanner.nextInt();

        String[] cabecalho = {"ID", "Nome", "Telefone", "E-mail"};
        String[][] cadastro = new String[qtdUsuarios + 1][cabecalho.length];
        cadastro[0] = cabecalho;

        for (int linha = 1; linha <= qtdUsuarios; linha++) {
            System.out.println("Cadastro da pessoa " + linha);
            System.out.println("ID: " + linha);
            cadastro[linha][0] = String.valueOf(linha);
            System.out.print("Nome: ");
            cadastro[linha][1] = scanner.next();
            System.out.print("Telefone: ");
            cadastro[linha][2] = scanner.next();
            System.out.print("E-mail: ");
            cadastro[linha][3] = scanner.next();
        }

        String tabela = "";
        for (String[] linhas : cadastro) {
            for (int colunas = 0; colunas < cadastro[0].length; colunas++) {
                tabela += linhas[colunas] + "\t\t";
            }
            tabela += "\n";
        }

        System.out.println(tabela);

        scanner.close();
    }
}
