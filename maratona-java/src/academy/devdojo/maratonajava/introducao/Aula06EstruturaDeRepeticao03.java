package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao03 {
    public static void main(String[] args) {
        // imprima os primeiros 25 números de um determinado valor. Por exemplo 100

        int valorMax = 100;
        for(int i = 0; i <= 100; i++){
            if(i >= 25){
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }
    }
}
