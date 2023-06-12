#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"");
	float media;
    float nota;
    for(int i=0;i<10;i++){
    	printf("\nDigite a nota do aluno %d:\n",i+1);
    	scanf("%f%*c",&nota);
		media=media+nota;	
    } 
    media=media/10;
    printf("A média da turma é: %.f",media);
	return 0;  	
}

