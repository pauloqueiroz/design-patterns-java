package desconto.chainofresponsibility;

import java.math.BigDecimal;

import model.Orcamento;

public interface Desconto {

	public BigDecimal desconta(Orcamento orcamento);
	
	public void setProximo(Desconto desconto);
}
