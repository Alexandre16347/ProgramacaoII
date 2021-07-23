package Questao3;

public class Operario extends Empregado {
	protected double valorProducao;
	protected double comissao;

	
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return valorProducao * imposto;
	}



	@Override
	public double calculaSalario() {
		return this.salarioBase + getComissao();
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() +
			   "\nEnd: " + getEndereco() +
			   "\nTel: " + getTelefone() +
			   "\nSetor: " + getCodigoSetor()+
			   "\nBase: " + getSalarioBase()+
			   "\nComissao: " + getComissao() +
			   "\nSalario: " + calculaSalario() + 
			   "\nImposto: " + getImposto() * 100 + " %";
	}
}
