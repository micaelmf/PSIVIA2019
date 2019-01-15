package br.com.ivia.selecao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizBuzTests {
	@Test
	public void DeveRetornarFizParaMultiploDe3( ) {
		FizBuz fb = new FizBuz();
		String result = fb.Retorno(3);
		assertEquals("FIZ",result);
	}
	
	@Test
	public void DeveRetornarBuzParaMultiploDe5( ) {
		FizBuz fb = new FizBuz();
		String result = fb.Retorno(5);
		assertEquals("BUZ",result);
	}
	
	@Test
	public void DeveRetornarFizBuzParaMultiploDe3e5( ) {
		FizBuz fb = new FizBuz();
		String result = fb.Retorno(15);
		assertEquals("FIZBUZ",result);
	}
}
