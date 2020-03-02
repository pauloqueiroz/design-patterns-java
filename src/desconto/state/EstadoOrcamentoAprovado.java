package desconto.state;

import java.math.BigDecimal;

import model.Orcamento;

public class EstadoOrcamentoAprovado implements EstadoOrcamento{
	
	boolean aplicado = false;

	/**
	 * Orcamentos aprovados possuem desconto extra de 2% 
	 */
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!aplicado) {			
			BigDecimal desconto2PorCento = BigDecimal.valueOf(0.98);
			BigDecimal valorComDesconto = orcamento.getValor().multiply(desconto2PorCento);
			orcamento.setValor(valorComDesconto);
			aplicado = true;
		}else {
			throw new RuntimeException("O desconto não pode ser aplicado mais de uma vez.");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos não podem ser aprovados mais de uma vez.");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstadoAtual(new EstadoOrcamentoFinalizado());
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos aprovados não podem ser reprovados.");
	}

}
