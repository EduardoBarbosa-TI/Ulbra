#include <stdio.h>
#include <locale.h>
#define IMP 7/100;
//***Prot�tipos de Fun��es**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	float salario,gratificacao,imposto;
	cabecalho();
	printf("\nDigite o sal�rio bruto:\nR$");
	scanf("%f%*c",&salario);
	imposto=salario*IMP;
	salario=salario-imposto;
	if(salario<350){
		gratificacao=100;
		salario=salario+gratificacao;
		printf("\nSal�rio a receber:..............................R$%.2f",salario);
	}else if(salario>=350 && salario<600){
		gratificacao=75;
		salario=salario+gratificacao;
		printf("\nSal�rio a receber:..............................R$%.2f",salario);	
	}else if(salario>=600 && salario<900){
		gratificacao=50;
		salario=salario+gratificacao;
		printf("\nSal�rio a receber:..............................R$%.2f",salario);	
	}else if(salario>=900){
		gratificacao=35;
		salario=salario+gratificacao;
		printf("\nSal�rio a receber:..............................R$%.2f",salario);		
	}
	return 0;
}
//***FUN��O CABE�ALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("******PROCESSO SALARIAL******\n");
	printf("*******************************\n");
}
