package br.com.atv1;

public class Loja {
	
	public String nome;
	private Conta conta;
    private double saldoFuncis;
    private Funci[] funci;

    public Loja(String nome, double saldoIni, Funci[] funci) {
    	this.nome = nome;
        this.conta = new Conta(nome, saldoIni);
        this.saldoFuncis = 1400;
        this.funci = funci;
    }

    public void recebePgto(double valor) {
        conta.credita(valor);
        pgtoFuncis();
    }
    
    public void pgtoFuncis() {
    	for(Funci funci: funci)
        synchronized (conta) {
            if (conta.getSaldo() >= funci.salario) {
            	funci.start();
                conta.debita(saldoFuncis);
                System.out.println("Pagamento ao funcionário " +funci.getNome() + " da loja " + nome + " realizado");
            } ;
            }
        }
    }