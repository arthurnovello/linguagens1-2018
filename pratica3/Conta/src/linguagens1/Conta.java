package linguagens1;

public class Conta {
    
    String numeroConta;
    private double saldo;
    Cliente cliente;
    
    public Conta(String nroConta, double saldoConta,String nomeConta, String sobrenomeConta, String cpfConta) {
        this.numeroConta = nroConta;
        this.saldo = saldoConta;
        this.cliente = new Cliente(nomeConta, sobrenomeConta, cpfConta);
    }
    
    public String visualizarSaldo() {
        return Double.toString(this.saldo);
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public String getNumeroConta(){
    return this.numeroConta;
    }
    
    public void depositar(double deposito) {
        this.saldo = deposito + this.saldo;
    }
    
    public boolean sacar(double saque) {
        boolean resposta;
        if (this.saldo < saque) {   
            resposta =  false;
        } else {
            this.saldo = this.saldo - saque;
            resposta =  true;
        }
        return resposta;
    }
    
    public boolean transferirDinheiro(double valor, Conta contaDestino) {
       boolean resposta = false;
        if(this.sacar(valor) == true) {
           contaDestino.depositar(valor);
           resposta = true;
       }
        return resposta;
    }
}
