#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"");
	float number;
	for(int i=0;i<5;i++){
		printf("\nDigite um n�mero:\n");
		scanf("%f%*c",&number);
		if(number>0){
			printf("\nO n�mero digitado � POSITIVO\n");
		}else if(number==0){
			printf("\nO n�mero digitado � NULO\n");
		}else if(number<0){
			printf("\nO n�mero digitado � NEGATIVO\n");
		}	
	}	
	return 0;
}
