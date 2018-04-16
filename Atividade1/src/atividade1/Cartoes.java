package atividade1;
/**
 *
 * @author Arthur Novello 14.03329-0
 *         Lucas Marques  16.01203-8
 */
public class Cartoes {
    // nrCartao é usado para criar um idCartao qualquer
    private double taxaConversaoDolar = 3.28;
    private static int nroCartao;
    private int idCartao;
    private String label;
    private String emissorCartao;
    private String tipo;
    private String dataEmissao;
    private String validade;
    private int ccv;
    private String senha;
    private int numeroCartao;
    private int numeroConta;
    
    public Cartoes (String cLabel, String cEmissor, String cTipo, String cData,
                    String cValidade, Usuarios cUser) {
        this.label = cLabel;
        this.emissorCartao = cEmissor;
        this.tipo = cTipo;
        this.dataEmissao = cData;
        this.validade = cValidade;
        Cartoes.nroCartao += 1;
        this.idCartao = Cartoes.nroCartao;
        this.ccv = 100 + this.idCartao;
        this.numeroConta = cUser.getConta();
        this.numeroCartao = 10000 + this.idCartao;
        this.senha = "123456";
    }
    
    public boolean validarSenha (String csenha) {
        boolean valido;
        valido = csenha.equals(this.senha);
        return valido;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public String getCartao() {
        return "ID Cartao: " + this.idCartao + "\tLabel:" + this.label
                + "\tEmissor: " + this.emissorCartao + "\tTipo: " + this.tipo
                + "\tData de Emissao" + this.dataEmissao + "\tValidade: "
                + this.validade + "\tNro Cartao: " + this.numeroCartao
                + "\tNro Conta: " + this.numeroConta;
    }
}
