package view;

import model.Area;
import java.util.Scanner;

public class Retangulo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o valor da base do ret�ngulo: ");
		float base = input.nextFloat();
		
		System.out.print("Digite o valor da altura do ret�ngulo: ");
		float altura = input.nextFloat();
		
		input.close();
		
		Area a1 = new Area(base, altura);
		System.out.print(a1.Mensagem());
	}

}
