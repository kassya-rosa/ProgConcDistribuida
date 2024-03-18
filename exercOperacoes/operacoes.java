package br.com.progdist;

public class operacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1 = 10;
        double num2 = 5;

        OperacoesArit somaThread = new OperacoesArit("soma", num1, num2);
        OperacoesArit subtracaoThread = new OperacoesArit("subtracao", num1, num2);
        OperacoesArit multiplicacaoThread = new OperacoesArit("multiplicacao", num1, num2);
        OperacoesArit divisaoThread = new OperacoesArit("divisao", num1, num2);

        somaThread.start();
        subtracaoThread.start();
        multiplicacaoThread.start();
        divisaoThread.start();
		
	}

}
