#include <stdio.h>
#include  <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	char resp;
	int idade,op;
	printf("\nDigite a sua idade:\n");
	scanf("%i%*c",&idade);
	printf("\nVocê sabe:");
	printf("\n1. Ler");
	printf("\n2. Escrever");
	printf("\n3. Ambos");
	printf("\n4. Nenhum");
	printf("\nDigite a opção: ");
	scanf("%i%*c",&op);
	if( op>=1 && op<=4  ){
	    if(idade>=18 && idade<70){
		    printf("\nFaça seu título de eleitor\nVocê é obrigado a votar!!\nCaso contrário acarretará em multa!!");
	    }else if(idade>=16 && idade<18){
		    printf("\nVocê pode optar em fazer seu título de eleitor e participar das eleições.");
	    }else if(idade>=70){
		    printf("\nVocê pode optar em fazer seu título de eleitor e participar das eleições.");
	    }else if(op==4 && idade>=16){
	    	printf("\nVocê pode optar em fazer seu título de eleitor e participar das eleições.");
		}else if(idade<16){
			printf("\nVocê não tem idade para participar das eleições!");
		}
	}else{
		printf("\nCOMANDO INVÁLIDO!!\nDIGITE NOVAMENTE!!");
	}
	return 0;
} 
