package com.bancario.conta_bancaria;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (isValorPositivo(valor)) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (!isValorPositivo(valor)) {
            return;
        }

        if (!possuiSaldoSuficiente(valor)) {
            return;
        }

        saldo -= valor;
    }

    private boolean isValorPositivo(double valor) {
        return valor > 0;
    }

    private boolean possuiSaldoSuficiente(double valor) {
        return valor <= saldo;
    }
}
