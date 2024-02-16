package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos primitivos - int, double, float, char, byte, short, long, boolean
        int age = (int)1000000000000L;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float)2500.0D;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M'; // Pode colocar número referente a LETRA da tabela ASCII

        // String não é um tipo primitivo
        String nome = "Lucas"; // utilizar aspas duplas

        System.out.println("A idade é " + age + " anos ");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println("Oi, meu nome é " + nome);

    }
}
