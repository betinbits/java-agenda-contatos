package curso.java.basico.relacionamento;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nome da Agenda: ");
		String temaAgenda = sc.nextLine();

		Agenda agenda = new Agenda(temaAgenda);

		for (int i = 0; i < 2; i++) {

			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			try {

				Contato contato = new Contato(nome, email);
				agenda.adicionaContato(contato);

				for (int j = 0; j < 2; j++) {

					System.out.print("Telefone: ");
					String numero = sc.nextLine();
					Telefone tel = new Telefone(numero);
					contato.adicionaTelefone(tel);
				}

			} catch (IllegalArgumentException e) {
				System.out.println(e.getLocalizedMessage());
			}

		}

		agenda.ListarContatos();
		System.out.println();
		System.out.println(agenda);

		sc.close();

	}

}
