package chainofresponsibility;

import java.math.BigDecimal;

import model.Orcamento;

public class DescontoPorValorMaiorQueQuinhentos implements Desconto{

	private Desconto desconto;
	
	@Override
	public BigDecimal desconta(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProximo(Desconto desconto) {
		// TODO Auto-generated method stub
		
	}

	public Desconto getDesconto() {
		return desconto;
	}

	public void setDesconto(Desconto desconto) {
		this.desconto = desconto;
	}

	
}
