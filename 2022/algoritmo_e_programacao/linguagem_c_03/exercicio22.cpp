#include <stdio.h>
#include <locale.h>
//***Protótipos de Funções**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
    int peso,idade;
	cabecalho();
	printf("\nDigite a sua idade:\n");
	scanf("%i%*c",&idade);
	printf("\nDigite o seu peso:\n");
	scanf("%i%*c",&peso);
	if(idade<20){
		if(peso<60){
			printf("\nVocê está no grupo: 9");
		}else if(peso>=60 && peso<=90){
			printf("\nVocê está no grupo: 8");	
		}else if(peso>90){
			printf("\nVocê está no grupo: 7");	
		}	
	}else if(idade>=20 && idade<=50){
		if(peso<60){
			printf("\nVocê está no grupo: 6");
		}else if(peso>=60 && peso<=90){
			printf("\nVocê está no grupo: 5");	
		}else if(peso>90){
			printf("\nVocê está no grupo: 4");	
		}			
	}else if(idade>50){
		if(peso<60){
			printf("\nVocê está no grupo: 3");
		}else if(peso>=60 && peso<=90){
			printf("\nVocê está no grupo: 2");	
		}else if(peso>90){
			printf("\nVocê está no grupo: 1");	
		}			
	}
	return 0;
}
//***FUNÇÂO CABEÇALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("*********PERIGO EM GRUPO********\n");
	printf("*******************************\n");
}
