#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"");
	int n,soma;
	int i=0;
	printf("Digite um n�mero:\n");
	scanf("%i%*c",&n);
	while(i<n){
		soma=soma+i;
		i++;
	}
	printf("A soma dos n�meros de 1 at� %i �: %i",n,soma);
	return 0;
}
