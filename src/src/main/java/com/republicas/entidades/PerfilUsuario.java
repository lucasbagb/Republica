package src.main.java.com.republicas.entidades;

public class PerfilUsuario {

	// VARIÁVEIS
	private String nome;
	private String descricao;

	// CONSTRUTOR
	public PerfilUsuario(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	// GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// MÉTODOS

}
