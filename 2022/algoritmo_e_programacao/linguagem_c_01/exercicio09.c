#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float base, altura, area;
	
	printf("Digite a base do tri�ngulo:\n");
	scanf("%f%*c", &base);	
	printf("\nDigite a altura do tri�ngulo:\n");
	scanf("%f%*c", &altura);
	area=(base*altura)/2;
	printf("\nA �rea do tri�ngulo � igual a:\n%.f", area);
	
	return 0;
	
}
