package br.com.easyfarm.icms;

import java.math.BigDecimal;

public interface ICMS {
  BigDecimal calcular(Venda venda);
}
