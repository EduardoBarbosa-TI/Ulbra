#include <stdio.h>
#include <locale.h>
//***Prot�tipos de Fun��es**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	float salario,aumento;
	cabecalho();
	printf("Digite o seu sal�rio:\n");
	scanf("%f%*c",&salario);
	if(salario<=300){
		aumento=salario*35/100;
		salario=salario+aumento;
		printf("\nVoc� teve um reajuste no seu sal�rio:\nR$%.2f",salario);
	}else if(salario>300){
		aumento=salario*15/100;
		salario=salario+aumento;
		printf("\nVoc� teve um reajuste no seu sal�rio:\nR$%.2f",salario);	
	}
	return 0;
}
//***FUN��O CABE�ALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("******PROCESSO DE AUMENTO******\n");
	printf("*******************************\n");
}

