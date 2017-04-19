package src.main.java.com.republicas.entidades;

public class TipoCurso {

	// VARIÁVEIS
	private String nome;
	private String descricao;

	// CONSTRUTOR
	public TipoCurso(String nome, String descricao) {
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
