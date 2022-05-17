programa
{
	
	funcao inicio()
	{
		/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
		 * coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00.  
		*/
	
	inteiro habitantes[19], medSalario, soma = 0

		para(inteiro i = 0; i < 20; i++){
	
		escreva("\ninsira o salário do ", i + 1, "º habitantes: ")
		leia(habitantes[i])
		
		}
		
		medSalario = habitantes[0]

		para(inteiro i = 0; i < 3; i++){
			leia(soma)
			
			escreva("\n ", soma)
			}
		
		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 526; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */