#include <stdlib.h>
#include <stdio.h>
#include <locale.h>
#include <math.h>
 int main(){
 	setlocale(LC_ALL,"Portuguese");
 	
 	float area,raio;
 	
 	printf("Digite o raio da circunfer�ncia:\n");
 	scanf("%f%*c", &raio);
 	area=3.1415*pow(raio,2);
 	printf("\n A �rea do circulo � igual a:\n %.f", area);

 	return 0;
 }
 
