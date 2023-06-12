#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"");
	int n,soma;
	int i=0;
	printf("Digite um número:\n");
	scanf("%i%*c",&n);
	while(i<n){
		soma=soma+i;
		i++;
	}
	printf("A soma dos números de 1 até %i é: %i",n,soma);
	return 0;
}
