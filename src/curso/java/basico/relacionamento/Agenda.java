package curso.java.basico.relacionamento;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private String nome;
	private List<Contato> contatos;

	public Agenda(String nome) {
		this.nome = nome;
		this.contatos = new ArrayList<>();

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Contato> getContato() {
		return contatos;
	}

	public void adicionaContato(Contato contatos) {
		this.contatos.add(contatos);
	}

	public void ListarContatos() {

		System.out.println(contatos.get(0));

	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Agenda: ").append(nome).append("\n");

		for (Contato contato : contatos) {
			sb.append(contato).append("\n");
		}
		return sb.toString();
	}

}
