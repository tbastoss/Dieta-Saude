package ufrpe.negocio.beans;

public class FatorAtividade {
	private int id;
	private float valor;
	private String descricao;
	
	public FatorAtividade(int id) {
		setId(id);
		setDescricao();
		setValor();
	}
	
	public float getValor() {
		return valor;
	}

	public void setValor() {
		switch (this.id){
		case 1:
			this.valor = (float) 1.2;
			break;
		case 2:
			this.valor = (float) 1.3;
			break;
		case 3:
			this.valor = (float) 1.4;
			break;
		case 4:
			this.valor = (float) 1.5;
			break;
		case 5: 
			this.valor = (float) 1.6;
			break;
		case 6:
			this.valor = (float) 1.8;
			break;
		case 7:
			this.valor = (float) 1.2;
			break;
		case 8:
			this.valor = (float) 1.3;
			break;
		case 9:
			this.valor = (float) 1.35;
			break;
		case 10:
			this.valor = (float) 1.45;
			break;
		case 11:
			this.valor = (float) 1.5;
			break;
		case 12:
			this.valor = (float) 1.7;
			break;
		default:
			this.valor = -1;
			break;
		}
					
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0 && id <= 12)
			this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao() {
		switch (this.id){
		case 1:
			this.descricao = "Muito sedentário, não possui atividade física programada.";
			break;
		case 2:
			this.descricao = "Dia-a-dia agitado, porém sem atividade física ou atividade física, três vezes por semana por no mínimo 30 minutos, porém um dia-a-dia parado.";
			break;
		case 3:
			this.descricao = "Dia-a-dia agitado e com atividade física três vezes por semana, por pelo menos 30 minutos.";
			break;
		case 4:
			this.descricao = "Dia-a-dia agitado com atividade física programada 3 vezes por semana, com mais de uma hora de duração.";
			break;
		case 5: 
			this.descricao = "Possui um dia-a-dia movimentado e pratica atividade física programada diária, de uma hora a duas horas e meia.";
			break;
		case 6:
			this.descricao = "Possui um dia-a-dia movimentado e pratica atividade física programada diária, por mais de três horas.";
			break;
		case 7:
			this.descricao = "Muito sedentário, não possui atividade física programada.";
			break;
		case 8:
			this.descricao = "Dia-a-dia agitado, porém sem atividade física ou atividade física, três vezes por semana por no mínimo 30 minutos, porém um dia-a-dia parado.";
			break;
		case 9:
			this.descricao = "Dia-a-dia agitado e com atividade física três vezes por semana, por pelo menos 30 minutos.";
			break;
		case 10:
			this.descricao = "Dia-a-dia agitado com atividade física programada 3 vezes por semana, com mais de uma hora de duração.";
			break;
		case 11:
			this.descricao = "Possui um dia-a-dia movimentado e pratica atividade física programada diária, de uma hora a duas horas e meia.";
			break;
		case 12:
			this.descricao = "Possui um dia-a-dia movimentado e pratica atividade física programada diária, por mais de três horas.";
			break;
		default :
			break;
		}
		
	}	
}
