package aula4;

public class Conta {
    
    String numeroConta;
    double saldo;
    Cliente cliente;
    
    String visualizarSaldo() {
        return Double.toString(this.saldo);
    }
    
    void depositar(double deposito) {
        this.saldo = deposito + this.saldo;
    }
    
    boolean sacar(double saque) {
        boolean resposta;
        if (this.saldo < saque) {   
            resposta =  false;
        } else {
            this.saldo = this.saldo - saque;
            resposta =  true;
        }
        return resposta;
    }
    
    boolean transferirDinheiro(double valor, Conta contaDestino) {
       boolean resposta = false;
        if(this.sacar(valor) == true) {
           contaDestino.depositar(valor);
           resposta = true;
       }
        return resposta;
    }
}
