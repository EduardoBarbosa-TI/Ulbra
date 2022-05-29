#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"");
	for(int i=20;i>0;i--){
		printf("\nOrdem decrescente: %i",i);
	}
	return 0;
}
