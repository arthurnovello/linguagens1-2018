package aula4;

/**
 * @author 14.03329-0
 *         Arthur Novello
 */
public class Aula4 {

    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        
        c1.saldo = 851999;
        if(c1.sacar(852000) == false) {
            System.out.println("Valor acima do permitido");
        }
        c1.depositar(1000);
        c1.transferirDinheiro(250, c2);
        
        
       String visualizar = "CONTA 1: " + c1.visualizarSaldo() + "\n\tCONTA 2: "
                           + c2.visualizarSaldo();
        
    
        
        System.out.println("::SALDO::\n\t"+visualizar);
    }
    
}
