package academy.devdojo.maratonajava.introducao;

public class Aula07Array03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        // Iniciar com valores
        int [] numeros2 = {1,2,3,4,5};
        // Outra forma de imicar com valores
        int[] numeros3 = new int[]{1,2,3,4,5};


        for (int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }
        System.out.println("##########################");

        // foreach
        for (int i : numeros3){
            System.out.println(i);
        }

    }
} // Aula07Array03
