package br.com.easyfarm.desconto;

import java.math.BigDecimal;

public class DescontoParaMaisDe300Gado extends Desconto {

  protected DescontoParaMaisDe300Gado(Desconto proximo) {
    super(proximo);
  }

  @Override
  public boolean deveAplicar(Gado gado) {
    return gado.getQuantidade() > 300;
  }

  @Override
  public BigDecimal efetuarCalculo(Gado gado) {
    return gado.getPreco().multiply(new BigDecimal("0.20"));
  }
}
