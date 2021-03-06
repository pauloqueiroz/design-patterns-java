package requisicao.chainofresponsibility;

import model.Conta;
import model.Formato;
import model.Requisicao;

public class RespostaPorCento implements Resposta{

	private Resposta proximo;
	
	@Override
	public String responder(Requisicao requisicao) {
		if(requisicao.getFormato().equals(Formato.PORCENTO)) {
			Conta conta = requisicao.getConta();
			return conta.getTitular()+"%"+conta.getSaldo();
		}
		return proximo.responder(requisicao);
	}

	@Override
	public void setProximo(Resposta proxima) {
		this.proximo = proxima;
	}

}
