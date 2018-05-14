package ListaDeContatos;

import java.util.ArrayList;

/**
 *
 * @author 14.03329-0
 */
public class Celular {

    public static void main(String[] args) {
        ListaDeContatos lista = new ListaDeContatos();
        
        lista.adicionarContato("Arthur", "999911111");
        
        System.out.println(lista.exibirContato("Arthur"));
    }
    
}
