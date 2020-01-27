package imposto.templatemethod;

import java.math.BigDecimal;

import imposto.strategy.Imposto;
import model.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional{
	
	public ICPP() {
		super();
	}

	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public BigDecimal minimaTaxacao(Orcamento orcamento) {
		BigDecimal cincoPorCento = BigDecimal.valueOf(0.05);
		return orcamento.getValor().multiply(cincoPorCento);
	}

	@Override
	public BigDecimal maximaTaxacao(Orcamento orcamento) {
		BigDecimal setePorCento = BigDecimal.valueOf(0.07);
		return orcamento.getValor().multiply(setePorCento);
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		BigDecimal quinhentos = BigDecimal.valueOf(500);
		return orcamento.getValor().compareTo(quinhentos) > 0;
	}


}
