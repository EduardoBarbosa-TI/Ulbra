#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	 float salary,newSalary;
	 
	 printf("Digite o salário atual:\n R$");
	 scanf("%f%*c", &salary);
	 newSalary= wage+wage*25/100;
	 printf("Seu novo salário é:\n R$%.2f", newSalary);
	 
	return 0;
}
