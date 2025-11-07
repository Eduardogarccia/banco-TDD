package com.bancario.conta_bancaria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    void testCriarConta() {
        ContaBancaria conta = new ContaBancaria();
        assertEquals(0.0, conta.getSaldo(), "O saldo inicial deve ser 0.0");
    }

    @Test
    void testDepositar() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100.0);
        assertEquals(100.0, conta.getSaldo(), "O saldo deve ser 100.0 após depósito");
    }

    @Test
    void testSacar() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(200.0);
        conta.sacar(100.0);
        assertEquals(100.0, conta.getSaldo(), "O saldo deve ser 100.0 após saque");
    }

    @Test
    void testSacarMaiorQueSaldo() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(50.0);
        conta.sacar(100.0);
        assertEquals(50.0, conta.getSaldo(), "Não pode sacar mais do que o saldo");
    }

    @Test
    void testSacarValorNegativo() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(50.0);
        conta.sacar(-10.0);
        assertEquals(50.0, conta.getSaldo(), "Não pode sacar um valor negativo");
    }
}
