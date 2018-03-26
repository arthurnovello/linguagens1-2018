package linguagens1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    private int idade;
    
    public Cliente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
        
    public String getCPF(){
        return this.cpf;
    }
    
   public int getIdade(){
        return this.idade;
    }
    
    public void mudarCPF(String cpf){
        if (validarCPF(cpf)){
            this.cpf = cpf;
        } else {
            System.out.println("Não foi possivel alterar o CPF");
        }
    }
    
    private boolean validarCPF(String cpf){
        if("".equals(cpf)){
			return false;
		}
        Pattern padrao = Pattern.compile("^([0-9]{3}\\.?){3}-?[0-9]{2}$");
        Matcher matcher = padrao.matcher(cpf);
		return matcher.matches();
    }
}
