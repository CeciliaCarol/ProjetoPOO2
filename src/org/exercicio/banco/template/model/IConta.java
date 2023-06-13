package org.exercicio.banco.template.model;

import java.math.BigDecimal;
import java.util.List;

public interface IConta {

	

    
	public Integer getNumeroConta();
	public BigDecimal getSaldo();
	public void depositar(BigDecimal quantia);
	public void transferir(IConta c, BigDecimal quantia);
	public void sacar(BigDecimal quantia);
	public boolean isStatus();
	public void setSaldo(BigDecimal add);
	public List<RegistroTransacao> getTransacoes();
	
	
	
	
	
	
	
	
}
