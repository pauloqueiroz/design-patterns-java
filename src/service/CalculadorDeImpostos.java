package service;
import java.math.BigDecimal;

import imposto.strategy.Imposto;
import model.Orcamento;

public class CalculadorDeImpostos {

	public void calcularImpostos(Orcamento orcamento, Imposto imposto) {
		BigDecimal valor = imposto.calculaImposto(orcamento);
		System.out.println("Imposto: "+valor);
	}
}
