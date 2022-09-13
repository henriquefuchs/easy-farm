package br.com.easyfarm.icms;

import java.math.BigDecimal;

public class Venda {

  public BigDecimal valorBruto;
  public TipoUF uf;

  public Venda(BigDecimal valorBruto, TipoUF uf) {
    this.valorBruto = valorBruto;
    this.uf = uf;
  }

  public BigDecimal getValorBruto() {
    return valorBruto;
  }

  public TipoUF getUf() {
    return uf;
  }
}
