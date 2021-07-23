package Questao1;

public class Main {

	public static void main(String[] args) {
		Peixe peixe = new Peixe("Peixe-Gato",10,"Agua doce");
		Peixe peixe2 = new Peixe("Peixe-Palhaco",7.6,"Agua salgada");
		Cachorro cachorro = new Cachorro("Spike",10.2,"Piche");
		Cachorro cachorro2 = new Cachorro("Bela",5.8,"Pug");
		
		peixe2.setNome("Peixe gato");
		cachorro.setNome("Huck");
		cachorro2.setPeso(12.0);
		peixe.setPeso(0);
		cachorro.setRaca("Poodle");
		peixe.settipoHabitat("Ornamental");
		cachorro2.setRaca("Akita");
		
		
		System.out.println(peixe+"\n\n" + peixe2+"\n\n" + cachorro+
				"\n\n" + cachorro2);

	
	}

}
