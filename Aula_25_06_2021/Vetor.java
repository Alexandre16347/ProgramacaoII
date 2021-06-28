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
		if (tipo) {
			for (int i = 0; i < cont - 1; i++) {
				this.aluno[i] = novalista[i];
			}
		} else {
			for (int i = 0; i < cont; i++) {
				this.aluno[i] = novalista[i];
			}
		}
	}

	public void imprimeLista() {
		if (getCont() == 0) {
			System.err.println("\nLista Vazia \n");
		} else {
			int index = 0;
			for (Aluno tmp : aluno) {
				System.out.println("\nPosicao: "+ index++);
				tmp.imprimeDados();
			}
			System.err.println("\nExiste(m) " + getLista().length + " aluno(s) cadastrado(s)");
		}
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
		System.err.println("\nAluno Adicionado\n");
	}

	public void busca(int posicao) {
		if (posicao >= getCont()) {
			System.err.println("\nAluno não cadastrado\n");
		} else {
			getLista()[posicao].imprimeDados();
		}
	}

	public void remove(int posicao) {
		Aluno[] vetor = getLista();
		int aux = getCont();
		
		if (!listaVazia() && aux > posicao) {
			
			if (posicao == aux - 2) {
				vetor[posicao] = vetor[posicao + 1];
			}

			for (int i = posicao; i < aux - 2; i++) {
				vetor[i] = vetor[i + 1];
			}

			setCont(--aux);

			mudaTamLista(false);

			System.err.println("\nAluno Removido\n");
		}	else if(aux == posicao){
			System.err.println("\nAluno nao encontrado\n");
		}	else {
			System.err.println("\nImpossivel apagar de uma lista vazia\n");
		}

	}

	public boolean listaVazia() {
		int aux = getCont();
		if (aux == 0) {
			return true;
		}
		return false;
	}

	public Vetor() {
		setCont(0);
	}

}
