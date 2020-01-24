package service;
import java.math.BigDecimal;

import imposto.strategy.Imposto;
import imposto.templatemethod.TemplateDeImpostoCondicional;
import model.Orcamento;

public class CalculadorDeImpostos {

	public void calcularImpostos(Orcamento orcamento, Imposto imposto) {
		BigDecimal valor = imposto.calcula(orcamento);
		System.out.println("Imposto: "+valor);
	}
	
	public void calcularImpostos(Orcamento orcamento, TemplateDeImpostoCondicional imposto) {
		BigDecimal valor = imposto.calcula(orcamento);
		System.out.println("Imposto: "+valor);
	}
}
