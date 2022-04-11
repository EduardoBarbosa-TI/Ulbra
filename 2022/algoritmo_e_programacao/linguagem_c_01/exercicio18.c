#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float peso_saco,racao_gato1,racao_gato2,racao_duracao,consumo_gatos;
	
	printf("Digite o peso em Kg do saco de ração:\n");
	scanf("%f%*c", &peso_saco);
	
	printf("Digite a quantidade de ração para o primeiro gato:\n");
	scanf("%f%*c", &racao_gato1);
	
	printf("Digite a quantidade de ração para o segundo gato:\n");
	scanf("%f%*c", &racao_gato2);
	
	racao_gato1=racao_gato1/1000;
	racao_gato2=racao_gato/1000;
	consumo_gatos=racao_gato1+racao_gato2;
	racao_duracao=peso_saco-5*consumo_gatos;
	
	printf("Nos últimos cinco primeiros dias os seus gatos consumiram:\n%.fg", consumo_gatos);
	
return 0;	
}
