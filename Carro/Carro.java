package Carro;

public class Carro {

    Integer portas;
    String modelo ;
    String marca ;
    Double potencia = 2.0;

    public Carro(Integer portas, String modelo, String marca ) {
        this.portas = portas;
        this.modelo = modelo;
        this.marca = marca;
    }
    public void ligarCarro(){

        System.out.println("Ao ligar o carro irá aparecer no comando de bordo: ");
        System.out.println("o modelo do carro " + modelo);
        System.out.println("A marca do carro " + marca);
        System.out.println("A potência do carro: " + potencia);
    }
}
