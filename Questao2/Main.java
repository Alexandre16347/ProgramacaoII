package Questao2;

public class Main {
	
	public static void main(String[] args) {
		
		Vendedor vend = new Vendedor("Jubileu",2500,200,2);
		Gerente gerent = new Gerente("Alexandre",20,"1071888","Nery");
		Cliente client = new Cliente("Manoel", 21, "Femea", 120.50, 2000);
		
		
		System.out.println("\n\tCliente\n"+client+"\n\tVendedor\n"+vend);
		gerent.setSalario(2000); 
		System.out.println("\n\tGerente\n"+gerent);
		
		
	}
	
}
