package Usando_HashMap;

import java.util.ArrayList;

public class Admin extends Pessoa{
	
	Admin(String nome, String cpf){
		this.CPF = cpf;
		this.nome = nome;
		this.admin = true;
	}
	
	public void reposicao(Livro l, int quant) {
		l.reposicao(quant, this);
	}
	
	public String venda(Cliente c, Livro l, ArrayList<Livro> livros) {
		if(Regras.validarVenda(c, livros, l)) {
			livros.add(l);
			l.vendido();
			return "Venda Feita com sucesso";
		}
		return "Ocorreu um erro na venda";
	}
	
}
