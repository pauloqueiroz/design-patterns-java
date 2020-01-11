package test;

import java.math.BigDecimal;
import java.util.Arrays;

import model.Orcamento;
import service.CalculadorDeDescontos;

public class TesteDeDesconto {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.valueOf(400), Arrays.asList("Pneu", "Bicicleta", "Para-brisa", "Macaco"));
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		BigDecimal desconto = calculador.calcula(orcamento);
		System.out.println("Orcamento 1: valor: "+orcamento.getValor()+" - "+desconto);
	
		Orcamento orcamento2 = new Orcamento(BigDecimal.valueOf(550), Arrays.asList("Pneu", "Bicicleta", "Para-brisa", "Step"));
		BigDecimal desconto2 = calculador.calcula(orcamento2);
		System.out.println("Orcamento 2: valor: "+orcamento2.getValor()+" - "+desconto2);
		
		Orcamento orcamento3 = new Orcamento(BigDecimal.valueOf(400), Arrays.asList("Vela", "Oleo", "Pneu", "Bicicleta", "Para-brisa", "Step"));
		BigDecimal desconto3 = calculador.calcula(orcamento3);
		System.out.println("Orcamento 3: valor: "+orcamento3.getValor()+" - "+desconto3);
		
		Orcamento orcamento4 = new Orcamento(BigDecimal.valueOf(560), Arrays.asList("Vela", "Oleo", "Pneu", "Bicicleta", "Para-brisa", "Step"));
		BigDecimal desconto4 = calculador.calcula(orcamento4);
		System.out.println("Orcamento 4: valor: "+orcamento4.getValor()+" - "+desconto4);
		
		Orcamento orcamento5 = new Orcamento(BigDecimal.valueOf(100), Arrays.asList("Lapis", "Caneta", "Para-brisa", "Step"));
		BigDecimal desconto5 = calculador.calcula(orcamento5);
		System.out.println("Orcamento 5: valor: "+orcamento5.getValor()+" - "+desconto5);
	}
}
