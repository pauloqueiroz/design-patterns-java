package service;

import investimento.strategy.Investimento;
import model.Conta;

public class RealizadorInvestimentos {

	public void investir(Conta conta, Investimento investimento) {
		investimento.calcularRendimento(conta);
	}
}
