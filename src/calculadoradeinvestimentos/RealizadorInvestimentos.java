package calculadoradeinvestimentos;

public class RealizadorInvestimentos {

	public void investir(Conta conta, Investimento investimento) {
		investimento.calcularRendimento(conta);
	}
}
