#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"");
	int numero;
	printf("\nDigite o n�mero da tabuada que deseja:\n");
	scanf("%i%*c",&numero);
	for(int i=1;i<=10;i++){
		printf("\n%dx%d=%d",i,numero,i*numero);	
	}
	return 0;
}
