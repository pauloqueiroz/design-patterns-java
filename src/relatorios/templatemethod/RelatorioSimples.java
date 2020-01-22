package relatorios.templatemethod;

import java.util.List;

import model.Banco;
import model.Conta;

public class RelatorioSimples extends TemplateRelatorios{

	@Override
	public String gerarCabecalho(Banco banco) {
		return banco.getNome()+" | telefone: " +banco.getTelefone();
	}

	@Override
	public String gerarCorpo(List<Conta> contas) {
		StringBuilder sb = new StringBuilder();
		sb.append("Titular | Saldo\n");
		contas.stream().forEach(c->sb.append(c.getTitular() +" | " +c.getSaldo()+"\n"));
		return sb.toString();
	}

	@Override
	public String gerarRodape(Banco banco) {
		// Rodapé é igual ao cabecalho
		return gerarCabecalho(banco);
	}

}
