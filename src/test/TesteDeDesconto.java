package test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import model.Item;
import model.Orcamento;
import service.CalculadorDeDescontos;

public class TesteDeDesconto {
	public static void main(String[] args) {
		
		
		List<Item> lista = Arrays.asList(new Item("Pneu",BigDecimal.valueOf(100)), new Item("Bicicleta",BigDecimal.valueOf(100)), new Item("Para-brisa",BigDecimal.valueOf(100)), new Item("Macaco",BigDecimal.valueOf(100)));
		Orcamento orcamento = new Orcamento(BigDecimal.valueOf(400), lista);
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		BigDecimal desconto = calculador.calcula(orcamento);
		System.out.println("Orcamento 1: valor: "+orcamento.getValor()+" - "+desconto);
	
		lista.remove(4);
		Orcamento orcamento2 = new Orcamento(BigDecimal.valueOf(550), lista);
		BigDecimal desconto2 = calculador.calcula(orcamento2);
		System.out.println("Orcamento 2: valor: "+orcamento2.getValor()+" - "+desconto2);
		
		List<Item> lista2 = Arrays.asList(new Item("Vela",BigDecimal.valueOf(100)), new Item("Step",BigDecimal.valueOf(100)));
		
		lista.addAll(lista2);
		Orcamento orcamento3 = new Orcamento(BigDecimal.valueOf(400), lista2);
		BigDecimal desconto3 = calculador.calcula(orcamento3);
		System.out.println("Orcamento 3: valor: "+orcamento3.getValor()+" - "+desconto3);
		
		Orcamento orcamento4 = new Orcamento(BigDecimal.valueOf(560), lista2);
		BigDecimal desconto4 = calculador.calcula(orcamento4);
		System.out.println("Orcamento 4: valor: "+orcamento4.getValor()+" - "+desconto4);
		
		Orcamento orcamento5 = new Orcamento(BigDecimal.valueOf(100), lista2);
		BigDecimal desconto5 = calculador.calcula(orcamento5);
		System.out.println("Orcamento 5: valor: "+orcamento5.getValor()+" - "+desconto5);
	}
}
