#include <stdio.h>
#include <locale.h>
#define SENHA 4531
//***Prot�tipos de Fun��es**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	int senha;
	cabecalho();
	printf("\nDigite a senha de usu�rio:\n");
	scanf("%i%*c",&senha);
	if(senha==SENHA){
		printf("\nACESSO PERMITIDO!!!");	
	}else{
		printf("\nACESSO NEGADO!!!");
    }
	return 0;
}
//***FUN��O CABE�ALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("******VALIDA��O DE LOGIN*******\n");
	printf("*******************************\n");
}
