package calculadoradeimpostos;
import java.math.BigDecimal;

public class ISS implements Imposto{

	@Override
	public BigDecimal calculaImposto(Orcamento orcamento) {
		return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
	}

}
