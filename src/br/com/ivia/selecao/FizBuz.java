package br.com.ivia.selecao;

public class FizBuz {
	public String Retorno(int numero) {
		if (numero % 3 == 0 && numero % 5 == 0) {
			return "FIZBUZ";
		}
		if (numero % 3 == 0) {
			return "FIZ";
		}
		if (numero % 5 == 0) {
			return "BUZ";
		}
		return numero + "";
	}
}
