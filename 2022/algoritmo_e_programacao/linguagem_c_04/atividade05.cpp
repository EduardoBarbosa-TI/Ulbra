#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int v1,v2,somaV1,somaV2;
	printf("Digite o primeiro valor:\n");
	scanf("%i%*c",&v1);
	printf("Digite o segundo valor:\n");
	scanf("%i%*c",&v2);
	
    somaV1=v1 % 2;
    somaV2=v2%2; 
    if(somaV1==0 && somaV2==0){
    	printf("\nO primeiro valor é múltiplo de 2:",v1);
		printf("\nO segundo valor é múltiplo de 2:",v2);
	}else if(somaV1==0 && somaV2!=0){
		printf("\nO primeiro valor é múltiplo de 2:",v1);
		printf("\nO segundo valor não é múltiplo de 2:",v2);
	}else{
		printf("\nO segundo valor é múltiplo de 2:",v2);
		printf("\nO primeiro valor não é múltiplo de 2",v1);	
	}
	return 0;
}
	
