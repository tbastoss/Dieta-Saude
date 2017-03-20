package ufrpe.negocio.beans;

import java.util.ArrayList;
import java.util.Calendar;

//QUANDO UMA DIETA FOR CRIADA, ADICIONAR A DIETA NAS LISTA QUE TEM NAS EM REFEIÇÕES
public class Dieta {
	private int id;
	private boolean prolongada;
	private boolean finalizada;
	private Calendar dataInicio;
	private Calendar dataFim;
	private Objetivo objetivo;
	private Paciente pat;
	private TipoDieta tipo;
	private ArrayList <HistoricoPeso> historicoPeso;
	private ArrayList <AtividadeFisica> praticouAtividadeFisica;
	private ArrayList <ItemAlimentoConsumidoExtra> alimentoConsumidoExtra; //nao existente no banco de alimentos
	private ArrayList <ItemAlimentoConsumidoDieta> alimentoConsumidoDieta; //existe no banco de alimentos mas nao deveria ter comido naquele momento/dia/refeição
	private ArrayList <Refeicao> refeicoes;
	ArrayList <SuplementoAlimentarConsumido> suplementoAlimentarConsumido;
	
	public Dieta(int id, boolean prolongada, boolean finalizada,
			Calendar dataInicio, Calendar dataFim, Objetivo objetivo,
			Paciente pat, TipoDieta tipo,
			ArrayList<Refeicao> refeicoes) {
		
		this.id = id;
		this.prolongada = false;
		this.finalizada = false;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.objetivo = objetivo;
		this.pat = pat;
		this.tipo = tipo;
		this.historicoPeso = new ArrayList();
		this.praticouAtividadeFisica = new ArrayList();
		this.alimentoConsumidoExtra = new ArrayList();
		this.alimentoConsumidoDieta = new ArrayList();
		this.refeicoes = refeicoes;
		this.suplementoAlimentarConsumido = new ArrayList();
	}
	
	public void AdicionarAlimentoConsumidoExtra(int id, String descricao, Calendar dia, int pontos, int quantidade){
		ItemAlimentoConsumidoExtra ae = null;
		if(descricao != null && dia != null && pontos >= 0 && quantidade > 0){
			ae = new ItemAlimentoConsumidoExtra (id, descricao, dia, pontos, quantidade);
			this.alimentoConsumidoExtra.add(ae);
		}
		
	}
	
	public void AdicionarAlimentoConsumidoDieta(int id, Alimento alimentoExtra, int quantidade, Calendar dia){
		ItemAlimentoConsumidoDieta  ad = null;
		if (alimentoExtra != null && quantidade > 0 &&  dia != null){
			ad = new ItemAlimentoConsumidoDieta (id, alimentoExtra, quantidade, dia);
			this.alimentoConsumidoDieta.add(ad);
		}
	}
	
	public void AdicionarPraticouAtividadeFisica(int id, TipoAtividadeFisica tipo, float periodo){
		AtividadeFisica at = null;
		if (tipo != null && periodo > 0){
			at = new AtividadeFisica (id, tipo, periodo);
			this.praticouAtividadeFisica.add(at);
		}
	}
	
	public void AdicionarHistoricoPeso(int id, float peso, boolean infoPac){
		HistoricoPeso hp = null;
		if (peso > 0){
			hp = new HistoricoPeso(id, infoPac, peso);
			this.historicoPeso.add(hp);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isProlongada() {
		return prolongada;
	}

	public void setProlongada(boolean prolongada) {
		this.prolongada = prolongada;
	}

	public boolean isFinalizada() {
		return finalizada;
	}

	public void setFinalizada(boolean finalizada) {
		this.finalizada = finalizada;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataFim() {
		return dataFim;
	}

	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}

	public Objetivo getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}

	public Paciente getPat() {
		return pat;
	}

	public void setPat(Paciente pat) {
		this.pat = pat;
	}

	public TipoDieta getTipo() {
		return tipo;
	}

	public void setTipo(TipoDieta tipo) {
		this.tipo = tipo;
	}

	public ArrayList<HistoricoPeso> getHistoricoPeso() {
		return historicoPeso;
	}

	public void setHistoricoPeso(ArrayList<HistoricoPeso> historicoPeso) {
		this.historicoPeso = historicoPeso;
	}

	public ArrayList<AtividadeFisica> getPraticouAtividadeFisica() {
		return praticouAtividadeFisica;
	}

	public void setPraticouAtividadeFisica(
			ArrayList<AtividadeFisica> praticouAtividadeFisica) {
		this.praticouAtividadeFisica = praticouAtividadeFisica;
	}

	public ArrayList<ItemAlimentoConsumidoExtra> getAlimentoConsumidoExtra() {
		return alimentoConsumidoExtra;
	}

	public void setAlimentoConsumidoExtra(
			ArrayList<ItemAlimentoConsumidoExtra> alimentoConsumidoExtra) {
		this.alimentoConsumidoExtra = alimentoConsumidoExtra;
	}

	public ArrayList<ItemAlimentoConsumidoDieta> getAlimentoConsumidoDieta() {
		return alimentoConsumidoDieta;
	}

	public void setAlimentoConsumidoDieta(
			ArrayList<ItemAlimentoConsumidoDieta> alimentoConsumidoDieta) {
		this.alimentoConsumidoDieta = alimentoConsumidoDieta;
	}

	public ArrayList<Refeicao> getRefeicoes() {
		return refeicoes;
	}

	public void setRefeicoes(ArrayList<Refeicao> refeicoes) {
		this.refeicoes = refeicoes;
	}

	public ArrayList<SuplementoAlimentarConsumido> getSuplementoAlimentarConsumido() {
		return suplementoAlimentarConsumido;
	}

	public void setSuplementoAlimentarConsumido(
			ArrayList<SuplementoAlimentarConsumido> suplementoAlimentarConsumido) {
		this.suplementoAlimentarConsumido = suplementoAlimentarConsumido;
	}	
}
