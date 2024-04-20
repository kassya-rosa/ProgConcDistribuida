package br.com.atv1;

public class Banco_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Cria funcionários
		
        Funci funci1 = new Funci("Maria", 1400);
        Funci funci2 = new Funci("José", 1400);
        Funci funci3 = new Funci("João", 1400);
        Funci funci4 = new Funci("Bruno", 1400);

        Funci[] funcisLoja1 = {funci1, funci2};
        Funci[] funcisLoja2 = {funci3, funci4};

        // Cria lojas
        
        Loja loja1 = new Loja("Loja1", 0, funcisLoja1);
        Loja loja2 = new Loja("Loja2", 0, funcisLoja2);

        Loja[] lojas = {loja1, loja2};

        // Cria clientes
        
        Cliente cliente1 = new Cliente("Pedro", 1000, lojas);
        Cliente cliente2 = new Cliente("Augusto", 1000, lojas);
        Cliente cliente3 = new Cliente("Otávio", 1000, lojas);
        Cliente cliente4 = new Cliente("Célia", 1000, lojas);
        Cliente cliente5 = new Cliente("Noêmia", 1000, lojas);

        // Inicia threads de clientes 
        
        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();

	}
}