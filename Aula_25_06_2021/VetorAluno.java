package Aula_25_06_2021;

import java.util.ArrayList;
import java.util.List;

public class VetorAluno {
	
	private List<Aluno> aluno;
	private int cont;
	
	public int getCont() {
		return cont;
	}


	public void setCont(int cont) {
		this.cont = cont;
	}


	public List<Aluno> getLista() {
		return aluno;
	}
	
	public void setLista() {
		this.aluno = new ArrayList<Aluno>();
	}
	
	
	public void adiciona(Aluno aluno) {
		 
		if(getLista().add(aluno)) {
			System.err.println("Adicionado");
		}else {
			System.err.println("Não adicionado");
		}
		
	}


	public Aluno busca(int posicao) {
		return getLista().get(posicao);
	}
	
	public void remove(int posicao) {
		if(getLista().remove(posicao) != null) {
			System.err.println("Removido");
		}else {
			System.err.println("Não removido");
		}
	}
	
	
	
	
	
	
	
	
	
	public VetorAluno(){
		setLista();
		setCont(0);
	}
	
	

}
