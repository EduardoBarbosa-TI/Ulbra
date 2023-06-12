#include <stdio.h>
#include <locale.h>
//***Protótipos de Funções**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	float salario,aumento;
	cabecalho();
	printf("\nDigite o seu salário:\nR$");
	scanf("%f%*c",&salario);
	if(salario<500){
		aumento=salario*30/100;
		salario=salario+aumento;
		printf("\nVocê teve um reajuste no seu salário:\nR$%.2f",salario);
	}else if(salario>=500){
		printf("\nO aumento de salário não foi disponibilizado");	
	}
	return 0;	
}
//***FUNÇÂO CABEÇALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("******PROCESSO DE AUMENTO******\n");
	printf("*******************************\n");
}

