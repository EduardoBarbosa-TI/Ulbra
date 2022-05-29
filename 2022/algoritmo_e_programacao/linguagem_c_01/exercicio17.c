#include <stdio.h>
#include <locale.h>
#define SENHA 4531
//***Protótipos de Funções**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	int senha;
	cabecalho();
	printf("\nDigite a senha de usuário:\n");
	scanf("%i%*c",&senha);
	if(senha==SENHA){
		printf("\nACESSO PERMITIDO!!!");	
	}else{
		printf("\nACESSO NEGADO!!!");
    }
	return 0;
}
//***FUNÇÂO CABEÇALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("******VALIDAÇÂO DE LOGIN*******\n");
	printf("*******************************\n");
}
