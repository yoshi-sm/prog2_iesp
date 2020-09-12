package model;

public class Area {
	
	private float base;
	private float altura;
	
	public Area(float b, float a) {
		this.base = b;
		this.altura = a;
	}
	
	public String Mensagem() {
		return ("O retângulo de base "+ this.base +"u.c. e altura "+ this.altura +"u.c. possui"
				+ " uma área de "+ this.base*this.altura+"u.a..");
	}

}
