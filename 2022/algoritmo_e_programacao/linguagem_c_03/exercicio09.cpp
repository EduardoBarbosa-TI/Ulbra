#include <stdio.h>
#include <locale.h>
//***Prot�tipos de Fun��es**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	float saldo,credito;
	cabecalho();
	printf("\nDigite o seu saldo m�dio:\nR$");
	scanf("%f%*c",&saldo);
	if(saldo>400){
		credito=saldo*30/100;
		printf("\nDe acordo com o seu saldo m�dio de:\nR$%.2f",saldo);	
		printf("\nVoc� conseguiu o cr�dito especial de:\nR$%.2f",credito);
		printf("\nAproveite!! Utilizando no entrevero sua conta fica pela metade do valor");
	}else if(saldo<400 && saldo>=300){
		credito=saldo*25/100;
		printf("\nDe acordo com o seu saldo m�dio de:\nR$%.2f",saldo);	
		printf("\nVoc� conseguiu o cr�dito especial de:\nR$%.2f",credito);
		printf("\nAproveite!! Utilizando no entrevero sua conta fica pela metade do valor");
	}else if(saldo<300 && saldo>=200){
		credito=saldo*20/100;
		printf("\nDe acordo com o seu saldo m�dio de:\nR$%.2f",saldo);	
		printf("\nVoc� conseguiu o cr�dito especial de:\nR$%.2f",credito);
		printf("\nAproveite!! Utilizando no entrevero sua conta fica pela metade do valor");	
	}else if(saldo<200){
		credito=saldo*10/100;
		printf("\nDe acordo com o seu saldo m�dio de:\nR$%.2f",saldo);	
		printf("\nVoc� conseguiu o cr�dito especial de:\nR$%.2f",credito);
		printf("\nAproveite!! Utilizando no entrevero voc� fica devendo");	
	}
	return 0;
}
//***FUN��O CABE�ALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("********CR�DITO ESPECIAL*******\n");
	printf("*******************************\n");
}
