package Aula07_Funcoes.Exemplos;

public class Exemplo02_ComParSemRet {
    public static void main(String[] args) {
        funcaoComParametroSemRetorno(5, "Teste");
        Exemplo01_SemParSemRet.funcaoSemParametroSemRetorno();
    }
    static void funcaoComParametroSemRetorno(int parametro1, String parametro2){
        System.out.println("Parametro 1 = " + parametro1);
        System.out.println("Parametro 2 = " + parametro2);
    }
}
