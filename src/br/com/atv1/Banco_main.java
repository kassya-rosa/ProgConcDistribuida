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

        // Inicia threads de clientes e funcionários
        
        funci1.start();
        funci2.start();
        funci3.start();
        funci4.start();
        
        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();
        
        // Aguarda a conclusão das threads dos clientes e funcionários
        
        try {
            funci1.join();
            funci2.join();
            funci3.join();
            funci4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        try {
            cliente1.join();
            cliente2.join();
            cliente3.join();
            cliente4.join();
            cliente5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        //Final
        
        System.out.println("\n\nFim do progrmama: \n");
        System.out.println("Saldo da conta do cliente " +cliente1.getNome() + ": " +cliente1.getConta().getSaldo() +"\n");
        System.out.println("Saldo da conta do cliente " +cliente2.getNome() + ": " +cliente2.getConta().getSaldo() +"\n");
        System.out.println("Saldo da conta do cliente " +cliente3.getNome() + ": " +cliente3.getConta().getSaldo() +"\n");
        System.out.println("Saldo da conta do cliente " +cliente4.getNome() + ": " +cliente4.getConta().getSaldo() +"\n");
        System.out.println("Saldo da conta do cliente " +cliente5.getNome() + ": " +cliente5.getConta().getSaldo() +"\n");
        
        System.out.println("Saldo da conta da Loja1 " +loja1.getConta().getSaldo() + "\n");
        System.out.println("Saldo da conta da Loja2 " +loja2.getConta().getSaldo() + "\n");
        
	}
}