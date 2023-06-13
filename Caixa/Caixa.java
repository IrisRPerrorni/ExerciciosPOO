package Caixa;

public class Caixa {
    String nomeConta;
    Integer numConta;
    Double saldo;
    Integer credito;
    Integer debito;
    Integer lancamento;

    public void contaDebito(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            debito++;
            System.out.println(" Foi debitado na conta: " + valor);
            System.out.println("O saldo da conta é: " + saldo);
        } else {
            System.out.println("Saldo insuficiente faça depósito!");
        }
    }

    public void contaCredito(double valor) {
        saldo += valor;
        System.out.println(" O valor a ser depositado é: " + valor);
        System.out.println(" O saldo da conta é: " + saldo);

    }

}
