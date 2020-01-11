package chainofresponsibility.requisicao;

import model.Requisicao;

public class SemResposta implements Resposta{

	
	@Override
	public String responder(Requisicao requisicao) {
		return null;
	}

	@Override
	public void setProximo(Resposta proxima) {
		
	}

}
