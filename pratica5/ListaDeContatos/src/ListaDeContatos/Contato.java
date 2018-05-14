package ListaDeContatos;

/**
 *
 * @author 14.03329-0
 */
public class Contato {
    
    private String nomeContato;
    private String numeroContato;
    
    public Contato(String nome, String numero) {
        this.nomeContato = nome;
        this.numeroContato = numero;
    }
    
    public void setNome(String nome) {
        this.nomeContato = nome;
    }
    
    public String getNome (){
        return this.nomeContato;
    }
    
    public void setNumero(String numero){
    this.numeroContato = numero;
    }
    
    public String getNumero (){
        return this.numeroContato;
    }
}
