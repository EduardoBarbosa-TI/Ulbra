#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float horas_trabalhadas, salario_minimo, valor_hora, salario_bruto, imposto, salario_final;
	
	printf("Digite o total de horas trabalhadas:\n");
	scanf("%f%*c", &horas_trabalhadas);
	
	printf("\nDigite o valor do sal�rio m�nimo:\nR$");
	scanf("%f%*c", &salario_minimo);
	
	valor_hora=salario_minimo/2;
	salario_bruto=horas_trabalhadas*valor_hora;
	imposto=salario_bruto*3/100;
	salario_final=salario_bruto-imposto;
	
	printf("\nSeu sal�rio atual �:\n R$%.f", salario_final);
	
	return 0;
}
