#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	float nota_1,nota_2,nota_3,nota_4, media;
	printf("Digite as quatro notas do aluno:\n");
	printf("Digite a primeira nota:\n");
	scanf("%f%*c", &nota_1);
	printf("Digite a segunda nota:\n");
	scanf("%f%*c", &nota_2);
	printf("Digite a terceira nota:\n");
	scanf("%f%*c", &nota_3);
	printf("Digite a quarta nota:\n");
	scanf("%f%*c", &nota_4);	
	media=(nota_1,nota_2,nota_3,nota_4)/4;	
	if(media >= 7){
		printf("Voc� foi APROVADO\n");
		printf("Parab�ns!!");	
	}else if(media<7){
		printf("Voc� foi REPROVADO\n");
		printf("Tente outra vez!\n");
		printf("Sua nota:\n%.f", media);	
	}
    return 0;		
}
