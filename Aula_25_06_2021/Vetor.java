package Aula_25_06_2021;

public class Vetor {

	private Aluno[] aluno;
	private int cont;
	
	public int getCont() {
		return cont;
	}

	private void setCont(int cont) {
		this.cont = cont;
	}


	public Aluno[] getLista() {
		return aluno;
	}
	
	public void setLista(Aluno[] novalista, boolean tipo) {
		if(tipo) {
			for(int i=0; i<cont-1;i++){
				this.aluno[i] = novalista[i];
			}
		}else {
			for(int i=0; i<cont;i++) {
				this.aluno[i] = novalista[i];
			}
		}
	}
	
	public void imprimeLista() {
		for(Aluno tmp: aluno) {
			tmp.imprimeDados();
		}
		System.out.println(getLista().length);
	}
	
	private void iniciaLista() {
		this.aluno = new Aluno[1];
	}
	
	private void mudaTamLista(boolean tipo) {
		Aluno[] aux = aluno;
		this.aluno = new Aluno[cont];
		setLista(aux, tipo);
	}
	
	
	public void adiciona(Aluno aluno) {
		int aux = getCont();
		setCont(++aux);
		mudaTamLista(true);
		Aluno[] lista = getLista();
		--aux;
		lista[aux] = aluno;
	}


	public Aluno busca(int posicao) {
		return getLista()[posicao];
	}
	
	public void remove(int posicao) {
		Aluno[] vetor = getLista();
		int aux = getCont();
		
		if(posicao == aux-2) {
			vetor[posicao] = vetor[posicao+1];
		}
		
		for(int i = posicao; i < aux-2; i++) {
			vetor[i] = vetor[i+1];
		}
		
		setCont(--aux);
		
		mudaTamLista(false);
	}
	
	
	
	
	
	
	
	
	
	public Vetor(){
		iniciaLista();
		setCont(0);
	}
	
}
