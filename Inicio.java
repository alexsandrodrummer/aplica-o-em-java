
package Principal;

import Atividade.Cliente;
import Atividade.Conta;
import Atividade.ContaCorrente;
import Atividade.ContaPoupanca;


public class Inicio {
    
    public static void main(String args[]){
     Cliente Alex  = new Cliente("Alex Sandro nascimento sousa ", "045.654.961-00");
        Cliente raimundo  = new Cliente("raimundo nonato ", "035.457.789-00");
        Conta Corrente = new ContaCorrente(1, 1, Alex);
        Conta Poupanca = new ContaPoupanca(2, 2, raimundo);

        System.out.println(Corrente);
        System.out.println(Poupanca);

        System.out.println("*****************************************");
        Corrente.depositar(300);
        Poupanca.depositar(600);
        System.out.println("*****************************************");

        System.out.println(Corrente);
        System.out.println(Poupanca);

         
        Corrente.sacar();
        Poupanca.sacar();

        System.out.println(Corrente);
        System.out.println(Poupanca);
    }
}


