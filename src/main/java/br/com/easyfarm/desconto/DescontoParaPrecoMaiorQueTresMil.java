package br.com.easyfarm.desconto;

import java.math.BigDecimal;

public class DescontoParaPrecoMaiorQueTresMil extends Desconto {

  protected DescontoParaPrecoMaiorQueTresMil(Desconto proximo) {
    super(proximo);
  }

  @Override
  public boolean deveAplicar(Gado gado) {
    return gado.getPreco().compareTo(new BigDecimal("3000")) > 0;
  }

  @Override
  public BigDecimal efetuarCalculo(Gado gado) {
    return gado.getPreco().multiply(new BigDecimal("0.10"));
  }
}
