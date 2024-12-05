package Aula07_Funcoes;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio02 {

    static Scanner scanner = new Scanner(System.in);
    static String[] cabecalho = {"ID", "Nome", "Telefone", "E-mail"};
    static String[][] cadastro = {{"",""}};

    public static void main(String[] args) {
        cadastro[0] = cabecalho;

        String menu = """
                _____________________________________________
                |   Escolha uma opção:                      |
                |       1- Exibir Cadastro Completo         |
                |       2- Inserir Novo Usuário             |
                |       3- Atualizar Cadastro por ID        |
                |       4- Deletar um Cadastro por ID       |
                |       5- Sair                             |
                |___________________________________________|
                """;

        int opcao;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    exibirUsuario();
                    break;
                case 2:
                    cadastrarUsuario();
                    break;
                case 3:
                    atualizarUsuario();
                    break;
                case 4:
                    deletarUsuario();
                    break;
                case 5:
                    System.out.println("Fim do programa");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 5);
    }

    public static void exibirUsuario(){
        String tabela = "";
        for (String[] linhas : cadastro) {
            for (int colunas = 0; colunas < cadastro[0].length; colunas++) {
                tabela += linhas[colunas] + "\t\t";
            }
            tabela += "\n";
        }

        System.out.println(tabela);
    }

    public static void cadastrarUsuario(){
        System.out.print("Digite a quantidade de usuários que deseja cadastrar: ");
        int qtdUsuarios = scanner.nextInt();
        String[][] novaMatriz = new String[cadastro.length+qtdUsuarios][cabecalho.length];

        for (int linha = 0; linha < cadastro.length; linha++) {
            novaMatriz[linha] = Arrays.copyOf(cadastro[linha],cadastro[linha].length);
        }

        System.out.println("Preencha os dados a seguir:");
        for (int linha = cadastro.length; linha < novaMatriz.length; linha++) {

            System.out.println("Cadastro da pessoa " + linha);

            System.out.println(cabecalho[0] + ": " + linha);
            novaMatriz[linha][0] = String.valueOf(linha); //Converte valor inteiro para String

            for (int coluna = 1; coluna < cabecalho.length; coluna++) {
                System.out.print(cabecalho[coluna] + ": ");
                novaMatriz[linha][coluna] = scanner.next();
            }
        }
        cadastro = novaMatriz;
    }

    public static void atualizarUsuario(){
        System.out.println("Atualizar");
    }
    public static void deletarUsuario(){
        System.out.println("Deletar");
    }
}
