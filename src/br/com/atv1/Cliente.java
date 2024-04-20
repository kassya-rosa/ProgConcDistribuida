package br.com.atv1;

public class Cliente extends Thread{
	private Conta conta;
	private Loja[] lojas;
	
	public Cliente(Conta conta, Loja[] lojas) {
		this.conta = conta;
		this.lojas = lojas;
	}
	
	public void run() {
		while(conta.getSaldo() > 0) {
			for (Loja lojas : lojas) {
				double cadaCompra = Math.random() > 0.5 ? 100 : 200;
                if (conta.retira(cadaCompra)) {
                    lojas.recebePgto(cadaCompra);
                    System.out.println("Cliente realizou uma compra de R$" + cadaCompra + " na loja.");
                    break; 
			}
		}
	}
		System.out.println("Acabou o dinheiro do Cliente.");
	}

}
