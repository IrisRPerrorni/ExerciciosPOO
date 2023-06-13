package ContaCorrente;

public class ContaCorrente {

    Integer numConta;
    String nomeCorrentista;
    Double saldo;

   public void exibir (int numConta , String nomeCorrentista){
       System.out.println("O número da conta é: " + numConta);
       System.out.println("O nome do correntista é: " + nomeCorrentista);
       System.out.println(" O saldo é: " + saldo);
    }

    public Double depositoConta(double deposito){
        double saldoDeposito = saldo + deposito;
        return saldoDeposito;
    }
    public Double saqueConta(double saque){
        double saldoSaque = saldo - saque;
        return saldoSaque;
    }
}
