#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int n1,n2,n3,n4;
	printf("Digite o primeiro n�mero:\n");
	scanf("%i%*c",&n1);
	printf("Digite o segundo n�mero:\n");
	scanf("%i%*c",&n2);
	printf("Digite o terceiro n�mero:\n");
	scanf("%i%*c",&n3);
	printf("Digite o quarto n�mero:\n");
	scanf("%i%*c",&n4);
	
	if(n1 % 2 == 0){
		printf("\nO primeiro n�mero � divis�vel por 2");
	}else if(n1 % 3 == 0){
		printf("\nO primeiro n�mero � divis�vel por 3");
	}else if(n1 % 2 != 0 && n1 % 3 != 0){
		printf("\nO primeiro n�mero n�o � divis�vel por 2 e nem por 3");	
	}
	if(n2 % 2 == 0){
		printf("\nO segundo n�mero � divis�vel por 2");
	}else if(n2 % 3 == 0){
		printf("\nO segundo n�mero � divis�vel por 3");
	}else if(n2 % 2 != 0 && n2 % 3 != 0){
		printf("\nO segundo n�mero n�o � divis�vel por 2 e nem por 3");	
	}
	if(n3 % 2 == 0){
		printf("\nO terceiro n�mero � divis�vel por 2");
	}else if(n3 % 3 == 0){
		printf("\nO terceiro n�mero � divis�vel por 3");
	}else if(n3 % 2 != 0 && n3 % 3 != 0){
		printf("\nO terceiro n�mero n�o � divis�vel por 2 e nem por 3");	
	}
	if(n4 % 2 == 0){
		printf("\nO quarto n�mero � divis�vel por 2");
	}else if(n4 % 3 == 0){
		printf("\nO quarto n�mero � divis�vel por 3");
	}else if(n4 % 2 != 0 && n4 % 3 != 0){
		printf("\nO quarto n�mero n�o � divis�vel por 2 e nem por 3");	
	}	
 return 0;		
}
