package br.com.atv1;

public class Loja {
	
	private Conta conta;
    private Funci[] funci;

    public Loja(Conta conta, Funci[] funci) {
        this.conta = conta;
        this.funci = funci;
    }

	public void recebePgto(double valor) {
		// TODO Auto-generated method stub
		conta.deposita(valor);
        verificaPgtoFunci();
	}
	
	public void verificaPgtoFunci() {
        for (Funci funci : funci) {
            synchronized (conta) {
                if (conta.getSaldo() >= funci.salario) {
                    funci.start();
                }
            }
        }
    }

}
