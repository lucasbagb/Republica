package src.main.java.com.republicas.entidades;

public class Usuario {

	// VARIÁVEIS
	private String nome;
	private String foto;
	private String user;
	private String senha;
	private PerfilUsuario perfilUsuario;
	private Contato contato;

	// CONSTRUTOR
	public Usuario(String nome, String foto, String user, String senha, PerfilUsuario perfilUsuario) {
		this.nome = nome;
		this.foto = foto;
		this.user = user;
		this.senha = senha;
		this.perfilUsuario = perfilUsuario;
	}

	// GETTERS AND SETTERS
	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public PerfilUsuario getPerfilUsuario() {
		return perfilUsuario;
	}

	public void setPerfilUsuario(PerfilUsuario perfilUsuario) {
		this.perfilUsuario = perfilUsuario;
	}

	// MÉTODOS

}
