#include <stdio.h>
#include <locale.h>
//***Prot�tipos de Fun��es**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	int idade;
	cabecalho();
	printf("\nDIgite a sua idade:\n");
	scanf("%i%*c",&idade);
	if(idade>=18){
		printf("\nVoc� � maior de idade!!\n\n");
	}else if(idade<18){
		printf("\nVoc� � menor de idade!!\n\n");
	}
	return 0;
}
//***FUN��O CABE�ALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("*****PROCESSO DE MAIORIDADE****\n");
	printf("*******************************\n");
}
