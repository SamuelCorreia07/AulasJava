package Aula07_Funcoes;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
        System.out.println(menu);
        int opcao = scanner.nextInt();
        scanner.nextLine();

        do {
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
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao!=5);

        scanner.close();
    }
    public static void exibirUsuario(){
        System.out.println("Exibir");
    }
    public static void cadastrarUsuario(){
        System.out.println("Cadastrar");
    }
    public static void atualizarUsuario(){
        System.out.println("Atualizar");
    }
    public static void deletarUsuario(){
        System.out.println("Deletar");
    }
}
