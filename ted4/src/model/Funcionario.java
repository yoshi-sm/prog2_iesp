package model;

public class Funcionario {
	
	//atributos
	private int identificador;
	private int idSetor;
	private int salario;
	private int rg;
	private boolean ativo;
	
	//construtor
	public Funcionario() {}
	
	public Funcionario(int identificador, int idSetor,
			int salario, int rg, boolean ativo) {
		this.identificador = identificador;
		this.idSetor = idSetor;
		this.salario = salario;
		this.rg = rg;
		this.ativo = ativo;
	}
	
	//metodos
	public void bonifica(int aumento) {
		this.salario += aumento;
		
	}
	
	public void demite() {
		this.ativo = false;
	}


	//get & set (set apenas para o idSetor)
	public int getIdentificador() {
		return this.identificador;
	}
	
	public int getIdSetor() {
		return this.idSetor;
	}
	
	public void setIdSetor(int novoId) {
		this.idSetor = novoId;
	}
	
	public int getSalario() {
		return this.salario;
	}
	
	public int getRg() {
		return this.rg;
	}
	
	public String getAtivo() {
		if (this.ativo == true) {
			return "Empregado";
		}
		else {
			return "Não Empregado";
		}
	}
}

