package relatorios.templatemethod;

import java.util.Date;
import java.util.List;

import model.Banco;
import model.Conta;

public class RelatorioComplexo extends TemplateRelatorios{

	@Override
	public String gerarCabecalho(Banco banco) {
		return banco.getNome()+" - "+banco.getEndereco()+" + - "+banco.getTelefone();
	}

	@Override
	public String gerarCorpo(List<Conta> contas) {
		StringBuilder builder = new StringBuilder();
		builder.append("TITULAR | AGENCIA | NUMERO CONTA | SALDO\n");
		contas.stream().forEach(c->builder.append(c.getTitular()+" | "+c.getAgencia()+" | "+c.getConta()+" | "+c.getSaldo()+"\n"));
		return builder.toString();
	}

	@Override
	public String gerarRodape(Banco banco) {
		return banco.getEmail()+" - "+new Date();
	}

}
