#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	for(int i=0;i<1500;i++){
		if(i%2!=0){
			printf("\nN�mero �mpar:%d",i);
		}
	}
	return 0;
}
