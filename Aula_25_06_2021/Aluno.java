package Aula_25_06_2021;

public class Aluno {
	
	private String nome;
	private double nota;
	
	//Geteres e Seteres
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	//Construtores
	
	Aluno(String nome, double nota){
		setNome(nome);
		setNota(nota);
	}
	
	

}
