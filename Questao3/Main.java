package Questao3;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		Administrador Adm = new Administrador("Carlos Alexandre",
				"Jose de Alencar, N 511","5659-6569",556,6000,125);
		Fornecedor forn = new Fornecedor();
		Operario operario = new Operario();
		Vendedor vendedor = new Vendedor();
		
		
		
		
		
		operario.setNome("Carlos");
		operario.setEndereco("Rua Santos Drumon");
		operario.setTelefone("55 4567-1230");
		vendedor.setNome("Alex");
		vendedor.setEndereco("Centro");
		vendedor.setTelefone("99 3367-1730");
		
		operario.setCodigoSetor(321);
		operario.setSalarioBase(2000);
		operario.setImposto(10); 
		operario.setValorProducao(5000);
		vendedor.setCodigoSetor(656);
		vendedor.setSalarioBase(2500);
		vendedor.setvalor(2000);
		vendedor.setImposto(5);
		
		
		
		
	
		System.out.println(Adm+"\n\n" + forn+"\n\n" + 
							operario+"\n\n" + vendedor);

	}
	
	
	
	
	

}
