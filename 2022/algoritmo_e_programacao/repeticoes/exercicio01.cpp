#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int numero, soma;
	for(int i=0; i<10; i++){
		printf("Digite um n�mero:\n");
	    scanf("%i%*c",&numero);
	    soma+=numero;	
	}
	printf("A soma dos dez n�mero �:\n %i",soma);
	return 0;
};
