#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"");
	float number;
	for(int i=0;i<5;i++){
		printf("\nDigite um número:\n");
		scanf("%f%*c",&number);
		if(number>0){
			printf("\nO número digitado é POSITIVO\n");
		}else if(number==0){
			printf("\nO número digitado é NULO\n");
		}else if(number<0){
			printf("\nO número digitado é NEGATIVO\n");
		}	
	}	
	return 0;
}
