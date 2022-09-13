package br.com.easyfarm.icms;

import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

class CalculadoraICMSTest {


  @org.junit.jupiter.api.Test
  void deveriaRetornarAliquotaDeIcmsDeScIgualCinquenta() {
    Venda venda = new Venda(new BigDecimal("1000"), TipoUF.SC);
    CalculadoraICMS calculadoraICMS = new CalculadoraICMS();

    SantaCatarinaStrategyICMS santaCatarinaICMS = new SantaCatarinaStrategyICMS();

    Assertions.assertEquals(calculadoraICMS.calcular(venda, santaCatarinaICMS), new BigDecimal("50.00"));
  }

  @org.junit.jupiter.api.Test
  void deveriaRetornarAliquotaDeIcmsDoPrIgualMil() {
    Venda venda = new Venda(new BigDecimal("1000"), TipoUF.PR);
    CalculadoraICMS calculadoraICMS = new CalculadoraICMS();

    ParanaStrategyICMS paranaICMS = new ParanaStrategyICMS();

    Assertions.assertEquals(calculadoraICMS.calcular(venda, paranaICMS), new BigDecimal("100.00"));
  }

  @org.junit.jupiter.api.Test
  void deveriaRetornarAliquotaDeIcmsDoMtIgualSetenta() {
    Venda venda = new Venda(new BigDecimal("1000"), TipoUF.MT);
    CalculadoraICMS calculadoraICMS = new CalculadoraICMS();

    MatoGrossoStrategyICMS matoGrossoICMS = new MatoGrossoStrategyICMS();

    Assertions.assertEquals(calculadoraICMS.calcular(venda, matoGrossoICMS), new BigDecimal("70.00"));
  }
}
