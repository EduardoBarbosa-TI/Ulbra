#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	int ano_nascimento, ano_atual, idade, idade_2050;
	
    printf("Digite primeiro o ano atual e depois o seu ano de nascimento:\n");
	scanf("%i%*c%i%*c", &ano_atual, &ano_nascimento);
	
	
	idade=ano_atual-ano_nascimento;
	idade_2050= 2050-ano_nascimento;
	
	printf("\nSua idadade atual:\n%i anos", idade);
	printf("\nNo ano de 2050 você terá:\n%i anos", idade_2050);
	
	return 0;  
}
