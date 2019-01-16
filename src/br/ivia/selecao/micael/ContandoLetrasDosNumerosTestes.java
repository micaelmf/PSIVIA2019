package br.ivia.selecao.micael;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContandoLetrasDosNumerosTestes {

	@Test
	//Teste1
	public void contaAsLetrasDoNumeroDois() {
		ContandoLetrasDosNumeros contador = new ContandoLetrasDosNumeros();
		int resultado = contador.contaLetrasDeUmUnicoNumero("2");
		
		assertEquals(4, resultado);
	}
	
	@Test
	//Teste2
	public void contaAsLetrasDoNumeroTrinta() {
		ContandoLetrasDosNumeros contador = new ContandoLetrasDosNumeros();
		int resultado = contador.contaLetrasDeUmUnicoNumero("30");
		
		assertEquals(6, resultado);
	}
	
	@Test
	//Teste3
	public void contaAsLetrasDoNumeroTrintaEDois() {
		ContandoLetrasDosNumeros contador = new ContandoLetrasDosNumeros();
		int resultado = contador.contaLetrasDeUmUnicoNumero("32");
		
		assertEquals(13, resultado);
	}
	
}
