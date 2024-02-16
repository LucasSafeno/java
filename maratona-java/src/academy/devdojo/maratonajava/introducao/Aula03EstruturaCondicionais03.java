package academy.devdojo.maratonajava.introducao;

public class Aula03EstruturaCondicionais03 {
    public static void main(String[] args) {
        // Doar se salário for  maior que 5000
        double salario = 6000;

        String mensagemDoar = "Eu vou doar 500";
        String mensagemNaoDoar = "Ainda não vou doar";
        // (condicao) ? verdadeiro : falso
        String resultado  = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;

        /* antigo
        if(salario >= 5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }*/
        System.out.println(resultado);
    }
}
