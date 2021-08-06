package Usando_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<Cliente, ArrayList<Livro>> baseDeDados = new HashMap<Cliente, ArrayList<Livro>>();
		ArrayList<Admin> empregados = new ArrayList<Admin>();

		// Adicao de Clientes
		Cliente a1 = new Cliente("Alexandre", "666.777.888-54");
		Cliente a2 = new Cliente("Brenne", "999.777.888-68");
		Cliente a3 = new Cliente("Manel", "555.777.111-59");
		Cliente a4 = new Cliente("Jubileu", "444.333.222-55");
		
		
		// Adicao de Vendedores
		empregados.add(new Admin("Vigno", "123.456.789-00"));
		empregados.add(new Admin("Alcemir", "987.654.321-11"));
		empregados.add(new Admin("Fabio", "564.897.231-22"));
		
		// Adicao de Livros
		Livro l1 = new Livro("Mitologia Nordica", "Fulano", "2021", 3);
		Livro l2 = new Livro("Mitologia Grega", "Cicrano", "2019", 1);
		Livro l3 = new Livro("Mitologia Egipcia", "Aquele", "2015", 2);
		Livro l4 = new Livro("Culpa das Estrela", "Fulano", "2020", 5);
		Livro l5 = new Livro("Arduino", "Cicrano", "2001", 6);
		Livro l6 = new Livro("Programacao para iniciantes", "Fulano", "2021", 1);
		Livro l7 = new Livro("Filosofia", "Aleque", "2021", 0);
		
		
		//obs: se colocar "Pessoa a1 = new Cliente();
		//o put da erro
		
		baseDeDados.put(a1, new ArrayList<Livro>());
		baseDeDados.put(a2, new ArrayList<Livro>());
		baseDeDados.put(a3, new ArrayList<Livro>());
		baseDeDados.put(a4, new ArrayList<Livro>());
		
		l2.reposicao(3, empregados.get(0));
		l6.reposicao(1, empregados.get(1));
		l7.reposicao(5, empregados.get(2));
		
		System.out.println("Dados do livro: \n"+l4);
		
		empregados.get(0).venda(a1, l1, baseDeDados.get(a1));
		empregados.get(0).venda(a2, l1, baseDeDados.get(a2));
		empregados.get(1).venda(a1, l1, baseDeDados.get(a1));
		empregados.get(1).venda(a4, l3, baseDeDados.get(a4));
		empregados.get(2).venda(a1, l7, baseDeDados.get(a1));
		empregados.get(2).venda(a2, l5, baseDeDados.get(a2));
		empregados.get(2).venda(a3, l6, baseDeDados.get(a3));
		empregados.get(2).venda(a3, l2, baseDeDados.get(a3));
		
		System.out.println("\n"+l6+"\t\tUnidades: "+l6.getUnidades()+"\n");
		
		empregados.get(0).venda(a4, l6, baseDeDados.get(a4));
		empregados.get(1).venda(a2, l6, baseDeDados.get(a2));
		
		System.out.println("\n"+l6+"\t\tUnidades: "+l6.getUnidades()+"\n");
		
		listaClientes(baseDeDados);
		
		
	}
	
	static void listaClientes(Map<Cliente, ArrayList<Livro>> baseDeDados) {
		for (Cliente c : baseDeDados.keySet()) {
			System.out.println(c);
			listaLivros(c, baseDeDados);
		}
	}
	
	static void listaLivros(Cliente c, Map<Cliente, ArrayList<Livro>> baseDeDados) {
		System.out.println("\tLivros em obtidos: ");
		for (Livro l : baseDeDados.get(c)) {
			System.out.println(l);
		}
	}
	
	
}