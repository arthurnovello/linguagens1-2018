package concessionariatipo2;

/**
 * @author 14.03329-0
 *         Arthur Novello
 */
public class ConcessionariaTipo2 {

    public static void main(String[] args) {
        Gerente g1 = new Gerente(12000.00);
        Gerente g2 = new Gerente(10000.00);
        Gerente g3 = new Gerente(120000.00);  
        
        Vendedor v1 = new Vendedor(12000.00, g1);
        Vendedor v2 = new Vendedor(1000.00, g2);
        Vendedor v3 = new Vendedor(120000.00, g3);    
       
        v1.venda(1000);      
        v2.venda(12000);            
        v3.venda(1000000); 
        
        String visualizar = "Funcionario 1: \nComissao:\t" + v1.getComissao() +
                            "\t Salario Base:\t" + v1.getSalarioBase() +
                            "\t Salario do Mes:\t" + v1.getSalarioDoMes() +
                            "\nFuncionario 2: \nComissao:\t" + v2.getComissao() +
                            "\t Salario Base:\t" + v2.getSalarioBase() +
                            "\t Salario do Mes:\t" + v2.getSalarioDoMes() +
                            "\nFuncionario 3: \nComissao:\t" + v3.getComissao() +
                            "\t Salario Base:\t" + v3.getSalarioBase() +
                            "\t Salario do Mes:\t" + v3.getSalarioDoMes();
        System.out.println(visualizar);
        
        System.out.println("\n\n\n");
        
        g1.venda(10000);      
        g2.venda(120000);            
        g3.venda(10000000);
        
        visualizar = "Funcionario 1: \nComissao:\t" + v1.getComissao() +
                            "\t Salario Base:\t" + v1.getSalarioBase() +
                            "\t Salario do Mes:\t" + v1.getSalarioDoMes() +
                            "\nFuncionario 2: \nComissao:\t" + v2.getComissao() +
                            "\t Salario Base:\t" + v2.getSalarioBase() +
                            "\t Salario do Mes:\t" + v2.getSalarioDoMes() +
                            "\nFuncionario 3: \nComissao:\t" + v3.getComissao() +
                            "\t Salario Base:\t" + v3.getSalarioBase() +
                            "\t Salario do Mes:\t" + v3.getSalarioDoMes() +
                            "\n\nGerente 1: \nComissao:\t" + g1.getComissao() +
                            "\t Salario Base:\t" + g1.getSalarioBase() +
                            "\t Salario do Mes:\t" + g1.getSalarioDoMes() +
                        "\nGerente 2: \nComissao:\t" + g2.getComissao() +
                            "\t Salario Base:\t" + g2.getSalarioBase() +
                            "\t Salario do Mes:\t" + g2.getSalarioDoMes() +
                                "\nGerente 3: \nComissao:\t" + g3.getComissao() +
                            "\t Salario Base:\t" + g3.getSalarioBase() +
                            "\t Salario do Mes:\t" + g3.getSalarioDoMes();
        System.out.println(visualizar);
        
        System.out.println("\n\n\n");
        
        g1.aumento(500, v1);      
        g1.aumento(300, v2);  
        g1.aumento(200, v3);  
        
        visualizar = "Funcionario 1: \nComissao:\t" + v1.getComissao() +
                            "\t Salario Base:\t" + v1.getSalarioBase() +
                            "\t Salario do Mes:\t" + v1.getSalarioDoMes() +
                            "\nFuncionario 2: \nComissao:\t" + v2.getComissao() +
                            "\t Salario Base:\t" + v2.getSalarioBase() +
                            "\t Salario do Mes:\t" + v2.getSalarioDoMes() +
                            "\nFuncionario 3: \nComissao:\t" + v3.getComissao() +
                            "\t Salario Base:\t" + v3.getSalarioBase() +
                            "\t Salario do Mes:\t" + v3.getSalarioDoMes() +
                            "\n\nGerente 1: \nComissao:\t" + g1.getComissao() +
                            "\t Salario Base:\t" + g1.getSalarioBase() +
                            "\t Salario do Mes:\t" + g1.getSalarioDoMes() +
                        "\nGerente 2: \nComissao:\t" + g2.getComissao() +
                            "\t Salario Base:\t" + g2.getSalarioBase() +
                            "\t Salario do Mes:\t" + g2.getSalarioDoMes() +
                                "\nGerente 3: \nComissao:\t" + g3.getComissao() +
                            "\t Salario Base:\t" + g3.getSalarioBase() +
                            "\t Salario do Mes:\t" + g3.getSalarioDoMes();
        System.out.println(visualizar);
    } 
    
    
}
