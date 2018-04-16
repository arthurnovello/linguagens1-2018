package atividade1;
/**
 *
 * @author Arthur Novello 14.03329-0
 *         Lucas Marques  16.01203-8
 */
public class Usuarios {
    private String nome;
    private String email;
    private String cpf;
    private String nascimento;
    // nroContas é usado para criar um idConta qualquer
    private static int nroContas;
    private int idConta;
    Carteiras carteira;
    
    public Usuarios(String uNome, String uEmail, String uCpf,
                    String uNascimento, String nomeCarteira,
                    String senhaCarteira) {
        this.nome = uNome;
        this.email = uEmail;
        this.cpf = uCpf;
        this.nascimento = uNascimento;
        Usuarios.nroContas += 1;
        this.idConta = Usuarios.nroContas;
        this.carteira = new Carteiras(nomeCarteira, senhaCarteira);
    }
    
    public int getConta() {
        return this.idConta;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    // Porque o usuario é quem realiza o pagamento, independente de qual cartão
    //ele vai usar
    public void pagamento(Cartoes cartao, String senha) {
        if (cartao.validarSenha(senha) == true) {
            System.out.println("Pagamento realizado");
        } else {
            System.out.println("Erro no pagamento");
        }
    }
    
    public String getUsuario(){
    return "Nome: " + this.nome + "\tEmail: " + this.email +
            " \tCPF: " + this.cpf + "\tData de Nascimento: " + this.nascimento
            + "\tID Conta: " + this.idConta;
    }
    
}
