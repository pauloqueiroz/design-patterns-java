package imposto.templatemethod;

import java.math.BigDecimal;

import imposto.strategy.Imposto;
import model.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto{
	
	public TemplateDeImpostoCondicional() {
		super();
	}

	public TemplateDeImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}

	public BigDecimal calculaImposto(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		}
		
		return minimaTaxacao(orcamento);
	}

	public abstract BigDecimal minimaTaxacao(Orcamento orcamento);

	public abstract BigDecimal maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
