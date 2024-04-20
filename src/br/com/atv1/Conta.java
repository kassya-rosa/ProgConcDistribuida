package br.com.atv1;

import java.util.concurrent.locks.ReentrantLock;

public class Conta {
	
	private double saldo;
    private ReentrantLock lock;

    public Conta(double saldoIni) {
        this.saldo = saldoIni;
        this.lock = new ReentrantLock();
    }
	
}
