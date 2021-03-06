package service;

import java.math.BigDecimal;

import desconto.chainofresponsibility.DescontoCombo;
import desconto.chainofresponsibility.DescontoPorMaisDeCincoItens;
import desconto.chainofresponsibility.DescontoPorValorMaiorQueQuinhentos;
import desconto.chainofresponsibility.SemDesconto;
import model.Orcamento;

public class CalculadorDeDescontos {

	public BigDecimal calcula(Orcamento orcamento) {
		DescontoPorMaisDeCincoItens desconto1 = new DescontoPorMaisDeCincoItens();
		DescontoPorValorMaiorQueQuinhentos desconto2 = new DescontoPorValorMaiorQueQuinhentos();
		DescontoCombo desconto3 = new DescontoCombo();
		SemDesconto semDesconto = new SemDesconto();
		desconto1.setProximo(desconto2);
		desconto2.setProximo(desconto3);
		desconto3.setProximo(semDesconto);
		
		return desconto1.desconta(orcamento);
	}
}
