package Aula05_EstruturasDeRepeticao.Exemplos;

public class Exemplo05_ForBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i==5){
                break;
            }
            System.out.println(i);
        }
    }
}
