package filtro.decorator;

import java.util.List;

import model.Conta;

public abstract class Filtro {
	
	private Filtro outroFiltro;
	
	public Filtro() {
		super();
	}

	public Filtro(Filtro outroFiltro) {
		super();
		this.outroFiltro = outroFiltro;
	}

	public abstract List<Conta> filtra(List<Conta> contas);
	
	public List<Conta> proximo(List<Conta> contas){
		if(this.getOutroFiltro() != null) {
			return this.getOutroFiltro().filtra(contas);
		}
		return null;
	}

	public Filtro getOutroFiltro() {
		return outroFiltro;
	}

	public void setOutroFiltro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
}
