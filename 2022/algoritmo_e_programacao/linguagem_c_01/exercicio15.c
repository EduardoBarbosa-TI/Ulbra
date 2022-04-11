#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
	
	setlocale(LC_ALL,"Portuguese");
	
	float valor_fabrica, percentual_distribuidor, percentual_impostos, valor_d, valor_i, p_final;
	
	printf("Digite o preço de fábrica do veículo:\nR$");
	scanf("%f%*c", &valor_fabrica);

	printf("\nDigite o percentual de lucro do distribuidor:\n");
	scanf("%f%*c", &percentual_distribuidor);
	
	printf("\nDigite o percentual de impostos:\n");
	scanf("%f%*c", &percentual_impostos);
	
	valor_d=valor_fabrica*percentual_distribuidor/100;
	valor_i=valor_fabrica*percentual_impostos/100;
	p_final= valor_fabrica+valor_d+valor_i;
	
	printf("\nO valor corrrespondente ao lucro do fornecedor:\n R$%.2f", valor_d);
	printf("\nO valor correspondente aos impostos:\n R$%.2f", valor_i);
	printf("\nO preço final do veículo:\n R$%.2f", p_final);
	
	return 0;
}
