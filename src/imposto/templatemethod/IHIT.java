package imposto.templatemethod;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import imposto.strategy.Imposto;
import model.Item;
import model.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional{
	
	public IHIT() {
		super();
	}

	public IHIT(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public BigDecimal minimaTaxacao(Orcamento orcamento) {
		BigDecimal percentualImposto = BigDecimal.valueOf(0.01).multiply(BigDecimal.valueOf(orcamento.getItens().size()));
		return orcamento.getValor().multiply(percentualImposto);
	}

	@Override
	public BigDecimal maximaTaxacao(Orcamento orcamento) {
		BigDecimal cemReais = BigDecimal.valueOf(100);
		BigDecimal percentualImposto = BigDecimal.valueOf(0.13);
		return orcamento.getValor().multiply(percentualImposto).add(cemReais);
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		
		Set<String> nomes = new HashSet<String>();
		Optional<Item> optional = orcamento.getItens().stream().filter(it->!nomes.add(it.getNome())).findFirst();
		if(optional.isPresent()) {
			return true;
		}
		return false;
	}

}
