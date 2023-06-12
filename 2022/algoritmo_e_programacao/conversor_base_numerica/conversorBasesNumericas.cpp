#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>
//**************Prototipo de Fun��o**********************************************
int menu();
void baseBinaria();
void baseOctal();

//**************Fun��o Principal**********************************************
int main(){
	setlocale(LC_ALL,"");
	int base,number;
	int opcao;
	int menu();
	do{
		opcao=menu();
		switch(opcao){
			case 1:
			    baseBinaria();
				break;
			case 2:
				baseOctal();
				break;
		 
	
	    }
	}while(opcao!=0);
	
}
//**************Fun��o Menu**********************************************
int menu(){
	int op;
	printf("\n*********************************************");
	printf("\n********CONVERSOR DE BASES NUM�RICAS*********");
	printf("\n*********************************************");
	printf("\n1. Converter para Bin�rio");
	printf("\n2. Converter para Octal");
	printf("\n3. Converter para Decimal");
	printf("\n4. Converter para Hexadecimal");
	printf("\n0. Sair");
	printf("\nDigite a op��o: ");
	scanf("%i%*c",&op);
	return op;	
}
//**************Fun��o Base Bin�ria**********************************************
void baseBinaria(){
    	int n,resto,a,base;
	    char caracteres[]={"0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
        char resultado[ 100 ];
        system("cls");
		printf("\n*********************************************");
	    printf("\n***********CONVERSOR BASE BIN�RIA************");
	    printf("\n*********************************************");
				
		printf("\nDigite o n�mero para convers�o:\n");
        scanf("%d",&n);
        printf("\nA base do n�mero:\n");
        scanf("%d",&base);
        if(base==8){
        	a=n;
            for(int i=0;a!=0;i++){
        	    resto=a%2;
            	resultado[i] = caracteres[resto];
                a-=resto;
            	a/=2;
		    }
		    printf("O n�mero %d convertido para Bin�rio: ",n);
		    for(int i=strlen(resultado); i>=0; i--){
			    printf("%o",resultado[i]);
		    }
        	
		}else if(base==10){
			a=n;
            for(int i=0;a!=0;i++){
        	    resto=a%2;
            	resultado[i] = caracteres[resto];
                a-=resto;
            	a/=2;
		    }
		    printf("O n�mero %d convertido para Bin�rio: ",n);
		    for(int i=strlen(resultado); i>=0; i--){
			    printf("%c",resultado[i]);
		    }
	    }		    
}
//**************Fun��o Base Octal**********************************************
void baseOctal(){
	    int n;
		printf("\n*********************************************");
	    printf("\n***********CONVERSOR BASE BIN�RIA************");
	    printf("\n*********************************************");
	    printf("\nDigite o n�mero para convers�o:\n");
        scanf("%d",&n);
       	printf("O n�mero %d convertido para OCTAL: %o",n,n);	
}
	


