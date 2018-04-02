package concessionariatipo2;

public class Vendedor {
    private static int numeroDeVendedores;
       private static double vendasConcessionaria;
       private double vendasRealizadas;
       private double comissao;
       private double salarioBase;
       private double salarioDoMes;
       Gerente gerente;
        
       public Vendedor(double valorSalario, Gerente gerenteResponsavel){
           this.salarioBase = valorSalario;
           this.gerente = gerenteResponsavel;
           Vendedor.numeroDeVendedores += 1;
       }
       
       public void venda(double valorVenda) {
           this.vendasRealizadas += valorVenda;
           Vendedor.vendasConcessionaria += valorVenda;
       }
       
       public void comissao() {
           double comissaoConcessionaria = 0.05*Vendedor.vendasConcessionaria;
           this.comissao = comissaoConcessionaria/
                                              Vendedor.numeroDeVendedores;
       }
       
       public double getComissao() {
           comissao();
           return this.comissao;
       }
       
       public void setSalarioBase(double aumento) {
           this.salarioBase += aumento;
       }
       
       public double getSalarioBase() {
           return this.salarioBase;
       }
        
       public double getSalarioDoMes() {
           this.salarioDoMes = this.salarioBase + this.comissao;
           return this.salarioDoMes;
       }
}
