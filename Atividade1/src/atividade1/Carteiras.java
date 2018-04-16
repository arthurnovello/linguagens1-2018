package atividade1;

/**
 *
 * @author Arthur Novello 14.03329-0
 *         Lucas Marques  16.01203-8
 */
public class Carteiras {
    // nroCarteiras é usado para criar um idCarteira qualquer
    private static int nroCarteiras;
    private int idCarteira;
    private String nomeCarteira;
    private String senhaAcesso;
    Cartoes cartaoDebito;
    Cartoes cartaoCredito;
    
    public Carteiras (String cNome, String cSenha) {
    Carteiras.nroCarteiras += 1;
    this.idCarteira = Carteiras.nroCarteiras;
    this.nomeCarteira = cNome;
    this.senhaAcesso = cSenha;
    }
    
    // O metodo valida o tipo de cartao antes de adicionar a carteira
    public void adicionarCartao (Cartoes cartao) {
        if("Debito".equals(cartao.getTipo())){
            this.cartaoDebito = cartao;
        } else {
            this.cartaoCredito = cartao;
        }
    }
    
    public void alterarSenha(String senhaAntiga, String senhaNova) {
        boolean valido;
        if(senhaAntiga.equals(this.senhaAcesso)){
            this.senhaAcesso = senhaNova;
            System.out.println("Senha alterada com sucesso");
        } else {
            System.out.println("Senha não alterada");
        }
    }
    
    public String getCarteira(){
        return "ID Carteira: " + this.idCarteira + "\tNome da Carteira: "
                                        + this.nomeCarteira;
    }
}
