#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	float n1,n2;
	printf("Digite o primeiro número:\n");
	scanf("%f%*c",&n1);
	printf("Digite o segundo número:\n");
	scanf("%f%*c",&n2);
	if(n1 > n2){
		printf("\nO primeiro número é maior");			
    }else if(n2 > n1){
    	printf("\nO segundo número é maior");			
	}else if (n1 == n2){
		printf("\nOs números são iguais");
	}
	return 0;
}
