package exercicios_prof_ohata;
import java.util.Scanner;

public class censo_demografico {

	public static void main(String[] args) {
		//Titulo exercicio
		System.out.println("Exerc�cio - Censo Demogr�fico");

		//Declaracao de Scanner para entrada de dados
		Scanner input = new Scanner(System.in);
		
		//Declaracao de variaveis
		float result, usuario_fem = 0, usuario_masc = 0, usuario_outros = 0, idade_fem = 0, idade_masc = 0, idade_outros = 0, idade_selecionada= 0, altura_fem = 0, altura_masc = 0, altura_outros = 0;
		float media_idade_grupo, media_altura_fem, media_idade_masc, percentual_idade;
		int cod_genero;
		
		//Looping para receber dados ate ser atingido o n�mero de vezes desejado 
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o c�digo de acordo com o g�nero que voc� se indetifica: \n0 - Feminino \n1 - Masculino \n2 - Outros");
			cod_genero = input.nextInt();
			
			//Switch para o usuario escolher o seu genero e a partir disso armazenar os dados de forma dinamica
			switch (cod_genero) {
			case 0:
				usuario_fem++;
				System.out.println("Qual sua altura ?");
				result = input.nextFloat();
				altura_fem  = altura_fem + result;
				System.out.println("Qual sua idade ?");
				result = input.nextFloat();
				idade_fem = idade_fem + result;
				if (result <= 35 && result >= 18) 
					idade_selecionada++;
				break;
			case 1:
				usuario_masc++;
				System.out.println("Qual sua altura ?");
				result = input.nextFloat();
				altura_masc  = altura_masc + result;
				System.out.println("Qual sua idade ?");
				result = input.nextFloat();
				idade_masc = idade_masc + result;
				if (result <= 35 && result >= 18) 
					idade_selecionada++;
				break;
			case 2:
				usuario_outros++;
				System.out.println("Qual sua altura ?");
				result = input.nextFloat();
				altura_outros  = altura_outros + result;
				System.out.println("Qual sua idade ?");
				result = input.nextFloat();
				idade_outros = idade_outros + result;
				if (result <= 35 && result >= 18) 
					idade_selecionada++;
				break;
			default: 
				System.out.print("Por favor, digite apenas os c�digos exibidos.");
			}	
			
		}
		//Contas para atribuir valores as estatisticas
		media_idade_grupo = (idade_fem + idade_masc + idade_outros)/ (usuario_fem + usuario_masc + usuario_outros);

		media_altura_fem = altura_fem/ usuario_fem;
		
		media_idade_masc = idade_masc/usuario_masc;
		
		percentual_idade = idade_selecionada/(usuario_fem + usuario_masc + usuario_outros);
		
		//Exibir estatisticas de acordo com os dados	
		System.out.println("A m�dia da idade do grupo � "  + media_idade_grupo);
		System.out.println("\nA m�dia da altura das mulheres � "  + media_altura_fem);
		System.out.println("\nA m�dia da idade dos homens "  + media_idade_masc);
		System.out.println("\nO percentual de pessoas com idade entre 18 e 35 anos �"  + (percentual_idade*100) + "%");
	}

}
