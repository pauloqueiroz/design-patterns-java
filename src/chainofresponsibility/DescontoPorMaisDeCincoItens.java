package chainofresponsibility;

import java.math.BigDecimal;

import model.Orcamento;

public class DescontoPorMaisDeCincoItens implements Desconto{
	
	private Desconto desconto;
	
	public BigDecimal desconta(Orcamento orcamento) {
		if(orcamento.getItens().size() > 5) {
			BigDecimal desconto = BigDecimal.valueOf(0.1);
			return orcamento.getValor().multiply(desconto);
		}
		return desconto.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.setDesconto(desconto);
	}

	public Desconto getDesconto() {
		return desconto;
	}

	public void setDesconto(Desconto desconto) {
		this.desconto = desconto;
	}

}
