package src.main.java.com.republicas.entidades;

public class ServicoImovel {

	// VARIÁVEIS
	private String tipoLimpeza;
	private String prestadoraInternet;
	private String bandaInternet;
	private String prestadoraTV;
	private int qntdCanaisTV;

	// CONSTRUTOR
	public ServicoImovel(String tipoLimpeza, String prestadoraInternet, String bandaInternet, String prestadoraTV,
			int qntdCanaisTV) {
		this.tipoLimpeza = tipoLimpeza;
		this.prestadoraInternet = prestadoraInternet;
		this.bandaInternet = bandaInternet;
		this.prestadoraTV = prestadoraTV;
		this.qntdCanaisTV = qntdCanaisTV;
	}

	// GETTERS AND SETTERS
	public String getTipoLimpeza() {
		return tipoLimpeza;
	}

	public void setTipoLimpeza(String tipoLimpeza) {
		this.tipoLimpeza = tipoLimpeza;
	}

	public String getPrestadoraInternet() {
		return prestadoraInternet;
	}

	public void setPrestadoraInternet(String prestadoraInternet) {
		this.prestadoraInternet = prestadoraInternet;
	}

	public String getBandaInternet() {
		return bandaInternet;
	}

	public void setBandaInternet(String bandaInternet) {
		this.bandaInternet = bandaInternet;
	}

	public String getPrestadoraTV() {
		return prestadoraTV;
	}

	public void setPrestadoraTV(String prestadoraTV) {
		this.prestadoraTV = prestadoraTV;
	}

	public int getQntdCanaisTV() {
		return qntdCanaisTV;
	}

	public void setQntdCanaisTV(int qntdCanaisTV) {
		this.qntdCanaisTV = qntdCanaisTV;
	}

	// MÉTODOS

}