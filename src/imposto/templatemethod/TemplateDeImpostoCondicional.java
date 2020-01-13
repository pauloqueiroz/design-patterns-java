package imposto.templatemethod;

import java.math.BigDecimal;

import model.Orcamento;

public abstract class TemplateDeImpostoCondicional {
	
	public BigDecimal calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		}
		
		return minimaTaxacao(orcamento);
	}

	public abstract BigDecimal minimaTaxacao(Orcamento orcamento);

	public abstract BigDecimal maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
