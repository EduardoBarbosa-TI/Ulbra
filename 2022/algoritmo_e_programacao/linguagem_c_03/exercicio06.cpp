#include <stdio.h>
#include <locale.h>
#include <tgmath.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	int op;
	float n1,n2;
	float potencia;
	printf("Digite o primeiro n�mero:\n");
	scanf("%f%*c",&n1);
	printf("Digite o segundo n�mero:\n");
	scanf("%f%*c",&n2);
	printf("\n\n*********************\n");
	printf("******OPERA��O*******\n");
	printf("*********************\n");
	printf("1. O primeiro n�mero elevado ao segundo n�mero\n");
	printf("2. Raiz quadrada de cada um dos n�meros\n");
	printf("3. Raiz c�bica de cada um dos n�meros\n");
	printf("\nDigite a op��o: ");
	scanf("%i%*c",&op);
	switch(op){
			case 1:
				printf("\nA pot�ncia��o dos n�meros digitados � %.f",pow(n1,n2));
				break;
			case 2:
				printf("\nA raiz quadrada dos n�meros digitados:\n%.f\n%.f",sqrt(n1),sqrt(n2));
				break;
			case 3:
				printf("\nA raiz c�bica dos n�meros digitados:\n%.f\n%.f",cbrt(n1),cbrt(n2));	
				break;
			default:
			    printf("\nComando inv�lido\n Tente novamente!");	
    }
   return 0;
}

