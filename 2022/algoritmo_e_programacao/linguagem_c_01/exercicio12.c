#include <stdlib.h>
#include <stdio.h>
#include <locale.h>
#include <math.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float num1,num2,r1,r2;
	
	printf("Digite dois n�meros maiores que 0:\n");
	scanf("%f%*c%f%*c",&num1,&num2);
	
	r1=pow(num1,num2);
	r2=pow(num2,num1);
	
	printf("A potencia��o do primeiro n�mero elevado ao segundo:\n%.f",r1);
	printf("\nA potencia��o do segundo n�mero elevado ao primeiro:\n%.f",r2);
	

	return 0;
	
}

