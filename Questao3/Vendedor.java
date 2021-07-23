package Questao3;

public class Vendedor extends Empregado{
	protected double valor;
	protected double comissao;
	
	public double getvalor() {
		return valor;
	}

	public void setvalor(double valor) {
		this.valor = valor;
	}

	public double getComissao() {
		return this.valor * this.imposto;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() +
			   "\nEnd.: " + getEndereco() +
			   "\nTel: " + getTelefone() +
			   "\nSetor: " + getCodigoSetor()+
			   "\nBase: " + getSalarioBase()+
			   "\nComisso: " + getComissao() +
			   "\nSalario: " + calculaSalario() + 
			   "\nImposto: " + getImposto() * 100 + " %";
	}
	
	@Override
	public double calculaSalario() {
		return this.salarioBase + getComissao();
	}

	


}
