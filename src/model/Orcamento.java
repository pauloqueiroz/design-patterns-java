package model;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento {
	
	private BigDecimal valor;
	
	private List<String> itens;
 
	public Orcamento(BigDecimal valor) {
		super();
		this.valor = valor;
		this.itens = new ArrayList<String>();
	}
	
	public Orcamento(BigDecimal valor, List<String> itens) {
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

	public List<String> getItens() {
		return itens;
	}

	public void setItens(List<String> itens) {
		this.itens = itens;
	}
}
