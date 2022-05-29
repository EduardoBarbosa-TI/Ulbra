#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
//***Protótipos de Funções**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	int op,codigo;
	float qtdProduto,preco,valor,desconto,valorFinal;
	cabecalho();
	do{
		printf("\n1. Comprar produto");
		printf("\n0. Sair");
		printf("\nDigite a opção: ");
		scanf("%i%*c",&op);
		switch(op){
			case 1:
				printf("\nDigite o código do produto:\n");
				scanf("%i%*c",&codigo);
				printf("\nDigite a quantidade que deseja comprar:\n");
				scanf("%f%*c",&qtdProduto);
				if(codigo>=1 && codigo<=10){
					preco=10;
					valor=preco*qtdProduto;
					if(valor<=200){
						desconto=valor*5/100;
						valorFinal=valor-desconto;
						printf("\nPreço unitário do produto:...........R$%.2f",preco);
						printf("\nTotal:...............................R$%.2f",valor);
						printf("\nValor do Desconto:...................R$%.2f",desconto);
						printf("\nValor final dos produtos:............R$%.2f\n",valorFinal);
						system("pause");
				        system("cls");
				        cabecalho();	
					}else if(valor>200 && valor<=500){
						desconto=valor*10/100;
						valorFinal=valor-desconto;
						printf("\nPreço unitário do produto:...........R$%.2f",preco);
						printf("\nTotal:...............................R$%.2f",valor);
						printf("\nValor do Desconto:...................R$%.2f",desconto);
						printf("\nValor final dos produtos:............R$%.2f\n",valorFinal);
						system("pause");
				        system("cls");
				        cabecalho();		
					}else if(valor>500){
						desconto=valor*15/100;
						valorFinal=valor-desconto;
						printf("\nPreço unitário do produto:...........R$%.2f",preco);
						printf("\nTotal:...............................R$%.2f",valor);
						printf("\nValor do Desconto:...................R$%.2f",desconto);
						printf("\nValor final dos produtos:............R$%.2f\n",valorFinal);
						system("pause");
				        system("cls");
				        cabecalho();		
					}		
				}else if(codigo>=11 && codigo<=20){
					preco=15;
					valor=preco*qtdProduto;
					if(valor<=200){
						desconto=valor*5/100;
						valorFinal=valor-desconto;
						printf("\nPreço unitário do produto:...........R$%.2f",preco);
						printf("\nTotal:...............................R$%.2f",valor);
						printf("\nValor do Desconto:...................R$%.2f",desconto);
						printf("\nValor final dos produtos:............R$%.2f\n",valorFinal);
						system("pause");
				        system("cls");
				        cabecalho();	
					}else if(valor>200 && valor<=500){
						desconto=valor*10/100;
						valorFinal=valor-desconto;
						printf("\nPreço unitário do produto:...........R$%.2f",preco);
						printf("\nTotal:...............................R$%.2f",valor);
						printf("\nValor do Desconto:...................R$%.2f",desconto);
						printf("\nValor final dos produtos:............R$%.2f\n",valorFinal);
						system("pause");
				        system("cls");
				        cabecalho();		
					}else if(valor>500){
						desconto=valor*15/100;
						valorFinal=valor-desconto;
						printf("\nPreço unitário do produto:...........R$%.2f",preco);
						printf("\nTotal:...............................R$%.2f",valor);
						printf("\nValor do Desconto:...................R$%.2f",desconto);
						printf("\nValor final dos produtos:............R$%.2f\n",valorFinal);
						system("pause");
				        system("cls");
				        cabecalho();		
					}	
				}else if(codigo>=21 && codigo<=30){
					preco=20;
					valor=preco*qtdProduto;
					if(valor<=200){
						desconto=valor*5/100;
						valorFinal=valor-desconto;
						printf("\nPreço unitário do produto:...........R$%.2f",preco);
						printf("\nTotal:...............................R$%.2f",valor);
						printf("\nValor do Desconto:...................R$%.2f",desconto);
						printf("\nValor final dos produtos:............R$%.2f\n",valorFinal);
						system("pause");
				        system("cls");
				        cabecalho();	
					}else if(valor>200 && valor<=500){
						desconto=valor*10/100;
						valorFinal=valor-desconto;
						printf("\nPreço unitário do produto:...........R$%.2f",preco);
						printf("\nTotal:...............................R$%.2f",valor);
						printf("\nValor do Desconto:...................R$%.2f",desconto);
						printf("\nValor final dos produtos:............R$%.2f\n",valorFinal);
						system("pause");
				        system("cls");
				        cabecalho();		
					}else if(valor>500){
						desconto=valor*15/100;
						valorFinal=valor-desconto;
						printf("\nPreço unitário do produto:...........R$%.2f",preco);
						printf("\nTotal:...............................R$%.2f",valor);
						printf("\nValor do Desconto:...................R$%.2f",desconto);
						printf("\nValor final dos produtos:............R$%.2f\n",valorFinal);
						system("pause");
				        system("cls");
				        cabecalho();		
					}
				}else if(codigo>=31 && codigo<=40){
					preco=30;
					valor=preco*qtdProduto;
					if(valor<=200){
						desconto=valor*5/100;
						valorFinal=valor-desconto;
						printf("\nPreço unitário do produto:...........R$%.2f",preco);
						printf("\nTotal:...............................R$%.2f",valor);
						printf("\nValor do Desconto:...................R$%.2f",desconto);
						printf("\nValor final dos produtos:............R$%.2f\n",valorFinal);
						system("pause");
				        system("cls");
				        cabecalho();	
					}else if(valor>200 && valor<=500){
						desconto=valor*10/100;
						valorFinal=valor-desconto;
						printf("\nPreço unitário do produto:...........R$%.2f",preco);
						printf("\nTotal:...............................R$%.2f",valor);
						printf("\nValor do Desconto:...................R$%.2f",desconto);
						printf("\nValor final dos produtos:............R$%.2f\n",valorFinal);
						system("pause");
				        system("cls");
				        cabecalho();		
					}else if(valor>500){
						desconto=valor*15/100;
						valorFinal=valor-desconto;
						printf("\nPreço unitário do produto:...........R$%.2f",preco);
						printf("\nTotal:...............................R$%.2f",valor);
						printf("\nValor do Desconto:...................R$%.2f",desconto);
						printf("\nValor final dos produtos:............R$%.2f\n",valorFinal);
						system("pause");
				        system("cls");
				        cabecalho();		
					}
				}else if(codigo>40){
					printf("\nCódigo de produto não encontrado\nDigite novamente!!\n");
					system("pause");
				    system("cls");
				    cabecalho();	
				}
				break;
		}	
	}while(op!=0);
	return 0;
}
//***FUNÇÂO CABEÇALHO***********************************************************************
void cabecalho(){
	printf("*******************************\n");
	printf("*******CARINHO DE COMPRAS******\n");
	printf("*******************************\n");
}
