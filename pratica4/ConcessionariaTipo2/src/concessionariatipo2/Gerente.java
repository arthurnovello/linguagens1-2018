package concessionariatipo2;

public class Gerente {
       private static int numeroDeGerentes;
       private static double vendasConcessionaria;
       private double vendasRealizadas;
       private double comissao;
       private double salarioBase;
       private double salarioDoMes;
        
       public Gerente(double valorSalario){
           this.salarioBase = valorSalario;
           Gerente.numeroDeGerentes += 1;
       }
       
       public void venda(double valorVenda) {
           this.vendasRealizadas += valorVenda;
           Gerente.vendasConcessionaria += valorVenda;
       }
       
       public void comissao() {
           double comissaoConcessionaria = 0.1*Gerente.vendasConcessionaria;
           this.comissao = 0.5*this.salarioBase + (comissaoConcessionaria/Gerente.numeroDeGerentes);
       }
       
       public void aumento(double valorAumento, Vendedor vendedor) {
           vendedor.setSalarioBase(valorAumento);
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
