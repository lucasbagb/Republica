package src.main.java.com.republicas.entidades;

public class Imagem {

	// VARIÁVEIS
	private String nome;
	private String path;
	private Long id_imovel;
	private Vaga vaga;

	// CONSTRUTOR
	public Imagem(String nome, String path, Long id_imovel, Vaga vaga) {
		this.nome = nome;
		this.path = path;
		this.id_imovel = id_imovel;
		this.vaga = vaga;
	}

	// GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Long getId_imovel() {
		return id_imovel;
	}

	public void setId_imovel(Long id_imovel) {
		this.id_imovel = id_imovel;
	}

	public Vaga getVaga() {
		return vaga;
	}

	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}

	// MÉTODOS

}
