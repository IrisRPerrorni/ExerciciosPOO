package Retangulo;

public class Retangulo {
    Double tamanhoLadoA;
    Double tamanhoLadoB;

    public void mudarTamanho(Double tamanhoLadoA , Double tamanhoLadoB){
        this.tamanhoLadoA = tamanhoLadoA;
        this.tamanhoLadoB = tamanhoLadoB;

    }
    public void valordosLados(){
        System.out.println("O lado A tem: " + tamanhoLadoA);
        System.out.println("O lado B tem: " + tamanhoLadoB);

    }
    public Double area(double tamanhoLadoB , double tamanhoLadoA){
        double area = tamanhoLadoA * tamanhoLadoB;
        return area;
    }
    public Double perimetro (double tamanhoLadoA , double tamanhoLadoB){
        double perimetro = 2 * tamanhoLadoA + 2 * tamanhoLadoB;
        return perimetro;
    }
}
