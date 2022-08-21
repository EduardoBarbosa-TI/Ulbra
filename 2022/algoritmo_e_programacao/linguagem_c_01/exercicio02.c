#include <stdlib.h>
#include <stdio.h>
#include <locale.h>
 
int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float nota1,nota2,nota3,media;
	
	printf("Digite sua primeira nota:\n");
	scanf("%f%*c", &nota1);
	printf("Digite sua segunda nota:\n");
	scanf("%f%*c", &nota2);
	printf("Digite sua terceira nota:\n");
	scanf("%f%*c", &nota3);
	media=(nota1+nota2+nota3)/3;
	printf("A média de suas notas são:\n%.f",media);
	
	return 0;
}
