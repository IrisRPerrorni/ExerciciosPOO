package Bola;

import java.util.Scanner;

public class MainBola {
    public static void main(String[] args) {
        //Classes
        Bolas bola = new Bolas();

        bola.circunferencia = 0.70;
        bola.cor = "Preta e Branca";
        bola.marca = "Adidas";
        bola.material = "Couro Sintético";
        bola.velocidade = 120.0;
        bola.uso = "Jogar Futebol";



        bola.descricaoDaBola();
        System.out.println("__________________________");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira a cor da bola");
        String novaCor = entrada.nextLine();

        bola.trocaCor(novaCor);
        System.out.println("__________________________");
        bola.mostraCor();





    }
}
