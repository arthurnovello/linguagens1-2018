package aula4;

/**
 * @author 14.03329-0
 *         Arthur Novello
 */
public class Aula4 {

    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        
        c1.saldo = 852000;
        if(c1.sacar(852000) == false) {
            System.out.println("Valor acima do permitido");
        }
        c1.depositar(1000);
        
        
       String visualizar = "CONTA 1: " + c1.visualizarSaldo() + "\n"
                           + c2.visualizarSaldo();
        
    
        
        System.out.println(visualizar);
    }
    
}
