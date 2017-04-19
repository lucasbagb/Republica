package src.main.java.com.republicas.entidades;

import java.util.ArrayList;
import java.util.Date;

public class Vaga {

	// VARIÁVEIS
	private Long id_vaga;
	private TipoQuarto tipoQuarto;
	private Date inicioPeriodo;
	private Date fimPeriodo;
	private double valor;
	private boolean incluiAgua;
	private boolean incluiLuz;
	private boolean incluiTV;
	private boolean incluiInternet;
	private boolean incluiLimpeza;
	private boolean cama;
	private boolean guarda_roupas;
	private boolean ventiladorTeto;
	private boolean ar_condicionado;
	private boolean aquecedor;
	private boolean frigobar;
	private boolean escrivaninha;
	private ArrayList<?> fotosVaga = new ArrayList<Imagem>();

	// CONSTRUTOR
	public Vaga(Long id_vaga, TipoQuarto tipoQuarto, Date inicioPeriodo, Date fimPeriodo, double valor,
			boolean incluiAgua, boolean incluiLuz, boolean incluiTV, boolean incluiInternet, boolean incluiLimpeza,
			boolean cama, boolean guarda_roupas, boolean ventiladorTeto, boolean ar_condicionado, boolean aquecedor,
			boolean frigobar, boolean escrivaninha, ArrayList<?> fotosVaga) {
		this.id_vaga = id_vaga;
		this.tipoQuarto = tipoQuarto;
		this.inicioPeriodo = inicioPeriodo;
		this.fimPeriodo = fimPeriodo;
		this.valor = valor;
		this.incluiAgua = incluiAgua;
		this.incluiLuz = incluiLuz;
		this.incluiTV = incluiTV;
		this.incluiInternet = incluiInternet;
		this.incluiLimpeza = incluiLimpeza;
		this.cama = cama;
		this.guarda_roupas = guarda_roupas;
		this.ventiladorTeto = ventiladorTeto;
		this.ar_condicionado = ar_condicionado;
		this.aquecedor = aquecedor;
		this.frigobar = frigobar;
		this.escrivaninha = escrivaninha;
		this.fotosVaga = fotosVaga;
	}

	// GETTERS AND SETTERS
	public Long getId_vaga() {
		return id_vaga;
	}

	public void setId_vaga(Long id_vaga) {
		this.id_vaga = id_vaga;
	}

	public TipoQuarto getTipoQuarto() {
		return tipoQuarto;
	}

	public void setTipoQuarto(TipoQuarto tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}

	public Date getInicioPeriodo() {
		return inicioPeriodo;
	}

	public void setInicioPeriodo(Date inicioPeriodo) {
		this.inicioPeriodo = inicioPeriodo;
	}

	public Date getFimPeriodo() {
		return fimPeriodo;
	}

	public void setFimPeriodo(Date fimPeriodo) {
		this.fimPeriodo = fimPeriodo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isIncluiAgua() {
		return incluiAgua;
	}

	public void setIncluiAgua(boolean incluiAgua) {
		this.incluiAgua = incluiAgua;
	}

	public boolean isIncluiLuz() {
		return incluiLuz;
	}

	public void setIncluiLuz(boolean incluiLuz) {
		this.incluiLuz = incluiLuz;
	}

	public boolean isIncluiTV() {
		return incluiTV;
	}

	public void setIncluiTV(boolean incluiTV) {
		this.incluiTV = incluiTV;
	}

	public boolean isIncluiInternet() {
		return incluiInternet;
	}

	public void setIncluiInternet(boolean incluiInternet) {
		this.incluiInternet = incluiInternet;
	}

	public boolean isIncluiLimpeza() {
		return incluiLimpeza;
	}

	public void setIncluiLimpeza(boolean incluiLimpeza) {
		this.incluiLimpeza = incluiLimpeza;
	}

	public boolean isCama() {
		return cama;
	}

	public void setCama(boolean cama) {
		this.cama = cama;
	}

	public boolean isGuarda_roupas() {
		return guarda_roupas;
	}

	public void setGuarda_roupas(boolean guarda_roupas) {
		this.guarda_roupas = guarda_roupas;
	}

	public boolean isVentiladorTeto() {
		return ventiladorTeto;
	}

	public void setVentiladorTeto(boolean ventiladorTeto) {
		this.ventiladorTeto = ventiladorTeto;
	}

	public boolean isAr_condicionado() {
		return ar_condicionado;
	}

	public void setAr_condicionado(boolean ar_condicionado) {
		this.ar_condicionado = ar_condicionado;
	}

	public boolean isAquecedor() {
		return aquecedor;
	}

	public void setAquecedor(boolean aquecedor) {
		this.aquecedor = aquecedor;
	}

	public boolean isFrigobar() {
		return frigobar;
	}

	public void setFrigobar(boolean frigobar) {
		this.frigobar = frigobar;
	}

	public boolean isEscrivaninha() {
		return escrivaninha;
	}

	public void setEscrivaninha(boolean escrivaninha) {
		this.escrivaninha = escrivaninha;
	}

	public ArrayList<?> getFotosVaga() {
		return fotosVaga;
	}

	public void setFotosVaga(ArrayList<?> fotosVaga) {
		this.fotosVaga = fotosVaga;
	}

	// MÉTODOS

}