package Aula07_Funcoes.Exemplos;

public class Exemplo03_ComParComRet {
    public static void main(String[] args) {
        int retorno = funcaoComParametroComRetorno(2,3);
        System.out.println(retorno);
    }
    private static int funcaoComParametroComRetorno (int numero1, int numero2){
        return numero1 + numero2;
    }
}
