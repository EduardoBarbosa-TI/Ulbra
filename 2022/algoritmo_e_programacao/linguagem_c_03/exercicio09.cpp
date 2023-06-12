#include <stdio.h>
#include <locale.h>
//***Protótipos de Funções**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	float saldo,credito;
	cabecalho();
	printf("\nDigite o seu saldo médio:\nR$");
	scanf("%f%*c",&saldo);
	if(saldo>400){
		credito=saldo*30/100;
		printf("\nDe acordo com o seu saldo médio de:\nR$%.2f",saldo);	
		printf("\nVocê conseguiu o crédito especial de:\nR$%.2f",credito);
		printf("\nAproveite!! Utilizando no entrevero sua conta fica pela metade do valor");
	}else if(saldo<400 && saldo>=300){
		credito=saldo*25/100;
		printf("\nDe acordo com o seu saldo médio de:\nR$%.2f",saldo);	
		printf("\nVocê conseguiu o crédito especial de:\nR$%.2f",credito);
		printf("\nAproveite!! Utilizando no entrevero sua conta fica pela metade do valor");
	}else if(saldo<300 && saldo>=200){
		credito=saldo*20/100;
		printf("\nDe acordo com o seu saldo médio de:\nR$%.2f",saldo);	
		printf("\nVocê conseguiu o crédito especial de:\nR$%.2f",credito);
		printf("\nAproveite!! Utilizando no entrevero sua conta fica pela metade do valor");	
	}else if(saldo<200){
		credito=saldo*10/100;
		printf("\nDe acordo com o seu saldo médio de:\nR$%.2f",saldo);	
		printf("\nVocê conseguiu o crédito especial de:\nR$%.2f",credito);
		printf("\nAproveite!! Utilizando no entrevero você fica devendo");	
	}
	return 0;
}
//***FUNÇÂO CABEÇALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("********CRÉDITO ESPECIAL*******\n");
	printf("*******************************\n");
}
