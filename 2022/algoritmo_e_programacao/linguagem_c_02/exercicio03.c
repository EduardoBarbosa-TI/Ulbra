#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float number_1,number_2;
	
	printf("Digite o primeiro número:\n");
	scanf("%f%*c", &number_1);
	
	printf("Digite o segundo número:\n");
	scanf("%f%*c", &number_2);
	
	if(number_1 > number_2){
		printf("O primeiro número é o maior:%.f", number_1);
	}else if(number_2 > number_1){
	    printf("O segundo número é o maior: %.f", number_2);
	}else{
		printf("Os números são iguais");
	}

  	return 0;
}
