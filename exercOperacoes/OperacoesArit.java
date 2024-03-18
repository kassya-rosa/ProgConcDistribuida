package br.com.progdist;

public class OperacoesArit extends Thread{
	
	private String operacao;
    private double num1;
    private double num2;

    public OperacoesArit(String operacao, double num1, double num2) {
        this.operacao = operacao;
        this.num1 = num1;
        this.num2 = num2;
    }
    
    @Override
    public void run() {
    	switch (operacao) {
        case "soma":
            System.out.println("Resultado da soma: " + (num1 + num2));
            break;
        case "subtracao":
            System.out.println("Resultado da subtração: " + (num1 - num2));
            break;
        case "multiplicacao":
            System.out.println("Resultado da multiplicação: " + (num1 * num2));
            break;
        case "divisao":
            if (num2 != 0) {
                System.out.println("Resultado da divisão: " + (num1 / num2));
            } else {
                System.out.println("Não é possível dividir por zero.");
            }
            break;
        default:
            System.out.println("Operação inválida.");
    	}
    }
}
