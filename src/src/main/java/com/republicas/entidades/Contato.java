package src.main.java.com.republicas.entidades;

public class Contato {

	// VARIÁVEIS
	private Long telefone;
	private Long celular;
	private String email;

	// CONSTRUTOR
	public Contato(Long telefone, Long celular, String email) {
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
	}

	// GETTERS AND SETTERS
	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public Long getCelular() {
		return celular;
	}

	public void setCelular(Long celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// MÉTODOS

}
