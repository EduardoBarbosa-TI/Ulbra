#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	float number_1,number_2, number_3;
	 
	printf("Digite o primeiro n�mero:\n");
	scanf("%f%*c", &number_1);
	
	printf("\nDigite o segundo n�mero:\n");
	scanf("%f%*c", &number_2);
	
	printf("\nDigite o terceiro n�mero:\n");
	scanf("%f%*c", &number_3);
	
	if(number_1<number_2 && number_1<number_3){
		if(number_2<number_3){
			printf("A ordem crescente dos n�meros digitados:\nPrimeiro n�mero digitado: %.f\nSegundo n�mero digitado: %.f\nTerceiro n�mero digitado: %.f", number_1,number_2,number_3);
		}else{
				printf("A ordem crescente dos n�meros digitados:\nPrimeiro n�mero digitado: %.f\nTerceiro n�mero digitado: %.f\nSegundo n�mero digitado: %.f", number_1,number_3,number_2);
		}
	}
	if(number_2<number_1 && number_2<number_3){
		if(number_1<number_3){
				printf("A ordem crescente dos n�meros digitados:\nSegundo n�mero digitado: %.f\nSegundo n�mero digitado: %.f\nTerceiro n�mero digitado: %.f", number_2,number_1,number_3);
		}else{
			printf("A ordem crescente dos n�meros digitados:\nSegundo n�mero digitado: %.f\nTerceiro n�mero digitado: %.f\nPrimeiro n�mero digitado: %.f", number_2,number_3,number_1);
		}	
	}
	if(number_3<number_1 && number_3<number_2){
		if(number_1<number_2){
			printf("A ordem crescente dos n�meros digitados:\nTerceiro n�mero digitado: %.f\nPrimeiro n�mero digitado: %.f\nSegundo n�mero digitado: %.f", number_3,number_1,number_2);
		}else{
			printf("A ordem crescente dos n�meros digitados:\nTerceiro n�mero digitado: %.f\nSegundo n�mero digitado: %.f\nPrimeiro n�mero digitado: %.f", number_3,number_2,number_1);
		}	
	}
	
    return 0;
}
