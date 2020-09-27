package view;

import model.Funcionario;
import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) {
		
		Funcionario listaFuncionario[] = new Funcionario[5];
		
		int tempIdent; 
		int tempIdSetor;
		int tempSalario;
		int tempRg;
		String opcoes[] = {"Empregado", "Não Empregado"};
		int tempOpc;
		boolean tempAtivo;
		for (int i = 0; i < listaFuncionario.length; i++) {
			tempIdent = Integer.parseInt(JOptionPane.showInputDialog("Digite o identificador do funcionario "+ (i+1)+ ":"));
			tempIdSetor = Integer.parseInt(JOptionPane.showInputDialog("Agora digite o identificador do setor do funcionario "+ (i+1)+ ":"));
			tempSalario = Integer.parseInt(JOptionPane.showInputDialog("Agora digite o salario do funcionario "+ (i+1)+ ":"));
			tempRg = Integer.parseInt(JOptionPane.showInputDialog("Agora digite o RG do funcionario "+ (i+1)+ ":"));
			tempOpc = JOptionPane.showOptionDialog(null, "O funcionario "+ (i+1) +" está empregado?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
			if (tempOpc == 0) {
				tempAtivo = true;
			}
			else {
				tempAtivo = false;
			}
			listaFuncionario[i] = new Funcionario (tempIdent, tempIdSetor, tempSalario, tempRg, tempAtivo);
			
			//System.out.println(listaFuncionario[i].getAtivo());
		}
		JOptionPane.showMessageDialog(null, "Os dados dos 5 funcionários foram armazenados com sucesso!");
		
		
		/* Testando os métodos
		 	
		for (int i=0; i < listaFuncionario.length; i++) {
			
			System.out.print(listaFuncionario[i].getIdentificador()+ ", ");
			System.out.print(listaFuncionario[i].getIdSetor()+ ", ");
			System.out.print(listaFuncionario[i].getSalario()+ ", ");
			System.out.print(listaFuncionario[i].getRg()+ ", ");
			System.out.println(listaFuncionario[i].getAtivo()+ ".");
		}
		
		System.out.println("\n\n");
		listaFuncionario[3].demite();
		listaFuncionario[2].bonifica(500);

		for (int i=0; i < listaFuncionario.length; i++) {
			
			System.out.print(listaFuncionario[i].getIdentificador()+ ", ");
			System.out.print(listaFuncionario[i].getIdSetor()+ ", ");
			System.out.print(listaFuncionario[i].getSalario()+ ", ");
			System.out.print(listaFuncionario[i].getRg()+ ", ");
			System.out.println(listaFuncionario[i].getAtivo()+ ".");
		}
		*/
	}
}
