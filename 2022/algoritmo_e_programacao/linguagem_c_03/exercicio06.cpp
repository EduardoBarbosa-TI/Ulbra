#include <stdio.h>
#include <locale.h>
#include <tgmath.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	int op;
	float n1,n2;
	float potencia;
	printf("Digite o primeiro número:\n");
	scanf("%f%*c",&n1);
	printf("Digite o segundo número:\n");
	scanf("%f%*c",&n2);
	printf("\n\n*********************\n");
	printf("******OPERAÇÂO*******\n");
	printf("*********************\n");
	printf("1. O primeiro número elevado ao segundo número\n");
	printf("2. Raiz quadrada de cada um dos números\n");
	printf("3. Raiz cúbica de cada um dos números\n");
	printf("\nDigite a opção: ");
	scanf("%i%*c",&op);
	switch(op){
			case 1:
				printf("\nA potênciação dos números digitados é %.f",pow(n1,n2));
				break;
			case 2:
				printf("\nA raiz quadrada dos números digitados:\n%.f\n%.f",sqrt(n1),sqrt(n2));
				break;
			case 3:
				printf("\nA raiz cúbica dos números digitados:\n%.f\n%.f",cbrt(n1),cbrt(n2));	
				break;
			default:
			    printf("\nComando inválido\n Tente novamente!");	
    }
   return 0;
}

