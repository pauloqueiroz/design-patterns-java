package strategy.investimento;

import java.util.Random;

import model.Conta;

public class InvestimentoModerado implements Investimento{

	@Override
	public void calcularRendimento(Conta conta) {
		double novoSaldo = 0;
		if(new Random().nextDouble() > 0.5) {
			novoSaldo = conta.getSaldo() + conta.getSaldo()*0.025;
		}else {
			novoSaldo = conta.getSaldo() + conta.getSaldo()*0.07;
		}
		conta.setSaldo(novoSaldo);
	}

}
