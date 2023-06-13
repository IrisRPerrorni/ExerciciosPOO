package Quadrado;

import java.util.Scanner;

public class MainQuadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Quadrado quad = new Quadrado();
        quad.tamanho = 10.0;
        System.out.println("O tamanho atual do quadrado é: " + quad.tamanho);

        System.out.println("digite o tamanho desejado do quadrado");
        double ladotamanho = entrada.nextDouble();
        quad.mudarTamanho(ladotamanho);
        quad.retornarTamanho();
        System.out.println("A área do quadrado é: " +quad.areaQuadrado(ladotamanho));



    }



}
