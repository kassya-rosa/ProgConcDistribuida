package br.com.atv1;

public class Cliente extends Thread{
	private String nome;
	private Conta conta;
	private Loja[] loja;
	
	public Cliente(String nome, double saldoIni, Loja[] loja) {
		this.nome = nome;
		this.loja = loja;
		this.conta = new Conta(nome,saldoIni);
	}
	
	public void run() {
		while(conta.getSaldo() > 0) {
			for (Loja loja : loja) {
				double cadaCompra = Math.random() > 0.4 ? 100 : 200;
                if (conta.retirar(cadaCompra)) {
                    loja.recebePgto(cadaCompra);
                    System.out.println("Cliente " +nome +" realizou uma compra de R$" + cadaCompra + " na loja " + loja.nome);
                    break; 
			}
		}
	}
		System.out.println("Acabou o dinheiro do Cliente " + nome);
	}

}
