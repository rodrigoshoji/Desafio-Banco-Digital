package edu.rodrigo.orientadaObjeto;

public class Main {

    public static void main(String[] args) {
      Conta cc = new ContaCorrente();
      Conta poupanca = new ContaPoupanca();
      cc.depositar(300);
      cc.transferir(100, poupanca);

      cc.imprimirExtrato();
      
      poupanca.sacar(50);
      poupanca.imprimirExtrato();  
    }
    

}
