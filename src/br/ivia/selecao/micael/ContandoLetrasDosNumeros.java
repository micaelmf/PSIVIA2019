package br.ivia.selecao.micael;

import java.util.HashMap;

public class ContandoLetrasDosNumeros {
	StringBuilder acomulador;
	HashMap<String, String> hashMap;
	
	public ContandoLetrasDosNumeros(){
		this.acomulador = new StringBuilder();
		this.hashMap = new HashMap<String, String>();
		this.hashMap.put("1", "um");
		this.hashMap.put("2", "dois");
		this.hashMap.put("3", "tres");
		this.hashMap.put("4", "quatro");
		this.hashMap.put("5", "cinco");
		this.hashMap.put("6", "seis");
		this.hashMap.put("7", "sete");
		this.hashMap.put("8", "oito");
		this.hashMap.put("9", "nove");
		this.hashMap.put("10", "dez");
		this.hashMap.put("11", "onze");
		this.hashMap.put("12", "doze");
		this.hashMap.put("13", "treze");
		this.hashMap.put("14", "quatorze");
		this.hashMap.put("15", "quinze");
		this.hashMap.put("16", "dezesseis");
		this.hashMap.put("17", "dezessete");
		this.hashMap.put("18", "dezoito");
		this.hashMap.put("19", "dezenove");
		this.hashMap.put("20", "vinte");
		this.hashMap.put("30", "trinta");
		this.hashMap.put("40", "quarenta");
		this.hashMap.put("50", "cinquanta");
		this.hashMap.put("60", "sessenta");
		this.hashMap.put("70", "setenta");
		this.hashMap.put("80", "oitenta");
		this.hashMap.put("90", "noventa");
		this.hashMap.put("100", "cem");
		this.hashMap.put("200", "duzentos");
		this.hashMap.put("300", "trezentos");
		this.hashMap.put("400", "quatrocentos");
		this.hashMap.put("500", "quinhentos");
		this.hashMap.put("600", "seiscentos");
		this.hashMap.put("700", "setecentos");
		this.hashMap.put("800", "oitocentos");
		this.hashMap.put("900", "novecentos");
		this.hashMap.put("1000", "mil");
	}
	
	public int contaLetrasDeUmUnicoNumero(String numero) {
		this.acomulador.append(this.hashMap.get(numero));
		return this.acomulador.length();
	}

}
