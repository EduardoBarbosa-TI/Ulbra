#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int numero, soma;
	for(int i=0; i<10; i++){
		printf("Digite um número:\n");
	    scanf("%i%*c",&numero);
	    soma+=numero;	
	}
	printf("A soma dos dez número é:\n %i",soma);
	return 0;
};
