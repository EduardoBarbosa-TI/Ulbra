#include <stdio.h>
#include <locale.h>
//***Prot�tipos de Fun��es**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	float salario,aumento;
	cabecalho();
	printf("\nDigite o seu sal�rio:\nR$");
	scanf("%f%*c",&salario);
	if(salario<500){
		aumento=salario*30/100;
		salario=salario+aumento;
		printf("\nVoc� teve um reajuste no seu sal�rio:\nR$%.2f",salario);
	}else if(salario>=500){
		printf("\nO aumento de sal�rio n�o foi disponibilizado");	
	}
	return 0;	
}
//***FUN��O CABE�ALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("******PROCESSO DE AUMENTO******\n");
	printf("*******************************\n");
}

