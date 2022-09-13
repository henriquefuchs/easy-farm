package br.com.easyfarm.desconto;

import java.math.BigDecimal;

public abstract class Desconto {
  protected final Desconto proximo;

  protected Desconto(Desconto proximo) {
    this.proximo = proximo;
  }

  public BigDecimal calcular(Gado gado) {
    if (deveAplicar(gado)) {
      return efetuarCalculo(gado);
    }

    return proximo.calcular(gado);
  }

  public abstract boolean deveAplicar(Gado gado);

  public abstract BigDecimal efetuarCalculo(Gado gado);
}
