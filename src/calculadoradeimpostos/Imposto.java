package calculadoradeimpostos;
import java.math.BigDecimal;

public interface Imposto {
	
	public BigDecimal calculaImposto(Orcamento orcamento);
	
}
