#include <stdio.h>
#include <locale.h>
//***Prot�tipos de Fun��es**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	float valor,impostos;
	cabecalho();
	printf("\nDigite o custo de f�brica do ve�culo:\nR$");
	scanf("%f%*c",&valor);
	if(valor<12000){
		impostos=valor*5/100;
		valor=valor+impostos;
		printf("\nO pre�o total do ve�culo:  R$%.2f",valor);
	}else if(valor>=12000 && valor>=25000){
		impostos=valor*25/100;
		valor=valor+impostos;
		printf("\nO pre�o total do ve�culo:  R$%.2f",valor);
	}else if(valor>25000){
		impostos=valor*35/100;
		valor=valor+impostos;
		printf("\nO pre�o total do ve�culo:  R$%.2f",valor);
	}
	return 0;
}
//***FUN��O CABE�ALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("*******CUSTO DE F�BRICA********\n");
	printf("*******************************\n");
}
