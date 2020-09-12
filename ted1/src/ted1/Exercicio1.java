package ted1;

/* 1. Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 
8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
 salário bruto.
quanto pagou ao IPRF
 quanto pagou ao INSS.
 quanto pagou ao sindicato.
o salário líquido.
 o valor descontado.
*/

import java.util.Scanner;


public class Exercicio1 {
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a quanto você ganha por hora: ");
		float pagHora = entrada.nextFloat();
		System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
		float horas = entrada.nextFloat();
		entrada.close();
		
		float sal_bruto = (pagHora * horas); 		
		float iprf = (sal_bruto/100) * 11;
		float inss = (sal_bruto/100) * 8;
		float sind = (sal_bruto/100) * 5;
		float sal_liquido = sal_bruto - iprf - sind - inss;
		float desconto = sal_bruto - sal_liquido;
		
		System.out.printf("O seu salario bruto é de: R$%4.2f\n", sal_bruto);
		System.out.printf("O desconto do IPRF é de: R$%4.2f\n", iprf);
		System.out.printf("O desconto do INSS é de: R$%4.2f\n", inss);
		System.out.printf("O desconto do sindicato é de: R$%4.2f\n", sind);
		System.out.printf("O seu salário líquido é de: R$%4.2f\n", sal_liquido);
		System.out.printf("o valor total descontado é de: R$%4.2f\n", desconto);
	}
}
