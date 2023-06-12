#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int n1,n2,n3;
	
	printf("Digite o primeiro número:\n");
	scanf("%i%*c",&n1);
	printf("Digite o segundo número:\n");
	scanf("%i%*c",&n2);
	printf("Digite o terceiro número:\n");
	scanf("%i%*c",&n3);
	if(n1>n2 && n1>n3){
		printf("\nO primeiro número é o maior");
	}else if(n2>n1 && n2>n3){
		printf("\nO segundo número é o maior");
	}else if(n3>n1 && n3>n2){
		printf("\nO terceiro número é maior");	
	}else{
		printf("\nNúmeros iguais!!\n Tente novamente!!");
	}
	return 0;
}
