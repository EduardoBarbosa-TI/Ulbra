#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main (){
	setlocale(LC_ALL,"Portuguese");
	
	int op,n3;
	float n1,n2,soma,raiz;
	printf("Menu de op��es:");
	printf("\n1.  Somar dois n�meros.");
	printf("\n2.  Raiz quadrada de um n�mero.");
	printf("\nDigite a op��o desejada.\n");
	scanf("%i%*c", &op);
	
	if(op == 1){
		printf("Digite dois n�meros:\n");
		scanf("%f%*c%f%*c", &n1,&n2);
		soma=n1+n2;
		printf("O resultado da soma dos n�meros:\n%.f", soma);
	}
	if(op == 2){
		printf("Digite um n�mero:\n");
		scanf("%i%*c", &n3);
		
		raiz=sqrt(n3);
		
		printf("O resultado da raiz quadrada do n�mero %.i:\n%.f",n3,raiz);
		
	}else{
		printf("Comando inv�lido!\nTente novamente!");
	}
	
	return 0;
}
