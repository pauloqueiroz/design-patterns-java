package imposto.strategy;
import java.math.BigDecimal;

import model.Orcamento;

public class ICMS extends Imposto{

	public ICMS() {
		super();
	}

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public BigDecimal calculaImposto(Orcamento orcamento) {
		return orcamento.getValor().multiply(BigDecimal.valueOf(0.05));
	}

}
