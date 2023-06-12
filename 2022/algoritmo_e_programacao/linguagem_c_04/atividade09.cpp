#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	float nota1,nota2,nota3,media;
	printf("Digite a primeira nota:\n");
	scanf("%f%*c",&nota1);
	printf("Digite a segunda nota:\n");
	scanf("%f%*c",&nota2);
	printf("Digite a terceira nota:\n");
	scanf("%f%*c",&nota3);
	
	media=(nota1+nota2+nota3)/3;
	if(media>=9){
		printf("\nPrimeira Nota....................%.f",nota1);
		printf("\nSegunda Nota....................%.f",nota2);
		printf("\nTerceira Nota....................%.f",nota3);
		printf("\nMédia de Aproveitamento..........%.f",media);
		printf("\nConceito..........................A");
		printf("\nParabéns você foi APROVADO!!");
	}else if(media>=7.5 && media<=9){
		printf("\nPrimeira Nota....................%.f",nota1);
		printf("\nSegunda Nota....................%.f",nota2);
		printf("\nTerceira Nota....................%.f",nota3);
		printf("\nMédia de Aproveitamento..........%.f",media);
		printf("\nConceito..........................B");
		printf("\nParabéns você foi APROVADO!!");
	}else if(media >=6 && media< 7.5){
		printf("\nPrimeira Nota....................%.f",nota1);
		printf("\nSegunda Nota....................%.f",nota2);
		printf("\nTerceira Nota....................%.f",nota3);
		printf("\nMédia de Aproveitamento..........%.f",media);
		printf("\nConceito..........................C");
		printf("\nParabéns você foi APROVADO!!");	
	}else if(media >=4 && media <6){
		printf("\nPrimeira Nota....................%.f",nota1);
		printf("\nSegunda Nota....................%.f",nota2);
		printf("\nTerceira Nota....................%.f",nota3);
		printf("\nMédia de Aproveitamento..........%.f",media);
		printf("\nConceito..........................D");
		printf("\nQue pena você foi REPROVADO!\nTente outra vez!");
	}else if(media<4){
		printf("\nPrimeira Nota....................%.f",nota1);
		printf("\nSegunda Nota....................%.f",nota2);
		printf("\nTerceira Nota....................%.f",nota3);
		printf("\nMédia de Aproveitamento..........%.f",media);
		printf("\nConceito..........................E");
		printf("\nQue pena você foi REPROVADO!\nTente outra vez!");	
	}
	return 0;
}
