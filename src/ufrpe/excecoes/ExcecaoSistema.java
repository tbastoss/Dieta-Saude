package ufrpe.excecoes;

public class ExcecaoSistema extends Exception{
	private int codigo;
	
	public ExcecaoSistema(String mensagem, int codigo){
		super(mensagem);
		this.setCodigo(codigo);
		
	}
	
	public void setCodigo(int n){
		this.codigo = n;
	}
	
	public int getCodigo(){
		return this.codigo;
	}
	
}
