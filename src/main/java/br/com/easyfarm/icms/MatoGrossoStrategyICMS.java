package br.com.easyfarm.icms;

import java.math.BigDecimal;

public class MatoGrossoStrategyICMS implements ICMS {

  @Override
  public BigDecimal calcular(Venda venda) {
    return venda.getValorBruto().multiply(new BigDecimal("0.07"));
  }
}
