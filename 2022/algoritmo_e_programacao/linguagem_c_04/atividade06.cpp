#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int n1,n2,n3;
	
	printf("Digite o primeiro n�mero:\n");
	scanf("%i%*c",&n1);
	printf("Digite o segundo n�mero:\n");
	scanf("%i%*c",&n2);
	printf("Digite o terceiro n�mero:\n");
	scanf("%i%*c",&n3);
	if(n1>n2 && n1>n3){
		printf("\nO primeiro n�mero � o maior");
	}else if(n2>n1 && n2>n3){
		printf("\nO segundo n�mero � o maior");
	}else if(n3>n1 && n3>n2){
		printf("\nO terceiro n�mero � maior");	
	}else{
		printf("\nN�meros iguais!!\n Tente novamente!!");
	}
	return 0;
}
