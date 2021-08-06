package Questao4;

public class Mato extends Flora{
	private String tipoDeMato;
	private boolean venenoso;
	
	public String getTipoDeMato() {
		return tipoDeMato;
	}
	public void setTipoDeMato(String tipoDeMato) {
		this.tipoDeMato = tipoDeMato;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public Mato(String tipoDeMato, boolean venenoso){
		super.setTipoPlanta("Mato");
		setTipoDeMato(tipoDeMato);
		setVenenoso(venenoso);
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nTipo: "+getTipoDeMato()+
				"\nVenenoso: "+isVenenoso();
	}
}
