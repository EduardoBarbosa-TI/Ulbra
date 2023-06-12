#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int horasExtra,horasFalta,h;
	printf("Digite o número de horas extras que realizou:\n");
	scanf("%i%*c",&horasExtra);
	printf("\nDigite o número de horas que faltou ao serviço:\n");
	scanf("%i%*c",&horasFalta);
	h=horasExtra-(2/3*horasFalta);
	if(h<=600){
		printf("\nParabéns!! Você acaba de ganhar R$100,00 de gratificação de Natal.\nCONSELHO:GASTE NO ENTREVEIRO DO CLUBE DOS COROAS!!!!");
	}else if(h>600 && h<=1200){
		printf("\nParabéns!! Você acaba de ganhar R$200,00 de gratificação de Natal.\nCONSELHO:GASTE NO ENTREVEIRO DO CLUBE DOS COROAS!!!!");		
	}else if(h>1200 && h<=1800){
		printf("\nParabéns!! Você acaba de ganhar R$300,00 de gratificação de Natal.\nCONSELHO:GASTE NO ENTREVEIRO DO CLUBE DOS COROAS!!!!");
	}else if(h>1800 && h<=2400){
		printf("\nParabéns!! Você acaba de ganhar R$400,00 de gratificação de Natal.\nCONSELHO:GASTE NO ENTREVEIRO DO CLUBE DOS COROAS!!!!");
	}else if(h>2400){
		printf("\nParabéns!! Você acaba de ganhar R$500,00 de gratificação de Natal.\nCONSELHO:GASTE NO ENTREVEIRO DO CLUBE DOS COROAS!!!!");
	}
	return 0;	
}
