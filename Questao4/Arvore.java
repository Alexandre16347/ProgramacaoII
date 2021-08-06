package Questao4;

public class Arvore extends Flora {
	
	private String tipoDeArvore;
	private int altura;
	
	private boolean frutifera;
	
	public String getTipoDeArvore() {
		return tipoDeArvore;
	}
	public void setTipoDeArvore(String tipoDeArvore) {
		this.tipoDeArvore = tipoDeArvore;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public boolean isFrutifera() {
		return frutifera;
	}
	public void setFrutifera(boolean frutifera) {
		this.frutifera = frutifera;
	}
	
	public Arvore(String tipoDeArvore, int altura, boolean frutifera) {
		super.setTipoPlanta("Arvore");
		this.setAltura(altura);
		this.setFrutifera(frutifera);
		this.setTipoDeArvore(tipoDeArvore);
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nTipo: "+getTipoDeArvore()+
				"\nFrutifera: "+ isFrutifera()+"\nAltura: "+
				getAltura()+" m";
	}
	
	
}
