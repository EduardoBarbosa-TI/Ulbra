#include <stdlib.h>
#include <stdio.h>
#include <locale.h>
#include <math.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float pes, polegadas, jardas, milhas;
	
	printf("Digite o número em pés para converter em milhas, jardas ou polegadas:\n");
	scanf("%f%*c", &pes);
	
	polegadas= pes*12;
	jardas= pes/3;
	milhas= jardas/1760;
	
	
	printf("\nSeu número convertido para polegadas:\n %.f", polegadas);
	printf("\nSeu número convertido para jardas:\n %.f", jardas);
	printf("\nSeu número convertido para milhas:\n %.f", milhas);	
	return 0;
	
	
}
