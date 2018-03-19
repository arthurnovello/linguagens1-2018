package aula4;

/**
 * @author 14.03329-0
 *         Arthur Novello
 */
public class Aula4 {

    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        c1.cliente = new Cliente();
        c1.cliente.cpf = "111111";
        Conta c2 = new Conta();
        c2.cliente = new Cliente();
        c2.cliente.cpf = "222222";
        
        c1.saldo = 851999;
        if(c1.sacar(852000) == false) {
            System.out.println("Valor  de saque acima do permitido.\n");
        }
        c1.depositar(1000);
        c1.transferirDinheiro(250, c2);
        
        
       String visualizar = "CONTA 1: " + c1.visualizarSaldo() + "\n\tCONTA 2: "
                           + c2.visualizarSaldo();
        
    
        
        System.out.println("::SALDO::\n\t"+visualizar);
    }
    
}
