#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float nota_1,nota_2,nota_3, media,nota_exame;
	
	printf("Digite a primeira nota do aluno:\n");
	scanf("%f%*c", &nota_1);
	
	printf("Digite a segunda nota do aluno:\n");
	scanf("%f%*c", &nota_2);
	
	printf("Digite a terceira nota do aluno:\n");
	scanf("%f%*c", &nota_3);
	
	media=(nota_1+nota_2+nota_3)/3;
	printf("Sua média aritmética é %.f", media);
	
	if(media >=0 && media<3){
		printf("\nVocê foi reprovado");
		printf("\nFaça sua rematrícula");	
	}
	if(media >= 3 && media <7){
		printf("\nVocê pode optar em fazer o exame");
		nota_exame=12-media;
		printf("\nVocê terá que tirar a nota %.f para ser APROVADO", nota_exame);	
	}else if(media >= 7 && media <= 10){
		printf("\nVocê foi aprovado.");
		printf("\nParabéns!!");
	}else if(media >=7 && media>10){
	    printf("\nSua nota não está sendo processada.\n Tente Novamente!");
		}
	
	return 0;
}
