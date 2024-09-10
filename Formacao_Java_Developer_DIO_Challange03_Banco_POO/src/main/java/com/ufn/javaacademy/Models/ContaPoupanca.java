package com.ufn.javaacademy.Models;

import com.ufn.javaacademy.Interfaces.Conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato com.ufn.javaacademy.Interfaces.Conta Poupanca ===");
		super.imprimirInfosComuns();
	}
}
