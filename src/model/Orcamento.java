package model;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import desconto.state.EstadoOrcamento;
import desconto.state.EstadoOrcamentoEmAprovacao;

public class Orcamento {
	
	private BigDecimal valor;
	
	private List<Item> itens;
	
	private EstadoOrcamento estadoAtual;
 
	public Orcamento(BigDecimal valor) {
		super();
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		this.estadoAtual = new EstadoOrcamentoEmAprovacao();
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

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

	public EstadoOrcamento getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(EstadoOrcamento estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
	
	public void aprova() {
		estadoAtual.aprova(this);
	}
	
	public void reprova() {
		estadoAtual.reprova(this);
	}
	
	public void finaliza() {
		estadoAtual.finaliza(this);
	}
}
