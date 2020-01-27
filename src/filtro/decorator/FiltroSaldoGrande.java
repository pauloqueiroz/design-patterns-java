package filtro.decorator;

import java.util.List;

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
		return null;
	}

}
