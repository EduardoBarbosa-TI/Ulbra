#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int nInicial,nFinal;
	int i;
	printf("Digite o número Inicial:\n");
   	scanf("%i%*c",&nInicial);
   	printf("Digite o número Final:\n");
    scanf("%i%*c",&nFinal);
    i=nInicial;	
	do{
	    if(i%2!=0){
			printf("\nNúmero ímpar:%d",i);
		}
	i++;
	}while(i<=nFinal);
	return 0;
}
