package chainofresponsibility.requisicao;

import model.Conta;
import model.Formato;
import model.Requisicao;

public class RespostaXml implements Resposta{

	private Resposta proximo;
	
	@Override
	public String responder(Requisicao requisicao) {
		if(requisicao.getFormato().equals(Formato.XML)) {
			Conta conta = requisicao.getConta();
			return "<conta><titular>"+conta.getTitular()+"</titular><saldo>"+conta.getSaldo()+"</saldo></conta>";
		}
		return proximo.responder(requisicao);
	}
	@Override
	public void setProximo(Resposta proxima) {
		this.proximo = proxima;
		
	}

}
