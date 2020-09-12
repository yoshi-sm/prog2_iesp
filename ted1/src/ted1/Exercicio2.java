package ted1;
/* 2. Faça um programa em Java, que resolva a equação de 2o grau. O usuário ainda não deve digitar
 *  os valores, eles devem vir declarados no programa.
 */
public class Exercicio2 {

	//função a ser resolvida:  f(x) = x^2 - 3x + 2
	//A resolução será feita através da formula de bhaskara.
	public static void main(String[] args) {
		
		int var_a = 1;
		int var_b = -3;
		int var_c = 2;
		
		double delta = Math.pow(var_b, 2) - 4 * var_a * var_c;
		double raiz1 = (-var_b + Math.sqrt(delta))/2*var_a;
		double raiz2 = (-var_b - Math.sqrt(delta))/2*var_a;
		
		System.out.print("As raízes da função f(x) = x^2 - 3x + 2, são r1 = "+ raiz1 + ", r2 = "+ raiz2);
	}
}
