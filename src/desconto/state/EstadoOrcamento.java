package desconto.state;

import model.Orcamento;

public interface EstadoOrcamento {
	void aplicaDescontoExtra(Orcamento orcamento);
	void aprova(Orcamento orcamento);
	void finaliza(Orcamento orcamento);
	void reprova(Orcamento orcamento);
}
