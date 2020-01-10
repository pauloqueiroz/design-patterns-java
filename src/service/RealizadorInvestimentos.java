package service;

import model.Conta;
import strategy.investimento.Investimento;

public class RealizadorInvestimentos {

	public void investir(Conta conta, Investimento investimento) {
		investimento.calcularRendimento(conta);
	}
}
