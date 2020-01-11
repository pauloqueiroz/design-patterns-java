package service;

import chainofresponsibility.requisicao.RespostaCsv;
import chainofresponsibility.requisicao.RespostaPorCento;
import chainofresponsibility.requisicao.RespostaXml;
import chainofresponsibility.requisicao.SemResposta;
import model.Requisicao;

public class RespondedorRequisicoes {

	public String responder(Requisicao requisicao) {
		RespostaCsv r1 = new RespostaCsv();
		RespostaPorCento r2 = new RespostaPorCento();
		RespostaXml r3 = new RespostaXml();
		SemResposta rFim = new SemResposta();
		r1.setProximo(r2);
		r2.setProximo(r3);
		r3.setProximo(rFim);
		return r1.responder(requisicao);
	}
}
