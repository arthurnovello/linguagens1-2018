package ListaDeContatos;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaDeContatos {
    private ArrayList<Contato> contato = new ArrayList<Contato>();
    
    public void adicionarContato(String nome, String numero){
       this.contato.add(new Contato(nome, numero));
    }
    
    public String exibirContato (String nome){
        Iterator<Contato> c = this.contato.iterator();
        Contato cTemp;
        
        while (c.hasNext()) {
            cTemp = c.next();
            if(nome.equals(cTemp.getNome())) {
              return cTemp.getNome() + "\t" + cTemp.getNumero();
            }            
        }
        return "Contato não encontrado";
    }
}
