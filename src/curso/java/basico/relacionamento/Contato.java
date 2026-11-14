package curso.java.basico.relacionamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Contato {

	private String nome;
	private String email;

	private List<Telefone> telefone = new ArrayList<>();

	public Contato() {
	}

	public Contato(String nome, String email) {

		if (nome == null || nome.isBlank()) {

			throw new IllegalArgumentException("Nome não podem ser em branco");
		}

		if (email == null || email.isBlank()) {
			throw new IllegalArgumentException("Email obrigatório");
		}

		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Telefone getTelefone() {
		return (Telefone) telefone;
	}

	public void setTelefone(List<Telefone> telefones) {
		this.telefone = telefones;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void adicionaTelefone(Telefone tel) {

		if (this.telefone.size() >= 2) {
			throw new IllegalArgumentException("são permitidos apenas dois números");
		}
		this.telefone.add(tel);
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, nome, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome)
				&& Objects.equals(telefone, other.telefone);
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		for (Telefone tel : telefone) {
			sb.append(tel).append(" ");
		}

		return "Nome " + nome + "\nTelefone: " + sb + "\nEmail: " + email;
	}

}
