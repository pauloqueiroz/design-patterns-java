package desconto.chainofresponsibility;

import java.math.BigDecimal;

import model.Orcamento;

public class SemDesconto implements Desconto{

	
	@Override
	public BigDecimal desconta(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	@Override
	public void setProximo(Desconto desconto) {
		// TODO não tem
		
	}

}
