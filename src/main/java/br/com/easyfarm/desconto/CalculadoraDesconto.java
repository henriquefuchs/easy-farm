package br.com.easyfarm.desconto;

import java.math.BigDecimal;

public class CalculadoraDesconto {

  public BigDecimal calcular(Gado gado) {
    return new DescontoParaMaisDe300Gado(new DescontoParaPrecoMaiorQueTresMil(null)).calcular(gado);
  }
}
