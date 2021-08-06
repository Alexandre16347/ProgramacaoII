package Questao4;

public class Flora {
	protected String tipoPlanta;
	
	public String getTipoPlanta() {
		return tipoPlanta;
	}
	public void setTipoPlanta(String tipoPlanta) {
		this.tipoPlanta = tipoPlanta;
	}
	
	@Override
	public String toString() {
		return "Flora: "+getTipoPlanta();
	}
	
	
}
