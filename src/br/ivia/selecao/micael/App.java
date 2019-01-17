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
		System.out.println("CONTANDO AS LETRAS DOS NÚMEROS");
		System.out.println("-----------------------------------");
		System.out.println("============== Menu ==============");
		while(menu != 1 && menu != 2 && menu != 3){
			System.out.println("Digite:");
			System.out.println("1 para Contar letras de um número n");
			System.out.println("2 para Contar letras dos números de 1 até n");
			System.out.println("3 para Contar letras dos números de 1 até 1000");
			System.out.print("Digite aqui > ");
			menu = scanner.nextInt();
			if(menu != 1 && menu != 2 && menu != 3){
				System.out.println("!!! OPÇÃO INVÁLIDA !!!");
			}
		}
		
		switch(menu){
	        case 1:
	        	System.out.println("-------------------");
	        	while(numero < 1 || numero > 1000){
	        		System.out.print("Digite um número entre 1 e 1000: ");
	        		numero = scanner.nextInt();
	        	}
	        	contador = new ContandoLetrasDosNumeros();
	    		contador.contaLetrasDeUmUnicoNumero(Integer.toString(numero));
	    		System.out.println("RESULTADO > O número " + numero + " tem " + contador.verAcomulado() + " letras");
	    		System.out.println("-------------------");
	    		System.out.println("Fim da execução");
	    		System.exit(0);
	            break;
	        case 2:
	        	System.out.println("-------------------");
	        	while(numero < 1 || numero > 1000){
	        		System.out.print("Digite um número entre 1 e 1000: ");
	        		numero = scanner.nextInt();
	        	}
	        	contador = new ContandoLetrasDosNumeros();
	    		contador.acomulador(Integer.toString(numero));
	    		System.out.println("RESULTADO > O intervalo de 1 até "+ numero + " tem " + contador.verAcomulado() + " letras");
	    		System.out.println("-------------------");
	    		System.out.println("Fim da execução");
	    		System.exit(0);
	            break;
	        case 3:
	        	System.out.println("-------------------");
	        	contador = new ContandoLetrasDosNumeros();
	    		contador.acomulador("1000");
	    		System.out.println("RESULTADO > O intervalo de 1 até 1000 tem " + contador.verAcomulado() + " letras");
	    		System.out.println("-------------------");
	    		System.out.println("Fim da execução");
	    		System.exit(0);
	        default:
	            System.out.println("Opção de menu inválida");
		}
		
	}

}
