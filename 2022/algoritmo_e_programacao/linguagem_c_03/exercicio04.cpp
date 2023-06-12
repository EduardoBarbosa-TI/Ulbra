#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	float n1,n2,n3;
	printf("Digite o primeiro número:\n");
	scanf("%f%*c",&n1);
	printf("Digite o segundo número:\n");
	scanf("%f%*c",&n2);
	printf("Digite o terceiro número:\n");
	scanf("%f%*c",&n3);
	if(n1>n2 &&n1>n3){
		printf("\nO primeiro número é o maior");
	}else if(n2>n1 && n2>n3){
		printf("\nO segundo número é o maior");	
	}else if(n3>n1 && n3>n2){
		printf("\nO terceiro número é o maior");	
	}else{
		printf("\nOs números estão iguais \nTente novamente!");	
	}
   return 0;
}
