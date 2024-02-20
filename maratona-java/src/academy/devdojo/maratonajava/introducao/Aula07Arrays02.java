package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        // tamanho não aumenta dinamicamente
        String[] nomes = new String[3];
        nomes[0] = "Thauanna";
        nomes[1] = "Lucas";
        nomes[2] = "Eysis";
        //nomes[3] = "Tenório";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        System.out.println("=========================");
        nomes = new String[4];
        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

    }
}
