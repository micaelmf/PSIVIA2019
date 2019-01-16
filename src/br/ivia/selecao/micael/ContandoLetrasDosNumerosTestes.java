package br.ivia.selecao.micael;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContandoLetrasDosNumerosTestes {

	@Test
	//Teste1
	public void contaAsLetrasDoNumeroDois() {
		ContandoLetrasDosNumeros contador = new ContandoLetrasDosNumeros();
		contador.contaLetrasDeUmUnicoNumero("2");
		int resultado = contador.verAcomulado();
		
		assertEquals(4, resultado);
	}
	
	@Test
	//Teste2
	public void contaAsLetrasDoNumeroTrinta() {
		ContandoLetrasDosNumeros contador = new ContandoLetrasDosNumeros();
		contador.contaLetrasDeUmUnicoNumero("30");
		int resultado = contador.verAcomulado();
		
		assertEquals(6, resultado);
	}
	
	@Test
	//Teste3
	public void contaAsLetrasDoNumeroTrintaEDois() {
		ContandoLetrasDosNumeros contador = new ContandoLetrasDosNumeros();
		contador.contaLetrasDeUmUnicoNumero("32");
		int resultado = contador.verAcomulado();
		
		assertEquals(13, resultado);
	}
	
	@Test
	//Teste4
	public void contaAsLetrasDoNumeroCentoEVinteECinco() {
		ContandoLetrasDosNumeros contador = new ContandoLetrasDosNumeros();
		contador.contaLetrasDeUmUnicoNumero("125");
		int resultado = contador.verAcomulado();
		assertEquals(21, resultado);
	}
	
	@Test
	//Teste5
	public void contaAsLetrasDoNumeroNovecentosEOitentaEUm() {
		ContandoLetrasDosNumeros contador = new ContandoLetrasDosNumeros();
		contador.contaLetrasDeUmUnicoNumero("981");
		int resultado = contador.verAcomulado();
		assertEquals(25, resultado);
	}
	
	@Test
	//Teste6
	public void contaAsLetrasDeUmAteN() {
		ContandoLetrasDosNumeros contador = new ContandoLetrasDosNumeros();
		contador.acomulador("5");
		int resultado = contador.verAcomulado();
		assertEquals(21, resultado);
	}
	
	@Test
	//Teste7
	public void contaAsLetrasDeUmAteMil() {
		ContandoLetrasDosNumeros contador = new ContandoLetrasDosNumeros();
		contador.acomulador("100");
		int resultado = contador.verAcomulado();
		assertEquals(1185, resultado);
	}
	
	
}
