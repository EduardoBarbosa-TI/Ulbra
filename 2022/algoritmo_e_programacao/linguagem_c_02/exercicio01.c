#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float nota_1,nota_2,nota_3,media;
	
	printf("Digite a nota do trabalho de laboratório:\n");
	scanf("%f%*c", &nota_1);
	
	printf("Digite a nota da avaliação semestral:\n");
	scanf("%f%*c", &nota_2);
	
	printf("Digite a nota do exame final:\n");
	scanf("%f%*c", &nota_3);
	
	media=(nota_1*2 + nota_2*3 + nota_3*5)/10;
	printf("Média ponderada:\n%.f", media);
	
	if(media>=8 && media <= 10){
		printf("\nObteve conceito A");
	}
	if(media>=7 && media<8){
	   printf("\nObteve conceito B");
	}
	if(media>=6 && media<7){
	   printf("\nObteve conceito C");
	}
	if(media>=5 && media<6){
	   printf("\nObteve conceito D");
	}
	if(media>=0 && media<5){
	   printf("\nObteve conceito E");
	}
	
	return 0;	
}
