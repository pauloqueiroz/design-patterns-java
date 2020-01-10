package calculadoradeimpostos;
import java.math.BigDecimal;

public class ICCC implements Imposto{

	@Override
	public BigDecimal calculaImposto(Orcamento orcamento) {
		BigDecimal valor = orcamento.getValor();
		BigDecimal valorImposto = BigDecimal.ZERO;
		if(valor.compareTo(BigDecimal.valueOf(1000)) < 0) {
			valorImposto = valor.multiply(BigDecimal.valueOf(0.05));
		}
		if(valor.compareTo(BigDecimal.valueOf(1000)) >= 0 && valor.compareTo(BigDecimal.valueOf(3000)) <= 0) {
			valorImposto = valor.multiply(BigDecimal.valueOf(0.07));
		}
		if(valor.compareTo(BigDecimal.valueOf(3000)) > 0) {
			valorImposto = valor.multiply(BigDecimal.valueOf(0.08)).add(BigDecimal.valueOf(30));
		}
		return valorImposto;
	}

}
