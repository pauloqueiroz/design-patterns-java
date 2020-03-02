package desconto.state;

import model.Orcamento;

public class EstadoOrcamentoReprovado implements EstadoOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		// não é aplicado desconto
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não podem ser aprovados.");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não podem ser finalizados.");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("O orçamento já encontra-se reprovado.");
		
	}

}
