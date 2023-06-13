package Jardim;

public class Jardinagem {

    String nomeJardim;
    Double qtdMetros;
    Integer qtdPlantas;
    Double qtdMetrosGrama;
    Double gramaAdubo;
    Double valorAdubo;
    Double valorMetroGrama;
    Double valorCorteGrama;

    public void usarAdubo(){
        gramaAdubo = (qtdMetrosGrama/2)*100;
        System.out.println("Irá utilizar no jardim " + gramaAdubo + " gramas");
    }
    public void precoAdubo(){
        double preco = gramaAdubo * valorAdubo;
        System.out.println("O preço a pagar  do adubo é R$: " + preco);
    }
    public void precoCorteGrama (){
        valorCorteGrama = qtdMetrosGrama * valorMetroGrama;
        System.out.println(" O valor total do corte da grama é R$: " + valorCorteGrama);
    }


}
