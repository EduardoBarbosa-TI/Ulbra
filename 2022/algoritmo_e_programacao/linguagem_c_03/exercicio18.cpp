#include <stdio.h>
#include <locale.h>
//***Protótipos de Funções**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	int idade;
	cabecalho();
	printf("\nDIgite a sua idade:\n");
	scanf("%i%*c",&idade);
	if(idade>=18){
		printf("\nVocê é maior de idade!!\n\n");
	}else if(idade<18){
		printf("\nVocê é menor de idade!!\n\n");
	}
	return 0;
}
//***FUNÇÂO CABEÇALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("*****PROCESSO DE MAIORIDADE****\n");
	printf("*******************************\n");
}
