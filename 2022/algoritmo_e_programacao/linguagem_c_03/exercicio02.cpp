#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	float nota1,nota2,media;
	printf("Digite a primeira nota:\n");
	scanf("%f%*c",&nota1);
	printf("Digite a segunda nota:\n");
	scanf("%f%*c",&nota2);
	media=(nota1+nota2)/2;
	if(media>0 && media<=4){
		printf("Sua m�dia foi %.f \nInfelizmente voc� est� REPROVADO\nTente novamente!",media);
	}else if(media >4 && media <=7){
		printf("Sua m�dia foi %.f\nVoc� pode optar em realizar o exame de recupera��o",media);	
	}else if(media>7 && media<10){
		printf("Sua m�dia foi %.f\nParab�ns voc� foi APROVADO!!",media);	
	}
	return 0;
}
