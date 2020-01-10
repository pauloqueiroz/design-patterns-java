package service;
import java.math.BigDecimal;

import model.Orcamento;
import strategy.imposto.Imposto;

public class CalculadorDeImpostos {

	public void calcularImpostos(Orcamento orcamento, Imposto imposto) {
		BigDecimal valor = imposto.calculaImposto(orcamento);
		System.out.println("Imposto: "+valor);
	}
}
