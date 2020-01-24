package imposto.strategy;

import java.math.BigDecimal;

import model.Orcamento;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto() {
	}

	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public BigDecimal calculaImposto(Orcamento orcamento) {
		BigDecimal vintePorCento = BigDecimal.valueOf(0.20);
		return orcamento.getValor().multiply(vintePorCento);
	}

}
