package view;

import model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		int quantidade;	
		GrupoDeContas contas = new GrupoDeContas(new ArrayList<Conta>());
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a quantidade de contas a serem geradas: ");
		quantidade = entrada.nextInt();
		entrada.close();
		
		//gerando arraylist de tamanho "quantidade"
		contas.gerador(quantidade);
		System.out.println(contas);
		
		//calculando a conta com o maior saldo
		System.out.print("A conta com o maior saldo é: "+contas.maiorSaldo());
	}
}
