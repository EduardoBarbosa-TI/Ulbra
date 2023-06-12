#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int idade;
	printf("\nDigite sua idade:\n");
	scanf("%i%*c",&idade);
	if(idade>=18){
		printf("\nVocê é maior de idade");
	}else{
		printf("\nVocê é menor de idade");
	}
	return 0;
}
