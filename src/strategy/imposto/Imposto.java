package strategy.imposto;
import java.math.BigDecimal;

import model.Orcamento;

public interface Imposto {
	
	public BigDecimal calculaImposto(Orcamento orcamento);
	
}
