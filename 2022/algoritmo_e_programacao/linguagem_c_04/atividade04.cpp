#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int n1,n2;
	printf("Digite o primeiro n�mero:\n");
	scanf("%i%*c",&n1);
	printf("\nDigite o segundo n�mero:\n");
	scanf("%i%*c",&n2);
	if(n1>n2){
		printf("\nO primeiro n�mero � o maior");
	}else if(n2>n1){
		printf("\nO segundo n�mero � o maior");
	}else{
		printf("\nOs n�meros s�o iguais");
	}
	return 0;
}
