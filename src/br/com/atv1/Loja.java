package br.com.atv1;

public class Loja {
	
	public String nome;
	private Conta conta;
    private Funci[] funci;

    public Loja(String nome, double saldoIni, Funci[] funci) {
    	this.nome = nome;
        this.conta = new Conta(nome, saldoIni);
        this.funci = funci;
    }
    
    public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

    public synchronized void recebePgto(double valor) {
        conta.credita(valor);
        pgtoFuncis();
    }

 	private synchronized void pgtoFuncis() {
 		for(Funci funci:funci) {
		    if (conta.getSaldo() >= 1400) {
	            conta.debita(1400);
	            System.out.println("Pagamento ao funcionário " + funci.getNome() + " da loja " + nome + " realizado");
	        }
 		}
	}
    
}