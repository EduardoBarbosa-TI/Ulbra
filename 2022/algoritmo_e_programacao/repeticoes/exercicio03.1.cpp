#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int nInicial,nFinal;
	int i;
	printf("Digite o n�mero Inicial:\n");
	scanf("%i%*c",&nInicial);
	printf("Digite o n�mero Final:\n");
	scanf("%i%*c",&nFinal);
	i=nInicial;
	while(i<=nFinal){
		if(i%2!=0){
			printf("\nN�mero �mpar:%d",i);
		}	
		i++;	
	}
	return 0;
}
