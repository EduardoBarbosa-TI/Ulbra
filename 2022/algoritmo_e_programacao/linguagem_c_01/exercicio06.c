#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float salary, salaryReceipt, grat, imp;
	
	printf("Digite seu salário base:\n R$");
	scanf("%f%*c", &salary);
	grat=salary*5/100;
    imp=salary*7/100;
	salaryReceipt=salary+grat-imp;
	printf("Seu salário base disponível é:\n R$%.2f", salaryReceipt);
	
	return 0;
 
 
}

