#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int horasExtra,horasFalta,h;
	printf("Digite o n�mero de horas extras que realizou:\n");
	scanf("%i%*c",&horasExtra);
	printf("\nDigite o n�mero de horas que faltou ao servi�o:\n");
	scanf("%i%*c",&horasFalta);
	h=horasExtra-(2/3*horasFalta);
	if(h<=600){
		printf("\nParab�ns!! Voc� acaba de ganhar R$100,00 de gratifica��o de Natal.\nCONSELHO:GASTE NO ENTREVEIRO DO CLUBE DOS COROAS!!!!");
	}else if(h>600 && h<=1200){
		printf("\nParab�ns!! Voc� acaba de ganhar R$200,00 de gratifica��o de Natal.\nCONSELHO:GASTE NO ENTREVEIRO DO CLUBE DOS COROAS!!!!");		
	}else if(h>1200 && h<=1800){
		printf("\nParab�ns!! Voc� acaba de ganhar R$300,00 de gratifica��o de Natal.\nCONSELHO:GASTE NO ENTREVEIRO DO CLUBE DOS COROAS!!!!");
	}else if(h>1800 && h<=2400){
		printf("\nParab�ns!! Voc� acaba de ganhar R$400,00 de gratifica��o de Natal.\nCONSELHO:GASTE NO ENTREVEIRO DO CLUBE DOS COROAS!!!!");
	}else if(h>2400){
		printf("\nParab�ns!! Voc� acaba de ganhar R$500,00 de gratifica��o de Natal.\nCONSELHO:GASTE NO ENTREVEIRO DO CLUBE DOS COROAS!!!!");
	}
	return 0;	
}
