package strategy.imposto;
import java.math.BigDecimal;

import model.Orcamento;

public class ISS implements Imposto{

	@Override
	public BigDecimal calculaImposto(Orcamento orcamento) {
		return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
	}

}
