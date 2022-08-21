#include <stdlib.h> 
#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	float salary,newSalary, percentage, wage;
	
	printf("Digite o seu salário atual:\n R$");
	scanf("%f%*c", &salary);
	printf("\nDigite o percentual de aumento do seu salário:\n");
	scanf("%f%*c", &percentage);
	wage=salary*percentage/100;
	printf("\nSeu aumento de salário foi de:\n R$%.2f \n", wage);

	newSalary=wage+wage;
    printf("\nSeu novo salário é:\n R$%.2f", newSalary);	
    

	return 0;
}
