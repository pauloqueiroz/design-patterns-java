package chainofresponsibility;

import java.math.BigDecimal;

import model.Orcamento;

public class DescontoPorMaisDeCincoItens implements Desconto{
	
	private Desconto proximo;
	
	public BigDecimal desconta(Orcamento orcamento) {
		if(orcamento.getItens().size() > 5) {
			BigDecimal desconto = BigDecimal.valueOf(0.1);
			return orcamento.getValor().multiply(desconto);
		}
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}
}
