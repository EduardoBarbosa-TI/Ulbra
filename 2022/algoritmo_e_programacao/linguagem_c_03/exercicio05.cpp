#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int n1,n2,op;
    int media,multiplica,divide;
	printf("Digite o primeiro n�mero:\n");
	scanf("%i%*c",&n1);
	printf("Digite o segundo n�mero:\n");
	scanf("%i%*c",&n2);
	printf("\n\n*********************\n");
	printf("******OPERA��O*******\n");
	printf("*********************\n");
	printf("1. M�dia entre os n�meros\n");
	printf("2. Diferen�a do maior pelo menor\n");
	printf("3. Produto entre os n�meros\n");
	printf("4. Divis�o do primeiro pelo segundo\n");
	printf("Digite a op��o:");
	scanf("%i%*c",&op);
		switch(op){
			case 1:
				media=(n1+n2)/2;
				printf("\nA m�dia dos n�meros digitados � %i",media);
				break;
			case 2:
				if(n1>n2){
					n1=n1-n2;
					printf("\nO primeiro n�mero digitado � maior, a diferen�a entre os n�meros �: %i",n1);	
				}else if(n2>n1 ){
					n2=n2-n1;
					printf("\nO segundo n�mero digitado � maior, a diferen�a entre os n�meros �: %i",n2);
				}else if(n1==n2){
					printf("\nOs n�meros digitados s�o iguais");
				}
				break;
			case 3:
				multiplica=n1*n2;
				printf("\nO resultado dos n�meros digitado �: %i",multiplica);				
				break;
			case 4:
				if(n2 !=0){
					divide=n1-n2;
					printf("\nO resultado dos n�meros digitados �: %i",divide);
				}else{
					printf("\nO segundo n�mero digitado tem que ser diferente de zero:\nTente novamente!!");
				}
				break;	
		}
	return 0;
}
