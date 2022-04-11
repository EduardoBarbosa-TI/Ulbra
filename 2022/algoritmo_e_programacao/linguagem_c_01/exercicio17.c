#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main (){
	setlocale(LC_ALL,"Portuguese");
	
	float deposito,cheque1,cheque2,cmpf1,cmpf2,saldo;
	
	printf("Digite o valor de deposito:\nR$");
	scanf("%f%*c", &deposito);
	
	printf("\nDigite o valor do primeiro cheque:\nR$");
	scanf("%f%*c", &cheque1);
	
    printf("\nDigite o valor do segundo cheque:\nR$");
    scanf("%f%*c", &cheque2);
     
   
	cmpf1=cheque1*0.38/100;
	cmpf2=cheque2*0.38/100;
	saldo=deposito-cheque1-cheque2-cmpf1-cmpf2;
	
	printf("Seu saldo atual é:\nR$%.2f", saldo);	
		
    
	return 0;
}
