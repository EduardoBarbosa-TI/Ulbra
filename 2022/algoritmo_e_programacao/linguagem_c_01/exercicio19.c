#include <stdio.h>
#include <locale.h>
//***Prot�tipos de Fun��es**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	char sexo;
	int h,peso;
	cabecalho();
	printf("\nDigite a sua altura:\n");
	scanf("%i%*c",&h);
	printf("Digite seu sexo Masculino(M) Feminino(F):\n");
	scanf("%c%*c",&sexo);
	if(sexo=='M' || sexo=='m'){
		peso=72.7*h-58;
		printf("\nSeu peso ideal para a sua altura �: %iKg",peso);	
	}else if(sexo=='F' || sexo=='f'){
		peso=62.1*h-47.7;
		printf("\nSeu peso ideal para a sua altura �: %iKg",peso);	
	}else{
		printf("\nCOMANDO INV�LIDO!!");
	}
	return 0;
}
//***FUN��O CABE�ALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("*********SEU PESO IDEAL********\n");
	printf("*******************************\n");
}
