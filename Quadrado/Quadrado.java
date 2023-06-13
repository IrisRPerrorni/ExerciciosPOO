package Quadrado;

public class Quadrado {
    Double tamanho;

  public void mudarTamanho(Double tamanho){
      this.tamanho=tamanho;

  }
    public void retornarTamanho() {
        System.out.println("o tamanho desejado é " + tamanho);
    }
    public Double areaQuadrado(double tamanhoLado){
        double area = tamanhoLado * tamanhoLado;
        return area;

    }
}
