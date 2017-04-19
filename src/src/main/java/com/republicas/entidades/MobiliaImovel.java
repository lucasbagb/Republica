package src.main.java.com.republicas.entidades;

public class MobiliaImovel {

	// VARIÁVEIS
	private boolean tv;
	private boolean fogao;
	private boolean geladeira;
	private boolean microondas;
	private boolean maqRoupas;
	private boolean mapLoucas;
	private boolean telFixo;

	// CONSTRUTOR
	public MobiliaImovel(boolean tv, boolean fogao, boolean geladeira, boolean microondas, boolean maqRoupas,
			boolean mapLoucas, boolean telFixo) {
		this.tv = tv;
		this.fogao = fogao;
		this.geladeira = geladeira;
		this.microondas = microondas;
		this.maqRoupas = maqRoupas;
		this.mapLoucas = mapLoucas;
		this.telFixo = telFixo;
	}

	// GETTERS AND SETTERS
	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	public boolean isFogao() {
		return fogao;
	}

	public void setFogao(boolean fogao) {
		this.fogao = fogao;
	}

	public boolean isGeladeira() {
		return geladeira;
	}

	public void setGeladeira(boolean geladeira) {
		this.geladeira = geladeira;
	}

	public boolean isMicroondas() {
		return microondas;
	}

	public void setMicroondas(boolean microondas) {
		this.microondas = microondas;
	}

	public boolean isMaqRoupas() {
		return maqRoupas;
	}

	public void setMaqRoupas(boolean maqRoupas) {
		this.maqRoupas = maqRoupas;
	}

	public boolean isMapLoucas() {
		return mapLoucas;
	}

	public void setMapLoucas(boolean mapLoucas) {
		this.mapLoucas = mapLoucas;
	}

	public boolean isTelFixo() {
		return telFixo;
	}

	public void setTelFixo(boolean telFixo) {
		this.telFixo = telFixo;
	}

	// MÉTODOS

}
