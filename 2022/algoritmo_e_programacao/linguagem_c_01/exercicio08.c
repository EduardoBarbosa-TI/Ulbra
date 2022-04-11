#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float deposit,taxes,income, total;
	
	printf("Digite o valor de depósito:\n R$");
	scanf("%f%*c", &deposit);
	printf("\nDigite o percentual de taxas de juros:\n");
	scanf("%f%*c", &taxes);
	income= deposit*taxes/100;
	total=deposit+income;	
	printf("\n Seu rendimento foi:\n R$%.2f", income);	
	printf("\n\n Seu valor total depositado:\n R$%.2f",total);
	
return 0;	
}
