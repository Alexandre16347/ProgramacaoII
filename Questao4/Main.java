package Questao4;

public class Main {
	
	public static void main(String[] args) {
		Flora arvore = new Arvore("Pinheiro", 12, true);
		Flora flor = new Flor("Orquidea", "Branca");
		Mato mato = new Mato("Rasteiro", false);
		
		System.out.println(arvore+"\n\n"+flor+"\n\n"+mato);
	}

}
