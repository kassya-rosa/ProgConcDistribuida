package br.com.atv1;

public class Funci extends Thread {

	private Conta contaProv;
    private Conta contaInvest;
    public double salario;

    public void Funcionario(Conta contaProv, Conta contaInvest, double salario) {
        this.contaProv = contaProv;
        this.contaInvest = contaInvest;
        this.salario = salario;
    }
	
    public void run() {
        while (true) {
            synchronized (contaProv) {
                if (contaProv.getSaldo() >= salario) {
                    contaProv.retira(salario);
                    double investimento = salario * 0.2;
                    contaInvest.deposita(investimento);
                    System.out.println("Funci recebeu R$" + salario);
                    System.out.println("Funci investiu R$" + investimento);
                    break;
                }
            }
        }
    }

}
