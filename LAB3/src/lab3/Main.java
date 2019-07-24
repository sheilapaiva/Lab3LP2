package lab3;

/**
 *@author Sheila Maria Mendes Paiva - Matricula: 118210186
 */

import java.util.Scanner;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Agenda novaAgenda = new Agenda();
		String opcao;
		
		do {
			System.out.print("-------MENU-------\n(C)adastrar Contato\n(L)istar Contatos\n(E)xibir Contato\n(S)air\n\nOpção> ");
			opcao = sc.nextLine();
			if (opcao.equals("C")){
				System.out.print("\nPosição: ");
				int posicao = sc.nextInt();
				sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Sobrenome: ");
				String sobrenome = sc.nextLine();
				System.out.print("Telefone: ");
				String telefone = sc.nextLine();
				System.out.println(novaAgenda.cadastrarContato(posicao, nome, sobrenome, telefone));
			}else if (opcao.equals("L")){
				System.out.println("\n" + novaAgenda.listarContatos());
			}else if (opcao.equals("E")){
				System.out.print("contato> ");
				int posicaoContato = sc.nextInt();
				System.out.println(novaAgenda.exibirContato(posicaoContato));
			}else if (!opcao.equals("S")){
				System.out.println("OPÇÃO INVÁLIDA!\n");
			}
		}while (!opcao.equals("S"));

		sc.close();	
			
	}

}
