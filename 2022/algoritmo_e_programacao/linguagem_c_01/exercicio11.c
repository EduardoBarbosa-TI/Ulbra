#include <stdlib.h> //Revisar colocando o tipo de dado inteiro
#include <stdio.h>
#include <locale.h>
#include <math.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float number, quad,cubo,r2,r3;
	
	printf("Digite um n�mero que seja positivo e maior que 0:\n");
	scanf("%f%*c", &number);
	
	quad=pow(number,2);
	cubo=pow(number,3);
	r2=sqrt(number);
	r3=sqrt(number,3);
	
	printf("\n O seu n�mero ao quadrado:\n%.f", quad);
	printf("\n O seu n�mero ao cubo:\n %.f", cubo);
    printf("\n A raiz quadrada do seu n�mero:\n %.f", r2);
    printf("\n A raiz c�bica do seu n�mero:\n %.f", r3);

	return 0; 
	
}
