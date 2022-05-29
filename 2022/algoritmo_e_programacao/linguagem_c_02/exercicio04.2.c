#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	float media;
    float nota;
    int i=0;
    do{
    	printf("\nDigite a nota do aluno %d:\n",i+1);
    	scanf("%f%*c",&nota);
		media=media+nota;
		i++;
    	
	}while(i<10); 
    media=media/10;
    printf("A média da turma é: %.f",media);
	return 0;  	
}

