package br.com.atv1;

public class Cliente extends Thread{
	private Conta conta;
	private Loja[] lojas;
	
	public Cliente(Conta conta, Loja[] lojas) {
		this.conta = conta;
		this.lojas = lojas;
	}
	
}
