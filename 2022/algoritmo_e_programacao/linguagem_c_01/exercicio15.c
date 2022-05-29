#include <stdio.h>
#include <locale.h>
//***Protótipos de Funções**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	int op;
	float valor,rendimento;
	cabecalho();
	do{
	    printf("\n1. Poupança");
	    printf("\n2. Fundo de renda fixa");
     	printf("\n0. Sair\n");
    	printf("\nDigite a opção:\n");
    	scanf("%i%*c",&op);
		switch(op){
			case 1:
				printf("\nDigite o valor de investimento:\nR$");
				scanf("%f%*c",&valor);
				rendimento=valor*3/100;
				valor=valor+rendimento;
				printf("\nSeu investimento renderá: R$%.2f\n\n",valor);
				break;
			case 2:
				printf("\nDigite o valor de investimento:\nR$");
				scanf("%f%*c",&valor);
				rendimento=valor*4/100;
				valor=valor+rendimento;
				printf("\nSeu investimento renderá: R$%.2f\n\n",valor);	
				break;
			default:
				printf("\nComando inválido!!\nDigite novamente!!");	   		
		} 	
	}while(op!=0);
	return 0;
}
//***FUNÇÂO CABEÇALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("****PROCESSO DE INVESTIMENTO***\n");
	printf("*******************************\n");
}
