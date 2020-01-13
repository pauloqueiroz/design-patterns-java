package model;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento {
	
	private BigDecimal valor;
	
	private List<Item> itens;
 
	public Orcamento(BigDecimal valor) {
		super();
		this.valor = valor;
		this.itens = new ArrayList<Item>();
	}
	
	public Orcamento(BigDecimal valor, List<Item> itens) {
		super();
		this.valor = valor;
		this.itens = itens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
}
