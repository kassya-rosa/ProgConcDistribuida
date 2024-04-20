package br.com.atv1;

public class Funci extends Thread {

	private String nome;
    private Conta ctaSalario;
    private Conta ctaInvest;
    public double salario;

    public Funci(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.ctaSalario = new Conta(nome + " - Salário", 0);
        this.ctaInvest = new Conta(nome + " - Investimentos", 0);
    }

    public String getNome() {
        return nome;
    }
    
    @Override
    public void run() {
        synchronized (ctaSalario) {
            ctaSalario.credita(salario);
            double valorInvestimento = salario * 0.2;
            ctaSalario.debita(valorInvestimento);
            ctaInvest.credita(valorInvestimento);
            System.out.println(nome + " recebeu o salário de R$" + salario + " e investiu R$" + valorInvestimento);
        }
    }
}