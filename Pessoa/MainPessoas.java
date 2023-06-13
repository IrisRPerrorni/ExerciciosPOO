package Pessoa;

import java.util.Scanner;

public class MainPessoas {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("José", 22 , 90.0 , 1.90);
        Pessoa pessoa2 = new Pessoa("Alana", 5 , 0.0 , 1.20);

        //descrição usando método sem retorno
        pessoa1.descricao();
        pessoa2.descricao();

        // usando método com retorno e parametro envelhecer
        System.out.println("_________________________");
        System.out.println("Em dez anos o "+ pessoa1.nome + " terá " + pessoa1.envelhecer(10) + " anos ");
        System.out.println("Em dez anos a "+ pessoa2.nome + " terá " + pessoa2.envelhecer(10) + " anos ");

        //usando método sem retorno engordar
        System.out.println("_________________________");
        System.out.println("Se " + pessoa1.nome + " engordar 10kg " + " terá: ");
        pessoa1.engordar();
        System.out.println("Se " + pessoa2.nome + " engordar 10kg " + " terá: ");
        pessoa2.engordar();

        //usando método sem retorno emagrecer
        System.out.println("_________________________");
        System.out.println("Se" + pessoa1.nome + " emagrecer 5kg " + "terá: ");
        pessoa1.emagrecer();
        System.out.println("Se " + pessoa2.nome + " emagrecer 5kg " + "terá: ");
        pessoa2.emagrecer();

        //usando método sem retorno crescer
        System.out.println("_________________________");
        System.out.println("Quem irá crescer até os 21 anos");
        System.out.println(pessoa1.nome + ": ");
        pessoa1.crescer();
        System.out.println(pessoa2.nome + ": ");
        pessoa2.crescer();






    }


}
