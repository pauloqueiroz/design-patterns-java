package model;

import java.util.Date;

public class Conta {
	
	private String conta;
	
	private double saldo;
	
	private String titular;
	
	private Banco banco;

	private String agencia;
	
	private Date dataAbertura;
	
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

	public Conta(String conta, double saldo, String titular, Banco banco) {
		super();
		this.conta = conta;
		this.saldo = saldo;
		this.titular = titular;
		this.banco = banco;
	}
	
	public Conta(String conta, double saldo, String titular, Banco banco, String agencia) {
		super();
		this.conta = conta;
		this.saldo = saldo;
		this.titular = titular;
		this.banco = banco;
		this.agencia = agencia;
	}
	
	public Conta(String conta, double saldo, String titular, Banco banco, String agencia, Date dataAbertura) {
		super();
		this.conta = conta;
		this.saldo = saldo;
		this.titular = titular;
		this.banco = banco;
		this.agencia = agencia;
		this.dataAbertura = dataAbertura;
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

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
}
