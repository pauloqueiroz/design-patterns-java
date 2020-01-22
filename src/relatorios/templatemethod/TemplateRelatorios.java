package relatorios.templatemethod;

import java.util.List;

import model.Banco;
import model.Conta;

public abstract class TemplateRelatorios {

	public abstract String gerarCabecalho(Banco banco);
	
	public abstract String gerarCorpo(List<Conta> contas);
	
	public abstract String gerarRodape(Banco banco);
	
	public void gerarRelatorio(Banco banco, List<Conta> contas) {
		System.out.println(gerarCabecalho(banco));
		System.out.println("------------------------------------------");
		System.out.println(gerarCorpo(contas));
		System.out.println("------------------------------------------");
		System.out.println(gerarRodape(banco));
		
	}
}
