package Questao4;

public class Flor extends Flora{
	private String tipoDeFlor;
	private String corDaFlor;
	
	public String getTipoDeFlor() {
		return tipoDeFlor;
	}
	public void setTipoDeFlor(String tipoDeFlor) {
		this.tipoDeFlor = tipoDeFlor;
	}
	public String getCorDaFlor() {
		return corDaFlor;
	}
	public void setCorDaFlor(String corDaFlor) {
		this.corDaFlor = corDaFlor;
	}
	
	
	public Flor(String tipoDeFlor, String corDaFlor){
		super.setTipoPlanta("Flor");
		setCorDaFlor(corDaFlor);
		setTipoDeFlor(tipoDeFlor);
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nTipo: "+getTipoDeFlor()+
				"\nCor: "+getCorDaFlor();
	}
}
