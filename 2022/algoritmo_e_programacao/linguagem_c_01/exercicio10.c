#include <stdio.h>
#include <locale.h>
//***Protótipos de Funções**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	float valor,impostos;
	cabecalho();
	printf("\nDigite o custo de fábrica do veículo:\nR$");
	scanf("%f%*c",&valor);
	if(valor<12000){
		impostos=valor*5/100;
		valor=valor+impostos;
		printf("\nO preço total do veículo:  R$%.2f",valor);
	}else if(valor>=12000 && valor>=25000){
		impostos=valor*25/100;
		valor=valor+impostos;
		printf("\nO preço total do veículo:  R$%.2f",valor);
	}else if(valor>25000){
		impostos=valor*35/100;
		valor=valor+impostos;
		printf("\nO preço total do veículo:  R$%.2f",valor);
	}
	return 0;
}
//***FUNÇÂO CABEÇALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("*******CUSTO DE FÁBRICA********\n");
	printf("*******************************\n");
}
