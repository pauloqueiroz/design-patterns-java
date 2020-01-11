package chainofresponsibility;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import model.Orcamento;

public class DescontoCombo implements Desconto{
	
	private Desconto proximo;

	/**
	 * Deve retornar 5% de desconto quando o orçamento conter simultaneamente os
	 * itens Lapis e Caneta.
	 */
	@Override
	public BigDecimal desconta(Orcamento orcamento) {
		//TODO tratar diferenciação entre minúsculas e maiusculas
		List<String> combo = Arrays.asList("Lapis", "Caneta");
		if(orcamento.getItens().containsAll(combo)) {
			BigDecimal desconto = BigDecimal.valueOf(0.05);
			return orcamento.getValor().multiply(desconto);
		}
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
		
	}

}
