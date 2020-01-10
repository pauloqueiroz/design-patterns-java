package calculadoradeinvestimentos;

public class TesteDeInvestimento {
	public static void main(String[] args) {
		Conta conta = new Conta("1", 100);
		InvestimentoArrojado investimentoArrojado = new InvestimentoArrojado();
		InvestimentoConservador investimentoConservador = new InvestimentoConservador();
		InvestimentoModerado investimentoModerado = new InvestimentoModerado();
		RealizadorInvestimentos realizador = new RealizadorInvestimentos();
		realizador.investir(conta, investimentoConservador);
		System.out.println(conta);
		realizador.investir(conta, investimentoModerado);
		System.out.println(conta);
		realizador.investir(conta, investimentoArrojado);
		System.out.println(conta);
	}
}
