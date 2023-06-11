package org.exercicio.banco.template.model;

import java.math.BigDecimal;

public interface Conta {

    void depositar(BigDecimal quantia);
    void sacar(BigDecimal quantia);
    void transferir(BigDecimal quantia, ContaBancaria c);
    double getSaldo();
	
}
