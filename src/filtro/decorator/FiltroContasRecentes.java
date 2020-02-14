package filtro.decorator;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import model.Conta;

public class FiltroContasRecentes extends Filtro{
	
	public FiltroContasRecentes() {
		super();
	}

	public FiltroContasRecentes(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		Calendar instance = Calendar.getInstance();
		instance.set(Calendar.DAY_OF_MONTH, 1);
		Date primeiroDiaMesCorrente = instance.getTime();
		List<Conta> lista = contas.stream().filter(c-> (c.getDataAbertura().compareTo(primeiroDiaMesCorrente)) > 0).collect(Collectors.toList());
		lista.addAll(proximo(contas));
		
		return lista;
	}

}
