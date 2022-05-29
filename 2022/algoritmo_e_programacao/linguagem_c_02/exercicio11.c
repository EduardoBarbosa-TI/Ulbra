#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
int main(){
	
	setlocale(LC_ALL,"");
	char nome[20];
	int i=0;
	float nota1,nota2,nota3,media;
	do{
		system("cls");
		printf("\nDigite o nome do aluno:");
		scanf("%s%*c",&nome);
	    printf("\nDigite a primeira nota do %s:",nome);
		scanf("%f%*c",&nota1);
		printf("\nDigite a segunda nota do %s:",nome);
		scanf("%f%*c",&nota2);
		printf("\nDigite a terceira nota do %s:",nome);
		scanf("%f%*c",&nota3);
		media=(nota1+nota2+nota3)/3;
		if(media<6){
			printf("\nO aluno %s está REPROVADO com a média. %.f\n",nome,media);
		}else if(media>=6){
			printf("\nO aluno %s está APROVADO com a média. %.f\n",nome,media);
		}
		i++;
		system("pause");
	}while(i<=10);
	return 0;
}
