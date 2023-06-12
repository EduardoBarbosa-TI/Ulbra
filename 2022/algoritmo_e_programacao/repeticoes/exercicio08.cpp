#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
int main(){
	setlocale(LC_ALL,"");
	int mult=9;
	for(int i=1;i<10;i++){
		printf("\n%dx%d=%d",i,mult,i*mult);	
	}
	return 0;
}
