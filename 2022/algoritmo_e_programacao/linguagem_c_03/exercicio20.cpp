#include <stdio.h>
#include <locale.h>
//***Prot�tipos de Fun��es**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	int idade;
	cabecalho();
	printf("\nDigite a sua idade:\n");
	scanf("%i%*c",&idade);
	if(idade<5){
		printf("\nVoc� � da categoria Mamadeira");	
	}else if(idade>=5 && idade<=7){
		printf("\nVoc� � da categoria Infantil");
	}else if(idade>=8 && idade<=10){
		printf("\nVoc� � da categoria Juvenil");
	}else if(idade>=11 && idade<=15){
		printf("\nVoc� � da categoria Adolescente");
	}else if(idade>=16 && idade<=30){
		printf("\nVoc� � da categoria Adulto ");
	}else if(idade>30){
		printf("\nVoc� � da categoria S�nior");
	}
	return 0;
}
//***FUN��O CABE�ALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("******CATEGORIA DE NATA��O*****\n");
	printf("*******************************\n");
}
