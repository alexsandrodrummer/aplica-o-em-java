package Atividade;

public abstract class Conta {
    
    protected int numero;
    protected int agencia;
    protected Cliente cliente;
    protected double saldo = 0;
    

    public Conta(int numero, int agencia, Cliente cliente) {
        this.numero = Math.abs(numero);
        this.agencia = Math.abs(agencia);
        this.cliente = cliente;
    }


    public abstract void sacar();


    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Desósito de " + valor + " realizado com sucesso!!\n");
    }

    public double getsaldo() {
        return this.saldo;
    }

   
    public String toString() {
        if (numero == 1) {
            return "*********Dados da conta Bancária********* \n\nCliente: " + cliente.getNome() + " - CPF: " + cliente.getCpf() + "\nConta Corrente: " + numero
                    + "\nAgência: " + agencia + "\nSaldo: " + saldo + "\n\n";

        } else {
            return "*********Dados da conta Bancária********* \n\nCliente: " + cliente.getNome() + " - CPF: " + cliente.getCpf() + "\nConta Poupança: " + numero
                    + "\nAgência: " + agencia + "\nSaldo: " + saldo + "\n\n";
        }

    }
}
