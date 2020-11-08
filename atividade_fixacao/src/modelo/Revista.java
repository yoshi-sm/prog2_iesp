package modelo;

public class Revista extends Publicacao{
	
	//atributos
	private char periodicidade;
	
	//contrutores
	public Revista() {

	}

	public Revista(String n, String d, String e, char p) {
		super(n, d, e);
		this.periodicidade = p;
		
	}
		
	//getters and setters
	public char getPeriodicidade() {
		return periodicidade;
	}

	public void setIsbn(char p) {
		this.periodicidade = p;
	}
	
	//toString()
	public String toString() {
		return "Revista [periodicidade=" + periodicidade + ", Nome=" + getNome() + ", Data=" + getData() + ", Editora="
				+ getEditora() + "]";
	}
}
