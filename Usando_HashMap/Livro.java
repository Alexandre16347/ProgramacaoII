package Usando_HashMap;

public class Livro {
	String autor, nome, edicao;
	int unidades;
	
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public int getUnidades() {
		return unidades;
	}
	
	
	
	
	private void reposicao(int unidades) {
		this.unidades += unidades;
	}
	
	public boolean reposicao(int unidades, Admin vend) {
		if(vend.isAdmin()) {
			this.unidades += unidades;
			System.out.println("\nUnidades de "+getNome()+" da edicao "+getEdicao()+
					" Repostas por "+ vend.getNome()+"\n");
			return true;
		}
		System.err.println("\nErro na Reposicao"+"\n");
		return false;
	}
	
	public void vendido() {
		this.unidades--;
	}

	public boolean equals(Livro l) {
		if(this.getNome() == l.getNome() && this.getEdicao() == l.getEdicao()) 
			return true;
		return false;
	}
	
	
	public Livro(String nome, String autor, String edicao, int unid) {
		this.autor = autor;
		this.edicao = edicao;
		this.nome = nome;
		reposicao(unid);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\t\tNome: "+getNome()+"\n\t\tAutor: "+getAutor()+"\n\t\tEdicao: "+getEdicao()+"\n";
	}
	
}
