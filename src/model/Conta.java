package model;

public class Conta {
	
	private String conta;
	
	private double saldo;
	
	private String titular;
	
	public Conta(String conta, double saldo) {
		super();
		this.conta = conta;
		this.saldo = saldo;
	}

	public Conta(String conta, double saldo, String titular) {
		super();
		this.conta = conta;
		this.saldo = saldo;
		this.titular = titular;
	}



	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "conta: " + conta + " | saldo: "+saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
}
