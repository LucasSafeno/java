package academy.devdojo.maratonajava.introducao;

public class ula05EstruturaCondicionais06 {
    public static void main(String[] args) {
        // (Utilizado switch) Dados os valores de 1 a 7, imprima se dia util ou final de semana
        // consierando 1 como domingo

        int dia  = 3;

        switch (dia){
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia de semana");
                break;
            case 3:
                System.out.println("Dia de semana");
                break;
            case 4:
                System.out.println("Dia de semana");
                break;
            case 5:
                System.out.println("Dia de semana");
                break;
            case 6:
                System.out.println("Dia de semana");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
