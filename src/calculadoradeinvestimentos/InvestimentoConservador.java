package calculadoradeinvestimentos;

public class InvestimentoConservador implements Investimento{

	@Override
	public void calcularRendimento(Conta conta) {
		double novoSaldo = conta.getSaldo() + conta.getSaldo()*0.08;
		conta.setSaldo(novoSaldo);
	}

}
