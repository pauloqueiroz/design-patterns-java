package calculadoradeimpostos;
import java.math.BigDecimal;

public class CalculadorDeImpostos {

	public void calcularImpostos(Orcamento orcamento, Imposto imposto) {
		BigDecimal valor = imposto.calculaImposto(orcamento);
		System.out.println("Imposto: "+valor);
	}
}
