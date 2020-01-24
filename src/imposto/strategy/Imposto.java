package imposto.strategy;
import java.math.BigDecimal;

import model.Orcamento;

public abstract class Imposto {
	
	protected Imposto outroImposto;
	
	public Imposto() {
		super();
	}

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public abstract BigDecimal calculaImposto(Orcamento orcamento);
	
	public BigDecimal calcula(Orcamento orcamento) {
		BigDecimal valorImposto = calculaImposto(orcamento);
		if(outroImposto != null) {
			valorImposto = valorImposto.add(outroImposto.calculaImposto(orcamento));
		}
		return valorImposto;
	}
}
