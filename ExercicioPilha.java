package exercicioPilha;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		
		String livro;
		int opcao;

		Scanner leia = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();

		System.out.println("*********************************************");
		System.out.println("");
		System.out.println("");
		System.out.println("     1 - Adicionar Livro na pilha      ");
		System.out.println("     2 - Listar todos os livros     ");
		System.out.println("     3 - Retirar livro da pilha      ");
		System.out.println("     0 - Sair      ");
		System.out.println("");
		System.out.println("");
		System.out.println("*********************************************");

		do {
			System.out.println("\nDigite uma opção: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				livro = leia.next();
				pilha.push(livro);
				System.out.println("Livro \"" + livro + "\" adicionado na fila!");
				break;

			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("Livros na fila :" + pilha);
				}
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A fila está vazia, não há clientes para chamar.");
				} else {
					String livroRetirado = pilha.pop();
					System.out.println("Livro \" " + livroRetirado + "\" foi retirado.");
				}
				break;

			case 0:
				System.out.println("Programa finalizado.");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (opcao != 0);

	}

}
