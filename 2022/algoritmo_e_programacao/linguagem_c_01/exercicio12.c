#include <stdlib.h>
#include <stdio.h>
#include <locale.h>
#include <math.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float num1,num2,r1,r2;
	
	printf("Digite dois números maiores que 0:\n");
	scanf("%f%*c%f%*c",&num1,&num2);
	
	r1=pow(num1,num2);
	r2=pow(num2,num1);
	
	printf("A potenciação do primeiro número elevado ao segundo:\n%.f",r1);
	printf("\nA potenciação do segundo número elevado ao primeiro:\n%.f",r2);
	

	return 0;
	
}

