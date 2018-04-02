package Concessionaria;

public class Funcionarios {
       private static int numeroDeFuncionarios;
       private static double vendasConcessionaria;
       private double comissao;
       private double salarioBase;
       private double salarioDoMes;
        
       public Funcionarios(double valorSalario){
           this.salarioBase = valorSalario;
           Funcionarios.numeroDeFuncionarios += 1;
       }
       
       public void venda(double valorVenda) {
           Funcionarios.vendasConcessionaria += valorVenda;
       }
       
       public void comissao() {
           double comissaoConcessionaria = 0.05*Funcionarios.vendasConcessionaria;
           this.comissao = comissaoConcessionaria/
                                              Funcionarios.numeroDeFuncionarios;
       }
       
       public double getComissao() {
           comissao();
           return this.comissao;
       }
       
       public double getSalarioBase() {
           return this.salarioBase;
       }
        
       public double getSalarioDoMes() {
           this.salarioDoMes = this.salarioBase + this.comissao;
           return this.salarioDoMes;
       }
        
        
}
