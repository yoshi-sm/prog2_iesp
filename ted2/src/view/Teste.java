package view;

import model.Retangulo;
import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o valor da base do retângulo: ");
		float base = input.nextFloat();
		
		System.out.print("Digite o valor da altura do retângulo: ");
		float altura = input.nextFloat();
		
		input.close();
		
		Retangulo a1 = new Retangulo(base, altura);
		System.out.print(a1.Mensagem());
	}

}
