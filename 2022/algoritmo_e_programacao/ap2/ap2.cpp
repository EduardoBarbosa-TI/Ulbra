#include <stdio.h>
#include  <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	char resp;
	int idade,op;
	printf("\nDigite a sua idade:\n");
	scanf("%i%*c",&idade);
	printf("\nVoc� sabe:");
	printf("\n1. Ler");
	printf("\n2. Escrever");
	printf("\n3. Ambos");
	printf("\n4. Nenhum");
	printf("\nDigite a op��o: ");
	scanf("%i%*c",&op);
	if( op>=1 && op<=4  ){
	    if(idade>=18 && idade<70){
		    printf("\nFa�a seu t�tulo de eleitor\nVoc� � obrigado a votar!!\nCaso contr�rio acarretar� em multa!!");
	    }else if(idade>=16 && idade<18){
		    printf("\nVoc� pode optar em fazer seu t�tulo de eleitor e participar das elei��es.");
	    }else if(idade>=70){
		    printf("\nVoc� pode optar em fazer seu t�tulo de eleitor e participar das elei��es.");
	    }else if(op==4 && idade>=16){
	    	printf("\nVoc� pode optar em fazer seu t�tulo de eleitor e participar das elei��es.");
		}else if(idade<16){
			printf("\nVoc� n�o tem idade para participar das elei��es!");
		}
	}else{
		printf("\nCOMANDO INV�LIDO!!\nDIGITE NOVAMENTE!!");
	}
	return 0;
} 
