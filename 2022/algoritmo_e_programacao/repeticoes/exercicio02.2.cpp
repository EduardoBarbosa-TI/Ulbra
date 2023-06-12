#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int i=0;	
	while(i<1500){
		if(i%2!=0){
		    printf("\nNúmero ímpar:%d",i);
		}
		i++;
	}	
	return 0;
}
