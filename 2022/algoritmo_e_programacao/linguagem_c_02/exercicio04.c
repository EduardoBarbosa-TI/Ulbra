#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	float number_1,number_2, number_3;
	 
	printf("Digite o primeiro número:\n");
	scanf("%f%*c", &number_1);
	
	printf("\nDigite o segundo número:\n");
	scanf("%f%*c", &number_2);
	
	printf("\nDigite o terceiro número:\n");
	scanf("%f%*c", &number_3);
	
	if(number_1<number_2 && number_1<number_3){
		if(number_2<number_3){
			printf("A ordem crescente dos números digitados:\nPrimeiro número digitado: %.f\nSegundo número digitado: %.f\nTerceiro número digitado: %.f", number_1,number_2,number_3);
		}else{
				printf("A ordem crescente dos números digitados:\nPrimeiro número digitado: %.f\nTerceiro número digitado: %.f\nSegundo número digitado: %.f", number_1,number_3,number_2);
		}
	}
	if(number_2<number_1 && number_2<number_3){
		if(number_1<number_3){
				printf("A ordem crescente dos números digitados:\nSegundo número digitado: %.f\nSegundo número digitado: %.f\nTerceiro número digitado: %.f", number_2,number_1,number_3);
		}else{
			printf("A ordem crescente dos números digitados:\nSegundo número digitado: %.f\nTerceiro número digitado: %.f\nPrimeiro número digitado: %.f", number_2,number_3,number_1);
		}	
	}
	if(number_3<number_1 && number_3<number_2){
		if(number_1<number_2){
			printf("A ordem crescente dos números digitados:\nTerceiro número digitado: %.f\nPrimeiro número digitado: %.f\nSegundo número digitado: %.f", number_3,number_1,number_2);
		}else{
			printf("A ordem crescente dos números digitados:\nTerceiro número digitado: %.f\nSegundo número digitado: %.f\nPrimeiro número digitado: %.f", number_3,number_2,number_1);
		}	
	}
	
    return 0;
}
