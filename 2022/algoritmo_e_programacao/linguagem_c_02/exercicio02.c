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
	printf("Sua m�dia aritm�tica � %.f", media);
	
	if(media >=0 && media<3){
		printf("\nVoc� foi reprovado");
		printf("\nFa�a sua rematr�cula");	
	}
	if(media >= 3 && media <7){
		printf("\nVoc� pode optar em fazer o exame");
		nota_exame=12-media;
		printf("\nVoc� ter� que tirar a nota %.f para ser APROVADO", nota_exame);	
	}else if(media >= 7 && media <= 10){
		printf("\nVoc� foi aprovado.");
		printf("\nParab�ns!!");
	}else if(media >=7 && media>10){
	    printf("\nSua nota n�o est� sendo processada.\n Tente Novamente!");
		}
	
	return 0;
}
