package br.com.atv1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banco_transf {

	private final Lock lock = new ReentrantLock();

    public void transferencia(Conta origem, Conta destino, double valor) {
        lock.lock();
        try {
            if (origem.getSaldo() >= valor) {
                origem.debita(valor);
                destino.credita(valor);
                System.out.println("Transferência de R$ " + valor + " realizada de " + origem.getCliente().getNome() + " para " + destino.getCliente().getTitular());
            } else {
                System.out.println("Sem saldo para transferência de " + origem.getCliente().getNome() + " para " + destino.getCliente().getNome());
            }
        } finally {
            lock.unlock();
        }
    }
}
