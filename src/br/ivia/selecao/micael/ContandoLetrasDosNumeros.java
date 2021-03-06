package br.ivia.selecao.micael;

import java.util.ArrayList;
import java.util.HashMap;

public class ContandoLetrasDosNumeros {
	private StringBuilder acomulado;
	private ArrayList<String> list;
	private HashMap<String, String> hashMap;
	
	public ContandoLetrasDosNumeros(){
		this.acomulado = new StringBuilder();
		this.list = new ArrayList<String>(29);
		this.hashMap = new HashMap<String, String>();
		
		this.list.add(0,null);
		this.list.add(1,"um");
		this.list.add(2,"dois");
		this.list.add(3,"tres");
		this.list.add(4,"quatro");
		this.list.add(5,"cinco");
		this.list.add(6,"seis");
		this.list.add(7,"sete");
		this.list.add(8,"oito");
		this.list.add(9,"nove");
		this.list.add(10,null);
		this.list.add(11,null);
		this.list.add(12,"vinte");
		this.list.add(13,"trinta");
		this.list.add(14,"quarenta");
		this.list.add(15,"cinquanta");
		this.list.add(16,"sessenta");
		this.list.add(17,"setenta");
		this.list.add(18,"oitenta");
		this.list.add(19,"noventa");
		this.list.add(20,null);
		this.list.add(21,"cento");
		this.list.add(22,"duzentos");
		this.list.add(23,"trezentos");
		this.list.add(24,"quatrocentos");
		this.list.add(25,"quinhentos");
		this.list.add(26,"seiscentos");
		this.list.add(27,"setecentos");
		this.list.add(28,"oitocentos");
		this.list.add(29,"novecentos");
		
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
		this.hashMap.put("100", "cem");
		this.hashMap.put("1000", "mil");
	}
	
	public void contaLetrasDeUmUnicoNumero(String numero) {

		if(this.hashMap.containsKey(numero)){
			this.acomulado.append(this.hashMap.get(numero));

		}else if(numero.length() == 1){
			int numeroInteiro = Character.getNumericValue(numero.charAt(0));
			this.acomulado.append(this.list.get(numeroInteiro));

		}else if(numero.length() == 2){
			int numeroInteiro = Character.getNumericValue(numero.charAt(0));
			this.acomulado.append(this.list.get(10+numeroInteiro));
			if(numero.charAt(1) != '0'){
				this.acomulado.append("e");
				this.acomulado.append(this.list.get(Character.getNumericValue(numero.charAt(1))));
			}

		}else if(numero.length() == 3 && numero.charAt(1) != '1'){
			int numeroInteiro = Character.getNumericValue(numero.charAt(0));
			this.acomulado.append(this.list.get(20+numeroInteiro));
			if(numero.charAt(1) != '0'){
				numeroInteiro = Character.getNumericValue(numero.charAt(1));
				this.acomulado.append("e");
				this.acomulado.append(this.list.get(10+numeroInteiro));
			}
			if(numero.charAt(2) != '0'){
				this.acomulado.append("e");
				this.acomulado.append(this.list.get(Character.getNumericValue(numero.charAt(2))));
			}

		}else if(numero.length() == 3 && numero.charAt(1) == '1'){
			String dezena = Character.toString(numero.charAt(1));
			dezena = dezena + Character.toString(numero.charAt(2));
			int numeroInteiro = Character.getNumericValue(numero.charAt(0));

			this.acomulado.append(this.list.get(20+numeroInteiro));
			this.acomulado.append("e");
			this.acomulado.append(this.hashMap.get(dezena));
		}
		
	}
	
	public void acomulador(String numero){
		int numeroInteiro = Integer.parseInt(numero);
		for(int i = 0; i < numeroInteiro; i++){
			int aux = i+1;
			this.contaLetrasDeUmUnicoNumero(Integer.toString(aux));
		}
	}

	public int verAcomulado() {
		return acomulado.length();
	}

	
}
