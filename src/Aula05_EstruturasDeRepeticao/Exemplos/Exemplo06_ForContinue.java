package Aula05_EstruturasDeRepeticao.Exemplos;

public class Exemplo06_ForContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
