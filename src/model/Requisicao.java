package model;

public class Requisicao {

	private Formato formato;
	
	private Conta conta;
	
	public Requisicao(Formato formato, Conta conta) {
		super();
		this.formato = formato;
		this.conta = conta;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
}
