#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
void cabecalho();

int main(){
	setlocale(LC_ALL,"Portuguese");
	int n1,n2;
    cabecalho();
	
	printf("Digite o primeiro n�mero:\n");
	scanf("%i%*c",&n1);
	printf("Digite o primeiro n�mero:\n");
	scanf("%i%*c",&n2);
	
	if(n1>n2){
		n1=n1+100;
		printf("\nO primeiro n�mero digitado � maior:\n%i", n1);
	}else if(n2>n1){
		n2=n2+100;
		printf("O segundo n�mero digitado � maior:\n%i", n2);
	}else{
		n2=n2+100;
		n1=n1+100;
		printf("\nOs n�meros s�o iguais\n%i %i",n1,n2);
		
	}
	return 0;	
}

//*****************Fun��o Cabe�alho**************************************************************************************************************************
void cabecalho(){
	    printf("**************************************\n");
	    printf("*****Somando +100 ao maior n�mero*****\n");
	    printf("**************************************\n");
}


