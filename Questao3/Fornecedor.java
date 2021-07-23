package Questao3;

public class Fornecedor extends Pessoa {
	protected double valorCredito;
	protected double valorDivida;
	

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double obterSaldo() {
		return this.valorCredito - this.valorDivida;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() +
			   "\nEnd: " + getEndereco() +
			   "\nTel: " + getTelefone() +
			   "\nCredito: " + getValorCredito()+
			   "\nDivida: " + getValorDivida() + 
			   "\nSaldo: " + obterSaldo();
	}
	

}
