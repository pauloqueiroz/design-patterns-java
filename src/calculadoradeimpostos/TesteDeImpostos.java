package calculadoradeimpostos;
import java.math.BigDecimal;

public class TesteDeImpostos {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.valueOf(4000));
		ISS iss = new ISS();
		ICMS icms = new ICMS();
		ICCC iccc = new ICCC();
		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
		calculadorDeImpostos.calcularImpostos(orcamento, iss);
		calculadorDeImpostos.calcularImpostos(orcamento, icms);
		calculadorDeImpostos.calcularImpostos(orcamento, iccc);
	}
}
