package notafiscal.builder;

import notafiscal.model.ItemDaNota;
import notafiscal.model.NotaFiscal;

public class TesteNotaFiscal {
	
	public static void main(String[] args) {
		
        ItemDaNota item = new ItemDaNotaBuilder().comNome("item 1").comValor(100.0).build();
		NotaFiscal nf = new NotaFiscalBuilder().paraEmpresa("Maida")
                          .comCnpj("52.762.699/0001-20")
                          .comItem(item)
                          .comItem(new ItemDaNota("item 2", 200.0))
                          .comItem(new ItemDaNota("item 3", 300.0))
                          .comObservacao("observação qualquer")
                          .naDataAtual()
                          .build();
        System.out.println(nf);
      }

}
