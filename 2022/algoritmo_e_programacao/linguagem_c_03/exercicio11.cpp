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
		aumento=salario*15/100;
		salario=salario+aumento;
		printf("\nVoc� teve um reajuste de sal�rio:\nSal�rio atual:..............................R$%.2f",salario);
		printf("\nAumento:....................................R$%.2f",aumento);
	}else if(salario>=300 && salario<600){
		aumento=salario*10/100;
		salario=salario+aumento;
		printf("\nVoc� teve um reajuste de sal�rio:\nSal�rio atual:..............................R$%.2f",salario);
		printf("\nAumento:....................................R$%.2f",aumento);
	}else if(salario>=600 && salario<900){
		aumento=salario*5/100;
		salario=salario+aumento;
		printf("\nVoc� teve um reajuste de sal�rio:\nSal�rio atual:..............................R$%.2f",salario);
		printf("\nAumento:....................................R$%.2f",aumento);
	}else if(salario>900){
		printf("\nVoc� n�o teve reajuste de sal�rio:\nSal�rio atual:..............................R$%.2f",salario);
		printf("\nAumento:....................................R$%.2f",aumento);	
	}
	return 0;
}
//***FUN��O CABE�ALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("******PROCESSO DE AUMENTO******\n");
	printf("*******************************\n");
}

