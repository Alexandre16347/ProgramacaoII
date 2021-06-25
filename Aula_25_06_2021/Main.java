package Aula_25_06_2021;

public class Main {

	public static void main(String[] args) {
		Vetor listaDeAluno = new Vetor();
		
		Aluno um = new Aluno("Alexandre", 10.0);
		Aluno dois = new Aluno("Brenne", 9.2);
		Aluno tres = new Aluno("Manoel", 8.6);
		Aluno quatro = new Aluno("Victor", 3.1);
		Aluno cinco = new Aluno("Gustavo", 7.7);
		
		
		listaDeAluno.adiciona(um);
		listaDeAluno.adiciona(dois);
		listaDeAluno.adiciona(tres);
		listaDeAluno.adiciona(quatro);
		listaDeAluno.adiciona(cinco);
		
		listaDeAluno.imprimeLista();
		
		System.out.println("Buscando: ");
		listaDeAluno.busca(0).imprimeDados();
	
		
		listaDeAluno.remove(3);
		
		System.out.println("Nova Lista: \n");
		
		listaDeAluno.imprimeLista();
		
	}
	
}
