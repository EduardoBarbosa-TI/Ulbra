#include <stdio.h>
#include <locale.h>
//***Prot�tipos de Fun��es**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	int op;
	float valor,rendimento;
	cabecalho();
	do{
	    printf("\n1. Poupan�a");
	    printf("\n2. Fundo de renda fixa");
     	printf("\n0. Sair\n");
    	printf("\nDigite a op��o:\n");
    	scanf("%i%*c",&op);
		switch(op){
			case 1:
				printf("\nDigite o valor de investimento:\nR$");
				scanf("%f%*c",&valor);
				rendimento=valor*3/100;
				valor=valor+rendimento;
				printf("\nSeu investimento render�: R$%.2f\n\n",valor);
				break;
			case 2:
				printf("\nDigite o valor de investimento:\nR$");
				scanf("%f%*c",&valor);
				rendimento=valor*4/100;
				valor=valor+rendimento;
				printf("\nSeu investimento render�: R$%.2f\n\n",valor);	
				break;
			default:
				printf("\nComando inv�lido!!\nDigite novamente!!");	   		
		} 	
	}while(op!=0);
	return 0;
}
//***FUN��O CABE�ALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("****PROCESSO DE INVESTIMENTO***\n");
	printf("*******************************\n");
}
