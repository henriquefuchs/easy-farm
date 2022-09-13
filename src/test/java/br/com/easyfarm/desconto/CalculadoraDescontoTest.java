package br.com.easyfarm.desconto;

import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

class CalculadoraDescontoTest {

  @org.junit.jupiter.api.Test
  void deveriaRetornarDescontoEmQuantidadeMaiorQue300() {
    CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();

    Gado gado = new Gado(new BigDecimal("1000"), 350);

    Assertions.assertEquals(calculadoraDesconto.calcular(gado), new BigDecimal("200.00"));
  }

  @org.junit.jupiter.api.Test
  void deveriaRetornarDescontoEmValorMaiorQueTresMil() {
    CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();

    Gado gado = new Gado(new BigDecimal("4000"), 200);

    Assertions.assertEquals(calculadoraDesconto.calcular(gado), new BigDecimal("400.00"));
  }
}
