#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int idade;
	printf("\nDigite sua idade:\n");
	scanf("%i%*c",&idade);
	if(idade>=18){
		printf("\nVoc� � maior de idade");
	}else{
		printf("\nVoc� � menor de idade");
	}
	return 0;
}
