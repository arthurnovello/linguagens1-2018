package atividade1;
/**
 *
 * @author Arthur Novello 14.03329-0
 *         Lucas Marques  16.01203-8
 */
public class Atividade1 {

    public static void main(String[] args) {
        
        Usuarios user1;
        user1 = new Usuarios("Arthur", "a@a.a", "444", "28/05", "nuBank",
                             "123");
        Cartoes cartao1 = new Cartoes("nuBank", "Visa", "Debito", "16/04",
                                      "02/22", user1);
        user1.carteira.adicionarCartao(cartao1);
        
        Usuarios user2;
        user2 = new Usuarios("Lucas", "b@b.b", "111", "25/09", "Santander",
                             "123");
        Cartoes cartao2 = new Cartoes("Santander", "Master", "Debito", "16/04",
                                      "02/22", user2);
        Cartoes cartao3 = new Cartoes("Santander", "Visa", "Credito", "16/04",
                                      "02/22", user2);
        user2.carteira.adicionarCartao(cartao2);
        user2.carteira.adicionarCartao(cartao3);
        
        //Pagamento com a senha correta
        user1.pagamento(cartao1, "123456");
        //Pagamento com a senha incorreta
        user2.pagamento(cartao3, "1233333");
        
        //Alterar a senha com a senha correta
        user1.carteira.alterarSenha("123", "456");
        //Alterar a senha com a senha incorreta
        user1.carteira.alterarSenha("125", "456");
        
        System.out.println(user1.getUsuario());
        System.out.println(user1.carteira.getCarteira());
        System.out.println(cartao1.getCartao());
        
        System.out.println(user2.getUsuario());
        System.out.println(user2.carteira.getCarteira());
        System.out.println(cartao2.getCartao());
        System.out.println(cartao3.getCartao());
        

        
    }
    
}
