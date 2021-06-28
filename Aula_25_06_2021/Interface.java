package Aula_25_06_2021;

import java.util.Scanner;

public class Interface {

	private String nome;
	private Double nota;
	private int posicao;

	public void menu() {
		System.out.println("================  Menu  ================");
		System.out.println("Lista de Alunos	 ------------------- (1)"); // ok
		System.out.println("Lista para teste ------------------- (2)"); // ok
		System.out.println("Adicionar        ------------------- (3)"); // com bug
		System.out.println("Remover          ------------------  (4)"); // com bug
		System.out.println("Buscar	         ------------------- (5)");
		System.out.println("SAIR             ------------------- (0)"); // ok
		System.out.println("========================================");
		System.out.print("\nEscolha: ");

	}

	public void interfaceDoVetor(Vetor listaDeAlunos) {
		int i = 0;

		Scanner teclado = new Scanner(System.in);

		do {
			menu();
			i = teclado.nextInt();

			switch (i) {
			case (1): {
				listaDeAlunos.imprimeLista();
				break;
			}
			case (2): {

				int numAluno = 0;
				while (numAluno < 10) {
					addAluno(listaDeAlunos, numAluno);
					numAluno++;

				}
				break;
			}
			case (3): {
				Aluno novo = new Aluno();
				System.out.print("Nome: ");
				this.nome = teclado.next();
				System.out.print("Nota: ");
				this.nota = teclado.nextDouble();
				novo.setNome(this.nome);
				novo.setNota(this.nota);
				listaDeAlunos.adiciona(novo);
				break;
			}
			case (4): {
				System.out.print("Posicao: ");
				int numero = teclado.nextInt();
				listaDeAlunos.remove(numero);
				break;
			}
			case (5): {
				System.out.print("Posicao: ");
				posicao = teclado.nextInt();
				listaDeAlunos.busca(posicao);
			}

			}

		} while (i != 0);
		teclado.close();
	}

	private void addAluno(Vetor listaDeAlunos, int numAluno) {
		switch (numAluno) {
		case (0): {
			Aluno a1 = new Aluno("Manoel", 7.0);
			listaDeAlunos.adiciona(a1);
			break;
		}
		case (1): {
			Aluno a2 = new Aluno("Brenne", 8.0);
			listaDeAlunos.adiciona(a2);
			break;
		}
		case (2): {
			Aluno a3 = new Aluno("Alexandre", 9.5);
			listaDeAlunos.adiciona(a3);
			break;
		}
		case (3): {
			Aluno a4 = new Aluno("Mariana", 10.0);
			listaDeAlunos.adiciona(a4);
			break;
		}
		case (4): {
			Aluno a5 = new Aluno("Claudia", 2.30);
			listaDeAlunos.adiciona(a5);
			break;
		}
		case (5): {
			Aluno a6 = new Aluno("Artur", 10.0);
			listaDeAlunos.adiciona(a6);
			break;
		}
		case (6): {
			Aluno a7 = new Aluno("Bruno", 4.0);
			listaDeAlunos.adiciona(a7);
			break;
		}
		case (7): {
			Aluno a8 = new Aluno("Neyde", 1.0);
			listaDeAlunos.adiciona(a8);
			break;
		}
		case (8): {
			Aluno a9 = new Aluno("Junior", 9.5);
			listaDeAlunos.adiciona(a9);
			break;
		}
		case (9): {
			Aluno a10 = new Aluno("Alex", 3.0);
			listaDeAlunos.adiciona(a10);
			break;
		}
		}

	}
}
