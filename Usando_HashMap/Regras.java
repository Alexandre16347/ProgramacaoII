package Usando_HashMap;

import java.util.ArrayList;

public class Regras {
	
	public static boolean validarQuantUnidades(int quant) {
		if(quant > 0) return true;
		if(quant == 0) System.err.println("\nUnidades esgotadas\n");
		return false;
	}
	
	//bem inutil 
	public static boolean validarAdmin(Pessoa p) {
		if(p.admin) return true;
		return false;
	}
	
	public static boolean validarVenda(Pessoa clien, ArrayList<Livro> lvend, Livro lclien) {
		if(!clien.isAdmin() && validarQuantUnidades(lclien.getUnidades())) {
			for (Livro livro : lvend) {
				if(livro.equals(lclien)) {
					System.out.println("\nCliente "+clien.getNome()+" ja possue o livro "+
							lclien.nome+"\n");
					return false;
				}
			}
			return true;
		}else if (clien.isAdmin()) System.err.println("\nO nenem nao e nenem");
		return false;
	}
	
}
