package imposto.templatemethod;

import java.math.BigDecimal;

import model.Item;
import model.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional{

	@Override
	public BigDecimal minimaTaxacao(Orcamento orcamento) {
		BigDecimal dezPorCento = BigDecimal.valueOf(0.06);
		return orcamento.getValor().multiply(dezPorCento);
	}

	@Override
	public BigDecimal maximaTaxacao(Orcamento orcamento) {
		BigDecimal seisPorCento = BigDecimal.valueOf(0.10);
		return orcamento.getValor().multiply(seisPorCento);
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		BigDecimal quinhentos = BigDecimal.valueOf(500);
		return orcamento.getValor().compareTo(quinhentos) > 0 && temItemMaiorQue100ReaisNo(orcamento);
	}

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor().compareTo(BigDecimal.valueOf(100)) > 0) {
				return true;
			}
		}
		return false;
	}

}
