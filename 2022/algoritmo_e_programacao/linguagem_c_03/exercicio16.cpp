#include <stdio.h>
#include <locale.h>
//***Prot�tipos de Fun��es**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	float produto,codigo,desconto;
	cabecalho();
	printf("\nDigite o pre�o atual do produto:\nR$");
	scanf("%f%*c",&produto);
	printf("\nDigite o c�digo do produto:\n");
	scanf("%f%*c",&codigo);
	if(produto<30){
		printf("\nSeu produto n�o atingiu o valor de desconto\n");
		printf("\nC�digo do produto:.....................%.f",codigo);
		printf("\nValor de desconto:.....................R$%.2f",desconto);	
		printf("\nValor de desconto:.....................R$%.2f",produto);
			
	}else if(produto>=30 && produto<=100){
		desconto=produto*10/100;
		produto=produto-desconto;
		printf("\nSeu produto atingiu o valor de desconto\n");
		printf("\nC�digo do produto:.....................%.f",codigo);
		printf("\nValor de desconto:.....................R$%.2f",desconto);	
		printf("\nValor de desconto:.....................R$%.2f",produto);	
		
	}else if(produto>100){
		desconto=produto*15/100;
		produto=produto-desconto;
		printf("\nSeu produto atingiu o valor de desconto\n");
		printf("\nC�digo do produto:.....................%.f",codigo);
		printf("\nValor de desconto:.....................R$%.2f",desconto);	
		printf("\nValor de desconto:.....................R$%.2f",produto);		
	}
	return 0;
}
//***FUN��O CABE�ALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("******DESCONTO EM PRODUTOS*****\n");
	printf("*******************************\n");
}
