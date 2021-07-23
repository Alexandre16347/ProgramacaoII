package Questao3;

public class Administrador extends Empregado {
	protected double ajuda;

	public double getajuda() {
		return ajuda;
	}

	public void setajuda(double ajuda) {
		this.ajuda = ajuda;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() +
			   "\nEnd: " + getEndereco() +
			   "\nTel: " + getTelefone() +
			   "\nSetor: " + getCodigoSetor()+
			   "\nSalario: " + calculaSalario() ;
	}
	
	@Override
	public double calculaSalario() {
		return getSalarioBase() + this.ajuda ;
	}
	
	public Administrador(String nome,String endereco,String telefone,
			int codigoSetor,double salarioBase,double ajuda) {
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setCodigoSetor(codigoSetor);
		this.setSalarioBase(salarioBase);
		this.setajuda(ajuda);
	}
}
