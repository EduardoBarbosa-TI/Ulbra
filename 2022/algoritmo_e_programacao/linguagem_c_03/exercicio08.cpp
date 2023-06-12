#include <stdio.h>
#include <locale.h>
//***Protótipos de Funções**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	float salario,aumento;
	cabecalho();
	printf("Digite o seu salário:\n");
	scanf("%f%*c",&salario);
	if(salario<=300){
		aumento=salario*35/100;
		salario=salario+aumento;
		printf("\nVocê teve um reajuste no seu salário:\nR$%.2f",salario);
	}else if(salario>300){
		aumento=salario*15/100;
		salario=salario+aumento;
		printf("\nVocê teve um reajuste no seu salário:\nR$%.2f",salario);	
	}
	return 0;
}
//***FUNÇÂO CABEÇALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("******PROCESSO DE AUMENTO******\n");
	printf("*******************************\n");
}

