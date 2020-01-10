package calculadoradeinvestimentos;

import java.util.Random;

public class InvestimentoArrojado implements Investimento{

	@Override
	public void calcularRendimento(Conta conta) {
		double novoSaldo = 0;
		double porcentagem = new Random().nextDouble();
		if(porcentagem <= 0.2) {
			novoSaldo = conta.getSaldo() + conta.getSaldo()*0.05;
		}
		else if(porcentagem <= 0.3) {
			novoSaldo = conta.getSaldo() + conta.getSaldo()*0.03;
		}
		else {
			novoSaldo = conta.getSaldo() + conta.getSaldo()*0.06;
		}
		conta.setSaldo(novoSaldo);
	}

}
