package view;

import model.*;
import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) {
		
		float baseExt = Float.parseFloat(JOptionPane.showInputDialog("Insira o tamanho da base externa: "));
		float alturaExt = Float.parseFloat(JOptionPane.showInputDialog("Insira o tamanho da altura externa: "));
		float baseInt = Float.parseFloat(JOptionPane.showInputDialog("Insira o tamanho da base interna: "));
		float alturaInt = Float.parseFloat(JOptionPane.showInputDialog("Insira o tamanho da altura interna: "));
		
		Retangulo externo = new Retangulo(baseExt, alturaExt);
		Retangulo interno = new Retangulo(baseInt, alturaInt);
		Moldura mold = new Moldura(externo, interno);
		
		/*medidas do problema: baseExt = 30, alturaExt = 10
		                       baseInt = 26, alturaInt = 6
        */
		  
		 
		
		JOptionPane.showMessageDialog(null, "Area do retangulo externo: "+ externo.CalcularArea()+"\n"
				+ "Area do retangulo interno: "+ interno.CalcularArea()+"\n\n"
				+ "Area da moldura retangular: "+ mold.AreaMoldura());
	}

}
