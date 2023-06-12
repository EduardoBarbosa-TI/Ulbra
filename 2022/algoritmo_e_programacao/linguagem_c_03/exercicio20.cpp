#include <stdio.h>
#include <locale.h>
//***Protótipos de Funções**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	int idade;
	cabecalho();
	printf("\nDigite a sua idade:\n");
	scanf("%i%*c",&idade);
	if(idade<5){
		printf("\nVocê é da categoria Mamadeira");	
	}else if(idade>=5 && idade<=7){
		printf("\nVocê é da categoria Infantil");
	}else if(idade>=8 && idade<=10){
		printf("\nVocê é da categoria Juvenil");
	}else if(idade>=11 && idade<=15){
		printf("\nVocê é da categoria Adolescente");
	}else if(idade>=16 && idade<=30){
		printf("\nVocê é da categoria Adulto ");
	}else if(idade>30){
		printf("\nVocê é da categoria Sênior");
	}
	return 0;
}
//***FUNÇÂO CABEÇALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("******CATEGORIA DE NATAÇÂO*****\n");
	printf("*******************************\n");
}
