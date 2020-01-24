package imposto.strategy;
import java.math.BigDecimal;

import model.Orcamento;

public class ISS extends Imposto{

	public ISS() {
		super();
	}

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public BigDecimal calculaImposto(Orcamento orcamento) {
		return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
	}

}
