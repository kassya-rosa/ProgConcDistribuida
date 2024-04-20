package br.com.atv1;

public class Loja {
	
	public String nome;
	private Conta conta;
    private double saldoFuncis;

    public Loja(String nome, double saldoIni) {
    	this.nome = nome;
        this.conta = new Conta(nome, saldoIni);
        this.saldoFuncis = 0;
    }

    public void recebePgto(double valor) {
        conta.credita(valor);
        pgtoFuncis();
    }
    
    public void pgtoFuncis() {
        synchronized (this) {
            if (conta.getSaldo() >= saldoFuncis) {
                conta.debita(saldoFuncis);
                System.out.println("Pagamento de funcionários da loja " + nome + " realizado");
            } else {
                System.out.println("Sem saldo para pagar funcionários na loja " + nome);
            }
        }
    }
}