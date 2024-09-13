package com.ufn.javaacademy.Models;

import com.ufn.javaacademy.Interfaces.Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato com.ufn.javaacademy.Interfaces.Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
