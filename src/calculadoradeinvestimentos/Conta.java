package calculadoradeinvestimentos;

public class Conta {
	
	private String conta;
	
	private double saldo;
	
	public Conta(String conta, double saldo) {
		super();
		this.conta = conta;
		this.saldo = saldo;
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
	
}
