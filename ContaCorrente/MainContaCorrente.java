package ContaCorrente;

import java.util.Scanner;

public class MainContaCorrente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente();

        System.out.println("Digite o número da conta: ");
        conta.numConta = entrada.nextInt();
        System.out.println("Digite o nome do correntista");
        conta.nomeCorrentista = entrada.next();
        conta.saldo = 0.0;


        System.out.println("digite a opção desejada: ");
        System.out.println(" 1 - Depósito");
        System.out.println(" 2 - Saque");


        int resposta = entrada.nextInt();
        switch (resposta){
            case 1:
                System.out.println("------------Opção depósito-------");
                System.out.println("digite o valor do saldo: ");
                conta.saldo = entrada.nextDouble();
                conta.exibir(conta.numConta, conta.nomeCorrentista);
                System.out.println("Digite o valor depositado: ");
                Double valorDeposito = entrada.nextDouble();
                System.out.println("Valor após o deposito em conta R$: " + conta.depositoConta(valorDeposito));
                break;
            case 2:
                System.out.println("------------Opção Saque-------");
                conta.exibir(conta.numConta, conta.nomeCorrentista);
                System.out.println("digite o valor do saldo: ");
                conta.saldo = entrada.nextDouble();
                System.out.println("Digite o valor do saque");
                Double valorSaque = entrada.nextDouble();
                System.out.println("Valor da conta após o saque: " + conta.saqueConta(valorSaque));
                break;
            default:
                System.out.println("Informação invalida");

        }



    }
}