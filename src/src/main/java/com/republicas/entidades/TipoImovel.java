package src.main.java.com.republicas.entidades;

public class TipoImovel {

	// VARIÁVEIS
	private String nome;
	private String descricao;

	// CONSTRUTOR
	public TipoImovel(String nome, String descricao) {
		super();
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
