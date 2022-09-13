package br.com.easyfarm.desconto;

import java.math.BigDecimal;

public class Gado {
  private final BigDecimal preco;
  private final int quantidade;

  public Gado(BigDecimal preco, int quantidade) {
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public BigDecimal getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }
}
