#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	int number, r;
	
	printf("Digite um n�mero inteiro:\n");
	scanf("%i%*c", &number);
	
	r=number%2;
	if(r == 0 ){
		printf("\nO n�mero � par");
	}else{
		printf("\nO n�mero � �mpar");
	}
	
	return 0;
}
