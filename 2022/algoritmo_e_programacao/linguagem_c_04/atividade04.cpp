#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int n1,n2;
	printf("Digite o primeiro número:\n");
	scanf("%i%*c",&n1);
	printf("\nDigite o segundo número:\n");
	scanf("%i%*c",&n2);
	if(n1>n2){
		printf("\nO primeiro número é o maior");
	}else if(n2>n1){
		printf("\nO segundo número é o maior");
	}else{
		printf("\nOs números são iguais");
	}
	return 0;
}
