package Jardim;

import java.util.Scanner;

public class MainJardim {
    public static void main(String[] args) {
        Jardinagem jardim = new Jardinagem();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do jardim: ");
        jardim.nomeJardim = entrada.nextLine();
        System.out.println("Quantos metros tem o jardim: ");
        jardim.qtdMetros = entrada.nextDouble();
        System.out.println("Quantas plantas tem o jardim: ");
        jardim.qtdPlantas = entrada.nextInt();
        System.out.println("Quantos metros tem a grama do jardim: ");
        jardim.qtdMetrosGrama = entrada.nextDouble();
        jardim.gramaAdubo = 100.0;
        System.out.println("Qual o valor em R$ do adubo");
        jardim.valorAdubo = entrada.nextDouble();
        System.out.println("Digite o valor em R$ de 1 metro de grama: ");
        jardim.valorMetroGrama = entrada.nextDouble();



        jardim.usarAdubo();
        jardim.precoAdubo();
        jardim.precoCorteGrama();

    }


}
