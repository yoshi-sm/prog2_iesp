package visao;

import modelo.*;


public class Teste {
	
	public static void main(String[] args) {
		
		//Instanciando publicacao, livro e revista
		Publicacao a1 = new Publicacao("walk talk", "10-09-2009", "Saraiva");
		System.out.println(a1);
		
		Livro a2 = new Livro("Biografia 1", "5-02-2009", "Saraiva", "12415-234-543");
		System.out.println(a2);
		
		Revista a3 = new Revista("Epoca", "5-12-2019", "Abril", 'P');
		System.out.println(a3);
		
		// Verificando as classes
		
		System.out.println(a1.getNome() +" = "+ a1.getClass() 
							+", " + a2.getNome() +" = "+ a2.getClass()
							+", " + a3.getNome() +" = " + a3.getClass());
	}
}
