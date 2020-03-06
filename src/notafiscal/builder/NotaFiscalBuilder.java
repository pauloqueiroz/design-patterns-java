package notafiscal.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import notafiscal.model.ItemDaNota;
import notafiscal.model.NotaFiscal;

public class NotaFiscalBuilder {
	private String razaoSocial;
    private String cnpj;
    private double impostos;
    private double valorBruto;
    private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private Calendar dataEmissao;
	private String observacao;

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
      this.razaoSocial = razaoSocial;
      return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
      this.cnpj = cnpj;
      return this;
    }
    
    public NotaFiscalBuilder comObservacao(String observacao) {
        this.observacao = observacao;
		return this;
    }
    
    public NotaFiscalBuilder comDataEmissao(Calendar dataEmissao) {
        this.dataEmissao = dataEmissao;
		return this;
    }

    public NotaFiscalBuilder naDataAtual() {
        this.dataEmissao = Calendar.getInstance();
		return this;
    }
    
    public NotaFiscalBuilder comItem(ItemDaNota item) {
      todosItens.add(item);
      valorBruto += item.getValor();
      impostos += item.getValor() * 0.05;
      return this;
    }
    
    public NotaFiscal build() {
    	NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, impostos, todosItens, observacao);
    	return notaFiscal;
    }
}
