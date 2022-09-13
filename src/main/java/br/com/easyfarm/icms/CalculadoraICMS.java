package br.com.easyfarm.icms;

import java.math.BigDecimal;

/**
 * <h1>Cultura da Soja</h1>
 *
 * <p>Alíquota ICMS</p>
 * <ul>
 *   <li>SC = 5%%</li>
 *   <li>PR = 10%</li>
 *   <li>MT = 7%</li>
 * </ul>
 */
public class CalculadoraICMS {

  public BigDecimal calcular(Venda venda, ICMS icms) {
    return icms.calcular(venda);
  }
}
