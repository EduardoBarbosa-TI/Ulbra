#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
	int valor_I;
	float valor_A,valor_B,valor_C;
	
	printf("Digite um valor para A:\n");
	scanf("%f%*c", &valor_A);
	
	printf("Digite um valor para B:\n");
	scanf("%f%*c", &valor_B);
	
	printf("Digite um valor para C:\n");
	scanf("%f%*c", &valor_C);
	
	printf("Digite 1 para acessar a ordem crescente dos valores:\n");
	printf("Digite 2 para acessar a ordem decrescente dos valores:\n");
	printf("Digite 3 para o maior valor ficar entre os outros dois valores:\n");
	scanf("%i%*c", &valor_I);
	
	if(valor_I == 1){
		if(valor_A<valor_B && valor_A<valor_C){
			if(valor_B<valor_C){
				printf("A ordem crescente dos valores:\n%.f\n%.f\n%.f",valor_A,valor_B,valor_C);
			}else if(valor_C<valor_B){
				printf("A ordem crescente dos valores:\n%.f\n%.f\n%.f", valor_A,valor_C,valor_B);
			}	
		}	
		if(valor_B<valor_A && valor_B<valor_C){
			if(valor_A<valor_C){
				printf("A ordem crescente dos valores:\n%.f\n%.f\n%.f", valor_B,valor_A,valor_C);	
			}else if(valor_C<valor_A){
				printf("A ordem crescente dos valores:\n%.f\n%.f\n%.f", valor_B,valor_C,valor_A);
			}
			
		}
		if(valor_C<valor_A && valor_C<valor_B){
			if(valor_A<valor_B){
				printf("A ordem crescente dos valores:\n%.f\n%.f\n%.f", valor_B,valor_A,valor_C);	
			}else if(valor_B<valor_A){
				printf("A ordem crescente dos valores:\n%.f\n%.f\n%.f", valor_B,valor_C,valor_A);
			}	
		}	
	}
	if(valor_I == 2){
		if(valor_A>valor_B && valor_A>valor_C){
			if(valor_B>valor_C){
				printf("A ordem decrescente dos valores:\n%.f\n%.f\n%.f",valor_A,valor_B,valor_C);
			}else if(valor_C>valor_B){
				printf("A ordem decrescente dos valores:\n%.f\n%.f\n%.f", valor_A,valor_C,valor_B);
			}	
		}	
		if(valor_B>valor_A && valor_B>valor_C){
			if(valor_A>valor_C){
				printf("A ordem decrescente dos valores:\n%.f\n%.f\n%.f", valor_B,valor_A,valor_C);	
			}else if(valor_C>valor_A){
				printf("A ordem decrescente dos valores:\n%.f\n%.f\n%.f", valor_B,valor_C,valor_A);
			}
			
		}
		if(valor_C>valor_A && valor_C>valor_B){
			if(valor_A>valor_B){
				printf("A ordem decrescente dos valores:\n%.f\n%.f\n%.f", valor_B,valor_A,valor_C);	
			}else if(valor_B>valor_A){
				printf("A ordem decrescente dos valores:\n%.f\n%.f\n%.f", valor_B,valor_C,valor_A);
			}	
		}	
	}
	if(valor_I == 3){
		if(valor_A>valor_B && valor_A>valor_C){
			printf("A ordem desejada:\n%.f\n%.f\n%.f",valor_B,valor_A,valor_C);	
		}
		if(valor_B>valor_A && valor_B>valor_C){
			printf("A ordem desejada:\n%.f\n%.f\n%.f",valor_A,valor_B,valor_C);		
		}
		if(valor_B>valor_A && valor_B>valor_C){
			printf("A ordem desejada:\n%.f\n%.f\n%.f",valor_A,valor_C,valor_B);		
		}		
	}	
return 0;
}
