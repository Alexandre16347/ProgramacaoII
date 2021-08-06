package Usando_HashMap;


public abstract class Pessoa {

	protected String nome;
	protected String CPF;
	protected boolean admin;

	/*
	 * Getteres e Setteres
	 * 
	 * @return
	 */

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	
	
	
	public boolean equals(Cliente novoCliente) {
		if(this.getCPF() == novoCliente.getCPF())
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: "+getNome()+"\nCPF: "+getCPF()+"\nTipo: "+
				(isAdmin()?"Admin":"Cliente");
	}
	
}