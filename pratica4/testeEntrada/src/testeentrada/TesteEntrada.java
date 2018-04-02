package testeentrada;

import java.util.Scanner;


/**
 * @author 14.03329-0
 *         Arthur Novello
 */
public class TesteEntrada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite uma idade");
        int a = entrada.nextInt();
        
        
        System.out.println("A sua idade eh "+ a);
    }
    
}
