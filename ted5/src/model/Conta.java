package model;


public class Conta {

	//atributos
	private int numero;
	private double saldo;

	//contrutores
	public Conta() {}
	
	public Conta(int n, double s) {
		this.numero = n;
		this.saldo = s;
	}
	
	//toString
	public String toString() {
		return "numero da conta = "+ this.numero + ", saldo = "+ this.saldo+"\n";
	}
	
	
	
	
	//get & set
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int n) {
		this.numero = n;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double s) {
		this.saldo = s;
	}
}
