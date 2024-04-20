package br.com.atv1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Conta {
	
	private String titular;
    private double saldo;
    private final Lock lock = new ReentrantLock();

    public Conta(String titular, double saldoIni) {
        this.titular = titular;
        this.saldo = saldoIni;
    }

    public void credita(double valor) {
        lock.lock();
        try {
            saldo = saldo + valor;
        } finally {
            lock.unlock();
        }
    }

    public void debita(double valor) {
        lock.lock();
        try {
            saldo = saldo - valor;
        } finally {
            lock.unlock();
        }
    }

    public boolean retirar(double valor) {
        lock.lock();
        try {
            if (saldo >= valor) {
                saldo = saldo - valor;
                System.out.println("Retirada de R$" + valor + ". Saldo: R$" + saldo);
                return true;
            }
            return false;
        } finally {
            lock.unlock();
        }
    }
    
    public double getSaldo() {
        lock.lock();
        try {
            return saldo;
        } finally {
            lock.unlock();
        }
    }

    public String getTitular() {
        return titular;
    }
	
}