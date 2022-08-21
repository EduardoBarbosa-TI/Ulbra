#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main (){
	setlocale(LC_ALL,"Portuguese");
	
	int op,n3;
	float n1,n2,soma,raiz;
	printf("Menu de opções:");
	printf("\n1.  Somar dois números.");
	printf("\n2.  Raiz quadrada de um número.");
	printf("\nDigite a opção desejada.\n");
	scanf("%i%*c", &op);
	
	if(op == 1){
		printf("Digite dois números:\n");
		scanf("%f%*c%f%*c", &n1,&n2);
		soma=n1+n2;
		printf("O resultado da soma dos números:\n%.f", soma);
	}
	if(op == 2){
		printf("Digite um número:\n");
		scanf("%i%*c", &n3);
		
		raiz=sqrt(n3);
		
		printf("O resultado da raiz quadrada do número %.i:\n%.f",n3,raiz);
		
	}else{
		printf("Comando inválido!\nTente novamente!");
	}
	
	return 0;
}
