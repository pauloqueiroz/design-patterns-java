package filtro.decorator;

import java.util.List;

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
		// TODO Auto-generated method stub
		return null;
	}

}
