#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float salary, salaryReceipt, taxes;
	
	printf("Digite o sal�rio base:\nR$");
	scanf("%f%*c", &salary);
	taxes=salary*10/100;
	salaryReceipt= salary+50-taxes;	
	printf("\nSeu sal�rio base dispon�vel:\n R$%.2f", salaryReceipt);
	
	return 0;
	
}
