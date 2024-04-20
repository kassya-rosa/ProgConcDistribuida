package br.com.atv1;

import java.util.concurrent.locks.ReentrantLock;

public class Conta {
	
	private double saldo;
    private ReentrantLock lock;

    public Conta(double saldoIni) {
        this.saldo = saldoIni;
        this.lock = new ReentrantLock();
    }

	public double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public boolean retira(double valor) {
		// TODO Auto-generated method stub
		lock.lock();
        try {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Retirada de R$" + valor + ". Saldo atual: R$" + saldo);
                return true;
            }
            return false;
        } finally {
            lock.unlock();
        }
	}

	public void deposita(double valor) {
		// TODO Auto-generated method stub
		lock.lock();
        try {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + ". Saldo atual: R$" + saldo);
        } finally {
            lock.unlock();
        }
	}
	
}
