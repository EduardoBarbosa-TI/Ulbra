#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float nota1,nota2,nota3,peso1,peso2,peso3,media;
	
	printf("Digite a primeira nota e o primeiro peso:\n");
	scanf("%f%*c%f%*c",&nota1,&peso1);
	printf("Digite a segunda nota e o segundo peso:\n");
	scanf("%f%*c%f%*c",&nota2,&peso2);
	printf("Digite a terceira nota e o terceiro peso:\n");
	scanf("%f%*c%f%*c",&nota3,&peso3);
	media=(nota1*peso1+nota2*peso2+nota3*peso3)/(peso1+peso2+peso3);
	printf("A média ponderada dos valores e seus respctivos pesos é:\n%.f", media);
	
	return 0;
}
