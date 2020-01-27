package filtro.decorator;

import java.util.List;

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
		// TODO Auto-generated method stub
		return null;
	}

}
