package Questao2;

public class Vendedor extends Empregado {
	protected double valorVendas;
	protected int qntVendas;

	public double getValorVendas() {
		return this.valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public int getQntVendas() {
		return this.qntVendas;
	}

	public void setQntVendas(int qntVendas) {
		this.qntVendas = qntVendas;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() +
			   "\nSalario: " + getSalario() + 
			   "\nValor das vendas: " + getValorVendas()+
			   "\nQuantidade de vendas: " + getQntVendas();
	}
	
	public Vendedor(String nome,double salario,double valorVendas,int qntVendas) {
		this.setNome(nome);
		this.setSalario(salario);
		this.setValorVendas(valorVendas);
		this.setQntVendas(qntVendas);
	}

}
