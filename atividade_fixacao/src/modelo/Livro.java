package modelo;

public class Livro extends Publicacao {
	
	//atributos
	private String isbn;
	
	//contrutores
	public Livro() {

	}

	public Livro(String n, String d, String e, String isbn) {
		super(n, d, e);
		this.isbn = isbn;
		// TODO Auto-generated constructor stub
	}

		
	//getters and setters
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	//toString()
	public String toString() {
		return "Livro [isbn=" + isbn + ", Nome=" + getNome() + ", Data=" + getData() + ", Editora="
				+ getEditora() + "]";
	}
	
	
}
