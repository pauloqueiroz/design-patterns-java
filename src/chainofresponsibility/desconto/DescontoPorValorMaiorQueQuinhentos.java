package chainofresponsibility.desconto;

import java.math.BigDecimal;

import model.Orcamento;

public class DescontoPorValorMaiorQueQuinhentos implements Desconto{

	private Desconto proximo;
	
	@Override
	public BigDecimal desconta(Orcamento orcamento) {
		BigDecimal limite = BigDecimal.valueOf(500); 
		BigDecimal percentualDesconto = BigDecimal.valueOf(0.07);
		if(orcamento.getValor().compareTo(limite) > 0) {
			return orcamento.getValor().multiply(percentualDesconto);
		}
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}
	
}
