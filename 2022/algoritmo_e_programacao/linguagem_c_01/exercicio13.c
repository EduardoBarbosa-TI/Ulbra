#include <stdlib.h>
#include <stdio.h>
#include <locale.h>
#include <math.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float pes, polegadas, jardas, milhas;
	
	printf("Digite o n�mero em p�s para converter em milhas, jardas ou polegadas:\n");
	scanf("%f%*c", &pes);
	
	polegadas= pes*12;
	jardas= pes/3;
	milhas= jardas/1760;
	
	
	printf("\nSeu n�mero convertido para polegadas:\n %.f", polegadas);
	printf("\nSeu n�mero convertido para jardas:\n %.f", jardas);
	printf("\nSeu n�mero convertido para milhas:\n %.f", milhas);	
	return 0;
	
	
}
