package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;

        // executa enquanto condição verdadeira
        while(count < 10){
            System.out.println(" While : "+ ++count);
            //count++
            //count += 1;
        }

        // do-while -> execute ao menos uma vez
        count = 0;
        do{
            System.out.println("Dentro do do-while " + ++count);
        }while(count < 10);

        // for -> utilizado mais para pecorrer
        for(int i=0; i <= 10; i++){
            System.out.println("For : " + i);
        }
    }
}
