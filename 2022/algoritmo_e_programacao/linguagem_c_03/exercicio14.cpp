#include <stdio.h>
#include <locale.h>
//***Prot�tipos de Fun��es**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	float salario,aumento;
	cabecalho();
	printf("\nDigite o seu sal�rio atual:\nR$");
	scanf("%f%*c",&salario);
	if(salario<300){
		aumento=salario*50/100;
		salario=salario+aumento;
		printf("\nVoc� teve um reajuste no seu sal�rio:");
		printf("\nSeu sal�rio atual:.............R$%.2f",salario);	
	}else if(salario>=300 && salario<500){
		aumento=salario*40/100;
		salario=salario+aumento;
		printf("\nVoc� teve um reajuste no seu sal�rio:");
		printf("\nSeu sal�rio atual:.............R$%.2f",salario);
	}else if(salario>=500 && salario<700){
		aumento=salario*30/100;
		salario=salario+aumento;
		printf("\nVoc� teve um reajuste no seu sal�rio:");
		printf("\nSeu sal�rio atual:.............R$%.2f",salario);
	}else if(salario>=700 && salario<800){
		aumento=salario*20/100;
		salario=salario+aumento;
		printf("\nVoc� teve um reajuste no seu sal�rio:");
		printf("\nSeu sal�rio atual:.............R$%.2f",salario);
	}else if(salario>=800 && salario<1000){
		aumento=salario*10/100;
		salario=salario+aumento;
		printf("\nVoc� teve um reajuste no seu sal�rio:");
		printf("\nSeu sal�rio atual:.............R$%.2f",salario);
	}else if(salario>1000){
		aumento=salario*5/100;
		salario=salario+aumento;
		printf("\nVoc� teve um reajuste no seu sal�rio:");
		printf("\nSeu sal�rio atual:.............R$%.2f",salario);
	}
	return 0;
}
//***FUN��O CABE�ALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("******PROCESSO DE AUMENTO******\n");
	printf("*******************************\n");
}
