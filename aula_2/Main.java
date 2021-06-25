package aula_2;

public class Main {
	
	
	
	
	public static void Soma() {
		int soma = 0;
		
		for(int i=1; i<1000; i++) {
			
			if(i%3 == 0 || i%5 == 0) {
				soma += i;
			}
			
		}
		
		System.out.println("A soma eh: "+ soma);
	}
	
	
	
	
	
	
	public static void SomaFibonnaci() {
		int val1=1, val2=2, soma=0;
		while(soma < 4e6) {
			//val1;
		}
	}
	
	public static boolean Primo(int val) {
		int cont =0;
		
		for(int i=2; i<10; i++) {
			
			if(val%i == 0 && cont == 0) {
				cont++;
			}
			
		}
		
		if(cont > 1) {
			return false;
		}
		
		return true;
	}
	
	
	public static void FatorPrimo() {
		int fator=0, num = 12;
		
		for(int i=2; i<num; i++) {
			if(Primo(i) && num%i == 0) {
				fator = i;
			}
		}
		System.out.println("O maior fator primo do valor "+num+" eh: "+fator);
	}
	

	public static void main(String[] args) {
		//Soma();
		FatorPrimo();

	}
	
	

}
