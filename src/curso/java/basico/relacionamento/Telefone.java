package curso.java.basico.relacionamento;

public class Telefone {

	private String telefone;

	public Telefone(String telefone) {

		if (telefone == null || telefone.isBlank()) {
			throw new IllegalArgumentException("Telefone invalido!");
		}
		this.telefone = telefone;
	}

	public Telefone() {
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {

		return telefone;
	}

}
