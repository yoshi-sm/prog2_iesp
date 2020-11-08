package modelo;

public class Publicacao {
	
	// atributos
	private String nome;
	private String data;
	private String editora;
	
	// construtores
	
	public Publicacao() {}
	
	public Publicacao(String n, String d, String e) {
		this.nome = n;
		this.data = d;
		this.editora = e;
		
	}
	// getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	// toString()
	public String toString() {
		return "Publicacao [nome=" + nome + ", data=" + data + ", editora=" + editora + "]";
	}

	

	
	

	
}
