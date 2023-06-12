#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int numero,soma,i;
	numero=0;
	soma=0;
	do{
		printf("Digite um número:\n");
	    scanf("%i%*c",&numero);
	    soma+=numero;
		i++;		
	}while(numero<10);
	printf("A soma dos números digitados é:\n%i",soma);
	return 0;
}
