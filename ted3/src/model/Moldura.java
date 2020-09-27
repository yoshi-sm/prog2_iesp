package model;

public class Moldura {

	//atributos
	private Retangulo retanguloExt;
	private Retangulo retanguloInt;
	
	//construtor
	public Moldura() {}
	
	public Moldura(Retangulo rext, Retangulo rint) {
		this.retanguloExt = rext;
		this.retanguloInt = rint;
	
	}
	public float AreaMoldura() {
		return(this.retanguloExt.CalcularArea() - this.retanguloInt.CalcularArea());
	
	}
}
