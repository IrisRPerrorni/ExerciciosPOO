package Caixa;

import java.util.Scanner;

public class MainCaixa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Caixa conta = new Caixa();
        conta.saldo = 1000.0;
        conta.debito = 0;
        conta.credito = 0;

        System.out.println("Quantos lançamentos você deseja fazer? ");
        conta.lancamento = entrada.nextInt();
        for (int i = 0; i < conta.lancamento; i++) {
            System.out.println("Qual opção você deseja? ");
            System.out.println(" 1 - Débito");
            System.out.println(" 2 - Crédito");
            int opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Qual o valor que você deseja sacar? ");
                    double valor = entrada.nextDouble();
                    conta.contaDebito(valor);
                    break;
                case 2:
                    System.out.println("Qual o valor deseja depositar: ");
                    double deposito = entrada.nextDouble();
                    conta.contaCredito(deposito);
                    break;
                default:
                    System.out.println("opção invalida!");

            }



        }
    }

}
