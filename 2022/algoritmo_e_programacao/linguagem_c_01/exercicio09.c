#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float base, altura, area;
	
	printf("Digite a base do triângulo:\n");
	scanf("%f%*c", &base);	
	printf("\nDigite a altura do triângulo:\n");
	scanf("%f%*c", &altura);
	area=(base*altura)/2;
	printf("\nA área do triângulo é igual a:\n%.f", area);
	
	return 0;
	
}
