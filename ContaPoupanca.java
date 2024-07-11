package Atividade;

public class ContaPoupanca  extends Conta{

    public ContaPoupanca(int numero, int agencia, Cliente cliente) {
        super(numero, agencia, cliente);
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    void deposista(double quantidade)
    {
        this.saldo += quantidade;
    }
    
    void saca(double quantidade)
    {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
   
    final double valorSaque = 10 +0.10;
    
   
    public void sacar() {
    	if (valorSaque > saldo) {
    		System.out.println("Saldo Insuficiente\nTransação não permetida.");
    	} else {
    		this.saldo -= valorSaque;
    		
    		System.out.println("Saque no valor de R$10.00 reais feito da Conta Poupança Realizado com Sucesso!");
    	
    	}
       
    }
}
