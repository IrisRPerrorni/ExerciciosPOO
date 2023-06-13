package Retangulo;

import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Retangulo retan = new Retangulo();
        retan.tamanhoLadoA = 10.0;
        retan.tamanhoLadoB = 5.0 ;
        System.out.println("O tamanho do retangulo é : " + retan.tamanhoLadoA + " x " + retan.tamanhoLadoB);

        System.out.println("Digite o comprimento desejado do retangulo");
        double ladoA = entrada.nextDouble();
        System.out.println("Digite a largura desejado do retangulo");
        double ladoB = entrada.nextDouble();

        retan.mudarTamanho(ladoA,ladoB);
        retan.valordosLados();
        System.out.println("A área do retangulo desejado é: " + retan.area(ladoB,ladoB));
        System.out.println("O perímetro do retângulo desejado é: " + retan.perimetro(ladoA,ladoB));

    }


}
