package aula4;

/**
 * @author 14.03329-0
 *         Arthur Novello                                                                           olocomeu
 */
public class Aula4 {

    public static void main(String[] args) {
        
        Conta c1 = new Conta("0971 0212-9", 841999, "Arthur", "Novello", "444.379.498-03");
        Conta c2 = new Conta("1403 3329-0", 00000, "Julinho", "da Van", "222222");
        
        
        if(c1.sacar(852000) == false) {
            System.out.println("Valor de saque acima do permitido.\n");
        }
        c1.depositar(1000);
        c1.transferirDinheiro(250, c2);
        
        
       String visualizar = "CONTA 1: " + c1.visualizarSaldo() + "\n\tCONTA 2: "
                           + c2.visualizarSaldo();
        
    
        
        System.out.println("::SALDO::\n\t"+visualizar);
    }
    
}
