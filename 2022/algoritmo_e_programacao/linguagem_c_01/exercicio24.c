#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
//***Protótipos de Funções**********************************************************************
void cabecalho();
int main(){
	setlocale(LC_ALL,"Portuguese");
	char situacao;
	int op;
	float valor,novoValor,categoria,aumento,imposto;
	cabecalho();
	do{
		printf("\n1. Comprar produto");
		printf("\n0. Sair");
		printf("\nDigite a opção: ");
		scanf("%i%*c",&op);
		switch(op){
			case 1:
				printf("\nDigite o preço do produto:\nR$");
	            scanf("%f%*c",&valor);
	            printf("\n\n**CATEGORIA DE PRODUTOS**:");
	            printf("\n1. Limpeza");
	            printf("\n2. Alimentação");
	            printf("\n3. Vestuário");
	            printf("\nDigite a categoria do produto: ");
	            scanf("%f%*c",&categoria);
	            system("cls");
				cabecalho();
	            if(valor<=25 && categoria ==1){	
	                aumento=valor*5/100;
	                novoValor=valor+aumento;
	                system("cls");
				    cabecalho();	
	                if(novoValor <= 50){
	                    printf("\n**CARRINHO FINALIZADO**");
					    printf("\nValor do aumento...............R$%.2f",aumento);
				    	printf("\nValor do imposto...............R$%.2f",imposto);
				    	printf("\nNovo preço.....................R$%.2f",novoValor);
				    	printf("\nClassificação..................Barato\n");
				    	system("pause");
				        system("cls");
				        cabecalho();
				    }else if(novoValor>50 && novoValor<120){
					    printf("\n**CARRINHO FINALIZADO**");
					    printf("\nValor do aumento...............R$%.2f",aumento);
				     	printf("\nValor do imposto...............R$%.2f",imposto);
				    	printf("\nNovo preço.....................R$%.2f",novoValor);
				    	printf("\nClassificação..................Normal\n");
				    	system("pause");
				        system("cls");
				        cabecalho();
				    }else if(novoValor>=120){
				    	printf("\n**CARRINHO FINALIZADO**");
				    	printf("\nValor do aumento...............R$%.2f",aumento);
				    	printf("\nValor do imposto...............R$%.2f",imposto);
				    	printf("\nNovo preço.....................R$%.2f",novoValor);
				    	printf("\nClassificação..................Normal\n");
				    	system("pause");
				        system("cls");
				        cabecalho();}
	            }else if(valor>25 && categoria ==1){
	            	aumento=valor*12/100;
	                novoValor=valor+aumento;
                    system("cls");
				    cabecalho();		
	                if(novoValor <= 50){
	                    printf("\n**CARRINHO FINALIZADO**");
					    printf("\nValor do aumento...............R$%.2f",aumento);
				    	printf("\nValor do imposto...............R$%.2f",imposto);
				    	printf("\nNovo preço.....................R$%.2f",novoValor);
				    	printf("\nClassificação..................Barato\n");
				    	system("pause");
				        system("cls");
				        cabecalho();
				    }else if(novoValor>50 && novoValor<120){
					    printf("\n**CARRINHO FINALIZADO**");
					    printf("\nValor do aumento...............R$%.2f",aumento);
				     	printf("\nValor do imposto...............R$%.2f",imposto);
				    	printf("\nNovo preço.....................R$%.2f",novoValor);
				    	printf("\nClassificação..................Normal\n");
				    	system("pause");
				        system("cls");
				        cabecalho();
				    }else if(novoValor>=120){
				    	printf("\n**CARRINHO FINALIZADO**");
				    	printf("\nValor do aumento...............R$%.2f",aumento);
				    	printf("\nValor do imposto...............R$%.2f",imposto);
				    	printf("\nNovo preço.....................R$%.2f",novoValor);
				    	printf("\nClassificação..................Normal\n");
				    	system("pause");
				        system("cls");
				        cabecalho();}
			    }else if(valor<=25 && categoria ==2){
			    	printf("\n\n**SITUAÇÃO DO PRODUTO**");
	                printf("\nR. Produtos que necessitam de refrigeração");
	                printf("\nN. Produtos que não necessitam de refrigeração");
	                printf("\nDigite a situação do produto: ");
	                scanf("%c%*c",&situacao);
				    system("cls");
				    cabecalho();
	                if(situacao =='R' || situacao=='r'){
	                	aumento=valor*8/100;
	                	imposto=valor*8/100;
	                    novoValor=valor+aumento+imposto;		
					    if(novoValor<=50){
					    	printf("\n**CARRINHO FINALIZADO**");
					    	printf("\nValor do aumento...............R$%.2f",aumento);
					    	printf("\nValor do imposto...............R$%.2f",imposto);
					    	printf("\nNovo preço.....................R$%.2f",novoValor);
					    	printf("\nClassificação..................Barato\n");
					    	system("pause");
				            system("cls");
				            cabecalho();  	
						}else if(valor>50 && valor<120){	
							printf("\n**CARRINHO FINALIZADO**");
					    	printf("\nValor do aumento...............R$%.2f",aumento);
					    	printf("\nValor do imposto...............R$%.2f",imposto);
					    	printf("\nNovo preço.....................R$%.2f",novoValor);
					    	printf("\nClassificação..................Normal\n");
					    	system("pause");
				            system("cls");
				            cabecalho();	
						}else if(valor>=120){		
							printf("\n**CARRINHO FINALIZADO**");
					    	printf("\nValor do aumento...............R$%.2f",aumento);
					    	printf("\nValor do imposto...............R$%.2f",imposto);
					    	printf("\nNovo preço.....................R$%.2f",novoValor);
					    	printf("\nClassificação..................Caro\n");
					    	system("pause");
				            system("cls");
				            cabecalho();		
						}	
				    }else if(situacao =='N' || situacao=='n'){
				    	system("cls");
				        cabecalho();
				    	aumento=valor*8/100;
					    imposto=valor*5/100;
				    	novoValor=valor+aumento+imposto;
					    if(valor<=50){	
					    	printf("\n**CARRINHO FINALIZADO**");
					    	printf("\nValor do aumento...............R$%.2f",aumento);
					    	printf("\nValor do imposto...............R$%.2f",imposto);
					    	printf("\nNovo preço.....................R$%.2f",novoValor);
					        printf("\nClassificação..................Barato\n");
					    	system("pause");
				            system("cls");
				            cabecalho();  	
						}else if(valor>50 && valor<120){
							printf("\n**CARRINHO FINALIZADO**");
					    	printf("\nValor do aumento...............R$%.2f",aumento);
					    	printf("\nValor do imposto...............R$%.2f",imposto);
					    	printf("\nNovo preço.....................R$%.2f",novoValor);
					    	printf("\nClassificação..................Normal\n");
					    	system("pause");
				            system("cls");
				            cabecalho();	
						}else if(valor>=120){
							printf("\n**CARRINHO FINALIZADO**");
					    	printf("\nValor do aumento...............R$%.2f",aumento);
					    	printf("\nValor do imposto...............R$%.2f",imposto);
					    	printf("\nNovo preço.....................R$%.2f",novoValor);
					    	printf("\nClassificação..................Caro\n");
					    	system("pause");
				            system("cls");
				            cabecalho();		
						}	
				    }
				}else if(valor>25 && categoria==2){
					printf("\n\n**SITUAÇÃO DO PRODUTO**");
	                printf("\nR. Produtos que necessitam de refrigeração");
	                printf("\nN. Produtos que não necessitam de refrigeração");
	                printf("\nDigite a situação do produto: ");
	                scanf("%c%*c",&situacao);
				    system("cls");
				    cabecalho();
	                if(situacao =='R' || situacao=='r'){
	                	aumento=valor*15/100;
	                	imposto=valor*8/100;
	                    novoValor=valor+aumento+imposto;
					    if(novoValor<=50){
					    	printf("\n**CARRINHO FINALIZADO**");
					    	printf("\nValor do aumento...............R$%.2f",aumento);
					    	printf("\nValor do imposto...............R$%.2f",imposto);
					    	printf("\nNovo preço.....................R$%.2f",novoValor);
					    	printf("\nClassificação..................Barato\n");
					    	system("pause");
				            system("cls");
				            cabecalho();  	
						}else if(valor>50 && valor<120){				
							printf("\n**CARRINHO FINALIZADO**");
					    	printf("\nValor do aumento...............R$%.2f",aumento);
					    	printf("\nValor do imposto...............R$%.2f",imposto);
					    	printf("\nNovo preço.....................R$%.2f",novoValor);
					    	printf("\nClassificação..................Normal\n");
					    	system("pause");
				            system("cls");
				            cabecalho();	
						}else if(valor>=120){
							printf("\n**CARRINHO FINALIZADO**");
					    	printf("\nValor do aumento...............R$%.2f",aumento);
					    	printf("\nValor do imposto...............R$%.2f",imposto);
					    	printf("\nNovo preço.....................R$%.2f",novoValor);
					    	printf("\nClassificação..................Caro\n");
					    	system("pause");
				            system("cls");
				            cabecalho();		
						}	
				    }else if(situacao =='N' || situacao=='n'){
				    	aumento=valor*15/100;
					    imposto=valor*5/100;
				    	novoValor=valor+aumento+imposto;
				    	system("cls");
				        cabecalho();	
					    if(valor<=50){	
					    	printf("\n**CARRINHO FINALIZADO**");
					    	printf("\nValor do aumento...............R$%.2f",aumento);
					    	printf("\nValor do imposto...............R$%.2f",imposto);
					    	printf("\nNovo preço.....................R$%.2f",novoValor);
					        printf("\nClassificação..................Barato\n");
					    	system("pause");
				            system("cls");
				            cabecalho();  	
						}else if(valor>50 && valor<120){
							printf("\n**CARRINHO FINALIZADO**");
					    	printf("\nValor do aumento...............R$%.2f",aumento);
					    	printf("\nValor do imposto...............R$%.2f",imposto);
					    	printf("\nNovo preço.....................R$%.2f",novoValor);
					    	printf("\nClassificação..................Normal\n");
					    	system("pause");
				            system("cls");
				            cabecalho();	
						}else if(valor>=120){
							printf("\n**CARRINHO FINALIZADO**");
					    	printf("\nValor do aumento...............R$%.2f",aumento);
					    	printf("\nValor do imposto...............R$%.2f",imposto);
					    	printf("\nNovo preço.....................R$%.2f",novoValor);
					    	printf("\nClassificação..................Caro\n");
					    	system("pause");
				            system("cls");
				            cabecalho();		
						}	
				    }else if(situacao != 'R' && situacao!='N'){
	                	if(situacao != 'r' && situacao!='n'){
	                	    printf("COMANDO INVÁLIDO!!\nDIGITE NOVAMENTE!!\n");
	                	    system("pause");
				            system("cls");
				            cabecalho();
						}	
			        }					
				}else if(valor<=25 && categoria==3){
					aumento=valor*18/100;
	                novoValor=valor+aumento;
	                system("cls");
				    cabecalho();	
	                if(novoValor <= 50){
	                    printf("\n**CARRINHO FINALIZADO**");
					    printf("\nValor do aumento...............R$%.2f",aumento);
				    	printf("\nValor do imposto...............R$%.2f",imposto);
				    	printf("\nNovo preço.....................R$%.2f",novoValor);
				    	printf("\nClassificação..................Barato\n");
				    	system("pause");
				        system("cls");
				        cabecalho();
				    }else if(novoValor>50 && novoValor<120){
					    printf("\n**CARRINHO FINALIZADO**");
					    printf("\nValor do aumento...............R$%.2f",aumento);
				     	printf("\nValor do imposto...............R$%.2f",imposto);
				    	printf("\nNovo preço.....................R$%.2f",novoValor);
				    	printf("\nClassificação..................Normal\n");
				    	system("pause");
				        system("cls");
				        cabecalho();
				    }else if(novoValor>=120){
				    	printf("\n**CARRINHO FINALIZADO**");
				    	printf("\nValor do aumento...............R$%.2f",aumento);
				    	printf("\nValor do imposto...............R$%.2f",imposto);
				    	printf("\nNovo preço.....................R$%.2f",novoValor);
				    	printf("\nClassificação..................Normal\n");
				    	system("pause");
				        system("cls");
				        cabecalho();}	
				}else if(valor>25 && categoria==3){
					aumento=valor*5/100;
	                novoValor=valor+aumento;
	                system("cls");
				    cabecalho();	
	                if(novoValor <= 50){
	                    printf("\n**CARRINHO FINALIZADO**");
					    printf("\nValor do aumento...............R$%.2f",aumento);
				    	printf("\nValor do imposto...............R$%.2f",imposto);
				    	printf("\nNovo preço.....................R$%.2f",novoValor);
				    	printf("\nClassificação..................Barato\n");
				    	system("pause");
				        system("cls");
				        cabecalho();
				    }else if(novoValor>50 && novoValor<120){
					    printf("\n**CARRINHO FINALIZADO**");
					    printf("\nValor do aumento...............R$%.2f",aumento);
				     	printf("\nValor do imposto...............R$%.2f",imposto);
				    	printf("\nNovo preço.....................R$%.2f",novoValor);
				    	printf("\nClassificação..................Normal\n");
				    	system("pause");
				        system("cls");
				        cabecalho();
				    }else if(novoValor>=120){
				    	printf("\n**CARRINHO FINALIZADO**");
				    	printf("\nValor do aumento...............R$%.2f",aumento);
				    	printf("\nValor do imposto...............R$%.2f",imposto);
				    	printf("\nNovo preço.....................R$%.2f",novoValor);
				    	printf("\nClassificação..................Normal\n");
				    	system("pause");
				        system("cls");
				        cabecalho();}
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
