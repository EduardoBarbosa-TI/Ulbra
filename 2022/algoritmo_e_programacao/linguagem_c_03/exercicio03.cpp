#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	float n1,n2;
	printf("Digite o primeiro n�mero:\n");
	scanf("%f%*c",&n1);
	printf("Digite o segundo n�mero:\n");
	scanf("%f%*c",&n2);
	if(n1 > n2){
		printf("\nO primeiro n�mero � maior");			
    }else if(n2 > n1){
    	printf("\nO segundo n�mero � maior");			
	}else if (n1 == n2){
		printf("\nOs n�meros s�o iguais");
	}
	return 0;
}
