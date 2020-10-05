package model;

import java.util.ArrayList;
import java.lang.Math;
public class GrupoDeContas {
	
	//atributos
	private ArrayList<Conta> listaDeContas;

	//construtores
	public GrupoDeContas() {}
	
	public GrupoDeContas(ArrayList<Conta> contas) {
		this.listaDeContas = contas;
		
	}
	
	//metodos
	
	int tempNum;
	double tempSal;
	
	
	public void gerador(int quantidade) {//gera "quantidade" contas aleatorias para o array
		for (int i = 0; i < quantidade; i++) {
			tempNum = (int) (Math.random()* 100000000);
			tempSal = (double)((int)(Math.random()*1000000 * Math.random()))/100;
			this.listaDeContas.add(new Conta(tempNum, tempSal));
		}
		
	}
	
	
	
	
	public Conta maiorSaldo() {
		tempSal = 0;
		for (int i = 0; i < this.listaDeContas.size(); i++) {
			if (tempSal < listaDeContas.get(i).getSaldo()) {
				tempSal = listaDeContas.get(i).getSaldo();
				tempNum = i;
			}
			
		}
		return listaDeContas.get(tempNum);
	}

	
	
	
	//toString
	public String toString() {
		return "Classe GrupoDeContas \nLista de Contas :\n"+this.listaDeContas;
	}
	
	
	//get e set
	
	public ArrayList<Conta> getListaDeContas() {
		return listaDeContas;
	}

	public void setListaDeContas(ArrayList<Conta> listaDeContas) {
		this.listaDeContas = listaDeContas;
	}
	
	
	
}
