package ted1;
/* 2. Fa�a um programa em Java, que resolva a equa��o de 2o grau. O usu�rio ainda n�o deve digitar
 *  os valores, eles devem vir declarados no programa.
 */
public class Exercicio2 {

	//fun��o a ser resolvida:  f(x) = x^2 - 3x + 2
	//A resolu��o ser� feita atrav�s da formula de bhaskara.
	public static void main(String[] args) {
		
		int var_a = 1;
		int var_b = -3;
		int var_c = 2;
		
		double delta = Math.pow(var_b, 2) - 4 * var_a * var_c;
		double raiz1 = (-var_b + Math.sqrt(delta))/2*var_a;
		double raiz2 = (-var_b - Math.sqrt(delta))/2*var_a;
		
		System.out.print("As ra�zes da fun��o f(x) = x^2 - 3x + 2, s�o r1 = "+ raiz1 + ", r2 = "+ raiz2);
	}
}
