#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int numero,soma,i;
	numero=0;
	soma=0;
	while(numero<10){
		printf("Digite um n�mero:\n");
	    scanf("%i%*c",&numero);
		soma+=numero;
		i++;
	};
	printf("\nA soma dos n�meros digitados �:\n%i",soma);
	return 0;
}
