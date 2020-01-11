package test;

import model.Conta;
import model.Formato;
import model.Requisicao;
import service.RespondedorRequisicoes;

public class TesteRequisicao {
	public static void main(String[] args) {
		Conta conta = new Conta("1", 100, "Paulo Sérgio");
		RespondedorRequisicoes resp = new RespondedorRequisicoes();
		Requisicao r1 = new Requisicao(Formato.CSV, conta);
		String resposta = resp.responder(r1);
		System.out.println(conta + resposta+"\n");
		
		Requisicao r2 = new Requisicao(Formato.PORCENTO, conta);
		String resposta2 = resp.responder(r2);
		System.out.println(conta + resposta2+"\n");
		
		Requisicao r3 = new Requisicao(Formato.XML, conta);
		String resposta3 = resp.responder(r3);
		System.out.println(conta + resposta3+"\n");
	}
}
