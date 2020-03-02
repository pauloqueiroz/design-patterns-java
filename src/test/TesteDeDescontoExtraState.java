package test;

import java.math.BigDecimal;

import model.Orcamento;

public class TesteDeDescontoExtraState {
	public static void main(String[] args) {
		Orcamento sofa = new Orcamento(BigDecimal.valueOf(500));
		
        sofa.aplicaDescontoExtra();
        System.out.println(sofa.getValor()); // imprime 475,00 pois descontou 5%
        sofa.aprova(); // aprova nota!

        sofa.aplicaDescontoExtra();
        System.out.println(sofa.getValor()); // imprime 465,50 pois descontou 2%

        sofa.finaliza();

        // reforma.aplicaDescontoExtra(); lancaria excecao, pois não pode dar desconto nesse estado
        // reforma.aprova(); lança exceção, pois não pode ir para aprovado
	    
	}
}
