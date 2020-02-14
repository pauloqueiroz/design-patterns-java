package filtro.decorator;

import java.util.List;
import java.util.stream.Collectors;

import model.Conta;

public class FiltroSaldoGrande extends Filtro{
	
	public FiltroSaldoGrande() {
		super();
	}

	public FiltroSaldoGrande(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> list = contas.stream().filter(c-> c.getSaldo() > 500000).collect(Collectors.toList());
		list.addAll(proximo(contas));
		return list;
	}

}
