package filtro.decorator;

import java.util.List;
import java.util.stream.Collectors;

import model.Conta;

public class FiltroSaldoPequeno extends Filtro{

	public FiltroSaldoPequeno() {
		super();
	}

	public FiltroSaldoPequeno(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> list = contas.stream().filter(c-> c.getSaldo() < 100).collect(Collectors.toList());
		list.addAll(proximo(contas));
		return list;
	}

}
