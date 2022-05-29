#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
int main(){
	setlocale(LC_ALL,"");
	int number;
	for(int i=0;i<10;i++){
		printf("\nDigite um valor:\n");
		scanf("%i%*c",&number);
		if(number%2==0){
			system("cls");
			printf("\nO valor %d é PAR\n",number);
		}else{
			system("cls");
			printf("\nO valor %d é ÍMPAR\n",number);
		}
	}
	return 0;
}
