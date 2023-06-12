#include <stdio.h>
#include <locale.h>
//***Protótipos de Funções**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	float salario,aumento;
	cabecalho();
	printf("\nDigite o seu salário atual:\nR$");
	scanf("%f%*c",&salario);
	if(salario<300){
		aumento=salario*15/100;
		salario=salario+aumento;
		printf("\nVocê teve um reajuste de salário:\nSalário atual:..............................R$%.2f",salario);
		printf("\nAumento:....................................R$%.2f",aumento);
	}else if(salario>=300 && salario<600){
		aumento=salario*10/100;
		salario=salario+aumento;
		printf("\nVocê teve um reajuste de salário:\nSalário atual:..............................R$%.2f",salario);
		printf("\nAumento:....................................R$%.2f",aumento);
	}else if(salario>=600 && salario<900){
		aumento=salario*5/100;
		salario=salario+aumento;
		printf("\nVocê teve um reajuste de salário:\nSalário atual:..............................R$%.2f",salario);
		printf("\nAumento:....................................R$%.2f",aumento);
	}else if(salario>900){
		printf("\nVocê não teve reajuste de salário:\nSalário atual:..............................R$%.2f",salario);
		printf("\nAumento:....................................R$%.2f",aumento);	
	}
	return 0;
}
//***FUNÇÂO CABEÇALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("******PROCESSO DE AUMENTO******\n");
	printf("*******************************\n");
}

