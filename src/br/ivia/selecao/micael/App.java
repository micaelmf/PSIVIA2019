package br.ivia.selecao.micael;

import java.util.Scanner;

public class App {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in); 
		int menu = 0;
		int numero = 0;
		ContandoLetrasDosNumeros contador = null;
		
		System.out.println("-----------------------------------");
		System.out.println("CONTANDO AS LETRAS DOS N�MEROS");
		System.out.println("-----------------------------------");
		System.out.println("============== Menu ==============");
		while(menu != 1 && menu != 2 && menu != 3){
			System.out.println("Digite:");
			System.out.println("1 para Contar letras de um n�mero n");
			System.out.println("2 para Contar letras dos n�meros de 1 at� n");
			System.out.println("3 para Contar letras dos n�meros de 1 at� 1000");
			System.out.print("Digite aqui > ");
			menu = scanner.nextInt();
			if(menu != 1 && menu != 2 && menu != 3){
				System.out.println("!!! OP��O INV�LIDA !!!");
			}
		}
		
		switch(menu){
	        case 1:
	        	System.out.println("-------------------");
	        	while(numero < 1 || numero > 1000){
	        		System.out.print("Digite um n�mero entre 1 e 1000: ");
	        		numero = scanner.nextInt();
	        	}
	        	contador = new ContandoLetrasDosNumeros();
	    		contador.contaLetrasDeUmUnicoNumero(Integer.toString(numero));
	    		System.out.println("RESULTADO > O n�mero " + numero + " tem " + contador.verAcomulado() + " letras");
	    		System.out.println("-------------------");
	    		System.out.println("Fim da execu��o");
	    		System.exit(0);
	            break;
	        case 2:
	        	System.out.println("-------------------");
	        	while(numero < 1 || numero > 1000){
	        		System.out.print("Digite um n�mero entre 1 e 1000: ");
	        		numero = scanner.nextInt();
	        	}
	        	contador = new ContandoLetrasDosNumeros();
	    		contador.acomulador(Integer.toString(numero));
	    		System.out.println("RESULTADO > O intervalo de 1 at� "+ numero + " tem " + contador.verAcomulado() + " letras");
	    		System.out.println("-------------------");
	    		System.out.println("Fim da execu��o");
	    		System.exit(0);
	            break;
	        case 3:
	        	System.out.println("-------------------");
	        	contador = new ContandoLetrasDosNumeros();
	    		contador.acomulador("1000");
	    		System.out.println("RESULTADO > O intervalo de 1 at� 1000 tem " + contador.verAcomulado() + " letras");
	    		System.out.println("-------------------");
	    		System.out.println("Fim da execu��o");
	    		System.exit(0);
	        default:
	            System.out.println("Op��o de menu inv�lida");
		}
		
	}

}
