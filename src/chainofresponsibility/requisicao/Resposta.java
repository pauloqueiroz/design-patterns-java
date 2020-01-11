package chainofresponsibility.requisicao;

import model.Requisicao;

public interface Resposta {
	
	public String responder(Requisicao requisicao);

	public void setProximo(Resposta proxima);
}
