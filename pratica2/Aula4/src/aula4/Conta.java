package aula4;

public class Conta {
    
    String numeroConta;
    String titular;
    double saldo;
    String cpf;
    
    String visualizarSaldo() {
        return Double.toString(this.saldo );
    }
    
    void depositar(double deposito) {
        this.saldo = deposito + this.saldo;
    }
    
    boolean sacar(double saque) {
        if (this.saldo < saque) {
            return false;
        } else {
            this.saldo = this.saldo - saque;
            return true;
        }
    }
    
    void transferirDinheiro() {
    
    }
}
