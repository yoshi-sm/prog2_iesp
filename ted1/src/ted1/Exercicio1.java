package ted1;

/* 1. Fa�a um programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o Imposto de Renda, 
8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�:
 sal�rio bruto.
quanto pagou ao IPRF
 quanto pagou ao INSS.
 quanto pagou ao sindicato.
o sal�rio l�quido.
 o valor descontado.
*/

import java.util.Scanner;


public class Exercicio1 {
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a quanto voc� ganha por hora: ");
		float pagHora = entrada.nextFloat();
		System.out.print("Digite a quantidade de horas trabalhadas no m�s: ");
		float horas = entrada.nextFloat();
		entrada.close();
		
		float sal_bruto = (pagHora * horas); 		
		float iprf = (sal_bruto/100) * 11;
		float inss = (sal_bruto/100) * 8;
		float sind = (sal_bruto/100) * 5;
		float sal_liquido = sal_bruto - iprf - sind - inss;
		float desconto = sal_bruto - sal_liquido;
		
		System.out.printf("O seu salario bruto � de: R$%4.2f\n", sal_bruto);
		System.out.printf("O desconto do IPRF � de: R$%4.2f\n", iprf);
		System.out.printf("O desconto do INSS � de: R$%4.2f\n", inss);
		System.out.printf("O desconto do sindicato � de: R$%4.2f\n", sind);
		System.out.printf("O seu sal�rio l�quido � de: R$%4.2f\n", sal_liquido);
		System.out.printf("o valor total descontado � de: R$%4.2f\n", desconto);
	}
}
