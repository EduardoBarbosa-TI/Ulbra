#include <stdio.h>
#include <locale.h>
//***Prot�tipos de Fun��es**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	float produto,aumento;
	cabecalho();
	printf("\nDigite o pre�o do produto:\nR$");
	scanf("%f%*c",&produto);
	if(produto<50){
		aumento=produto*5/100;
		produto=produto+aumento;
		if(produto<80){
			printf("\nNovo pre�o do produto:...................R$%.2f",produto);
			printf("\nClassifica��o do produto:................Barato");	
		}
	}else if(produto>=50 && produto<=100){
		aumento=produto*10/100;
		produto=produto+aumento;
		if(produto>=80 && produto<=120){
			printf("\nNovo pre�o do produto:...................R$%.2f",produto);
			printf("\nClassifica��o do produto:................Normal");	
		}
	}else if(produto>100){
		aumento=produto*15/100;
		produto=produto+aumento;
		if(produto>120 && produto<=200){
			printf("\nNovo pre�o do produto:...................R$%.2f",produto);
			printf("\nClassifica��o do produto:................Caro");	
		}else if(produto>200){
			printf("\nNovo pre�o do produto:...................R$%.2f",produto);
			printf("\nClassifica��o do produto:................Muito caro");	
		}		
	}
	return 0;
}
//***FUN��O CABE�ALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("******PROCESSO DE AUMENTO******\n");
	printf("*******************************\n");
}
