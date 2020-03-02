package desconto.state;

import java.math.BigDecimal;

import model.Orcamento;

public class EstadoOrcamentoEmAprovacao implements EstadoOrcamento{

	boolean aplicado = false;
	
	/**
	 * Orcamentos em aprovação possuem desconto extra de 5% 
	 */
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!aplicado) {
			BigDecimal desconto5PorCento = BigDecimal.valueOf(0.95);
			BigDecimal valorComDesconto = orcamento.getValor().multiply(desconto5PorCento);
			orcamento.setValor(valorComDesconto);
			aplicado = true;
		}else {
			throw new RuntimeException("o desconto já foi aplicado.");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.setEstadoAtual(new EstadoOrcamentoAprovado());
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos em aprovação não podem ser finalizados.");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.setEstadoAtual(new EstadoOrcamentoReprovado());
		
	}

}
