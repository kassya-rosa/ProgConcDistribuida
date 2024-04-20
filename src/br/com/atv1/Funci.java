package br.com.atv1;

public class Funci extends Thread {

	private Conta contaProv;
    private Conta contaInvest;
    private double salario;

    public void Funcionario(Conta contaProv, Conta contaInvest, double salario) {
        this.contaProv = contaProv;
        this.contaInvest = contaInvest;
        this.salario = salario;
    }
	
}
