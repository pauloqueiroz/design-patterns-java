package test;
import java.math.BigDecimal;
import java.util.Arrays;

import imposto.strategy.ICCC;
import imposto.strategy.ICMS;
import imposto.strategy.ISS;
import imposto.strategy.ImpostoMuitoAlto;
import imposto.templatemethod.ICPP;
import imposto.templatemethod.IHIT;
import imposto.templatemethod.IKCV;
import model.Item;
import model.Orcamento;
import service.CalculadorDeImpostos;

public class TesteDeImpostos {
	public static void main(String[] args) {
		// Testes dos strategys 
		Orcamento orcamento = new Orcamento(BigDecimal.valueOf(4000));
		ISS iss = new ISS(new ImpostoMuitoAlto());
		ICMS icms = new ICMS();
		ICCC iccc = new ICCC();
		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
		System.out.print("Imposto 1: ");
		calculadorDeImpostos.calcularImpostos(orcamento, iss);
		System.out.print("Imposto 2: ");
		calculadorDeImpostos.calcularImpostos(orcamento, icms);
		System.out.print("Imposto 3: ");
		calculadorDeImpostos.calcularImpostos(orcamento, iccc);
		
		Item pneu = criaItem("Pneu", 200);
		Item roda = criaItem("Roda", 300);
		Item vela = criaItem("Vela", 50);
		Item lanterna = criaItem("Lanterna", 20);
		Item capacete = criaItem("Capacete", 150);
		Orcamento orcamento2 = new Orcamento(BigDecimal.valueOf(500), Arrays.asList(pneu,roda,vela,lanterna,pneu));
		IHIT ihit = new IHIT();
		System.out.print("Imposto 4: ");
		calculadorDeImpostos.calcularImpostos(orcamento2, ihit);
		
		Orcamento orcamento3 = new Orcamento(BigDecimal.valueOf(500), Arrays.asList(pneu,roda,vela,lanterna,capacete));
		System.out.print("Imposto 5: ");
		calculadorDeImpostos.calcularImpostos(orcamento3, ihit);
		
		ICPP icppComposto = new ICPP(new IKCV());
		System.out.print("Imposto icpp e ikcv composto: ");
		calculadorDeImpostos.calcularImpostos(orcamento2, icppComposto);
		
	}
	
	public static Item criaItem(String nome, double valor){
		return new Item(nome, BigDecimal.valueOf(valor));
	}
}
