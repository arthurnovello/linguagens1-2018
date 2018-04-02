package Concessionaria;

/*
 * @author 14.03329-0
 *         Arthur Novello
 */
public class Concessionaria {

    public static void main(String[] args) {
        
        Funcionarios f1 = new Funcionarios(12000.00);
        Funcionarios f2 = new Funcionarios(1000.00);
        Funcionarios f3 = new Funcionarios(120000.00);    
       
        f1.venda(1000);      
        f2.venda(12000);            
        f3.venda(1000000); 
        
        String visualizar = "Funcionario 1: \nComissao:\t" + f1.getComissao() +
                            "\t Salario Base:\t" + f1.getSalarioBase() +
                            "\t Salario do Mes:\t" + f1.getSalarioDoMes() +
                            "\nFuncionario 2: \nComissao:\t" + f2.getComissao() +
                            "\t Salario Base:\t" + f2.getSalarioBase() +
                            "\t Salario do Mes:\t" + f2.getSalarioDoMes() +
                            "\nFuncionario 3: \nComissao:\t" + f3.getComissao() +
                            "\t Salario Base:\t" + f3.getSalarioBase() +
                            "\t Salario do Mes:\t" + f3.getSalarioDoMes();
        System.out.println(visualizar);
    }
    
}
