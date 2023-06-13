package Bola;

public class Bolas {

    Double circunferencia;
    String cor;
    String marca;
    String material;
    Double velocidade ;
    String uso ;

    public void descricaoDaBola(){
        System.out.println("----------------Descrição da bola --------");
        System.out.println("A circuferencia da bola é: " + circunferencia + " m ");
        System.out.println("A cor da bola é: " + cor);
        System.out.println("A marca da bola é: " + marca);
        System.out.println("O material da bola é: " + material);
        System.out.println(" A bola pode chegar em uma velocidade maxima de: " + velocidade);
        System.out.println(" É uma bola de: " + uso);

    }

    public void trocaCor(String cor){ // metodo sem retorno

        this.cor = cor;

    }
    public void mostraCor(){
        System.out.println("----------------Descrição da nova bola --------");
        System.out.println("A circuferencia da bola é: " + circunferencia + " m ");
        System.out.println("A nova cor da bola é: " + this.cor);
        System.out.println("A marca da bola é: " + marca);
        System.out.println("O material da bola é: " + material);
        System.out.println(" A bola pode chegar em uma velocidade maxima de: " + velocidade);
        System.out.println(" É uma bola de: " + uso);

    }


}
