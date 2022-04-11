#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	int number, r;
	
	printf("Digite um número inteiro:\n");
	scanf("%i%*c", &number);
	
	r=number%2;
	if(r == 0 ){
		printf("\nO número é par");
	}else{
		printf("\nO número é ímpar");
	}
	
	return 0;
}
