#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int n1,n2,n3,n4;
	printf("Digite o primeiro número:\n");
	scanf("%i%*c",&n1);
	printf("Digite o segundo número:\n");
	scanf("%i%*c",&n2);
	printf("Digite o terceiro número:\n");
	scanf("%i%*c",&n3);
	printf("Digite o quarto número:\n");
	scanf("%i%*c",&n4);
	
	if(n1 % 2 == 0){
		printf("\nO primeiro número é divisível por 2");
	}else if(n1 % 3 == 0){
		printf("\nO primeiro número é divisível por 3");
	}else if(n1 % 2 != 0 && n1 % 3 != 0){
		printf("\nO primeiro número não é divisível por 2 e nem por 3");	
	}
	if(n2 % 2 == 0){
		printf("\nO segundo número é divisível por 2");
	}else if(n2 % 3 == 0){
		printf("\nO segundo número é divisível por 3");
	}else if(n2 % 2 != 0 && n2 % 3 != 0){
		printf("\nO segundo número não é divisível por 2 e nem por 3");	
	}
	if(n3 % 2 == 0){
		printf("\nO terceiro número é divisível por 2");
	}else if(n3 % 3 == 0){
		printf("\nO terceiro número é divisível por 3");
	}else if(n3 % 2 != 0 && n3 % 3 != 0){
		printf("\nO terceiro número não é divisível por 2 e nem por 3");	
	}
	if(n4 % 2 == 0){
		printf("\nO quarto número é divisível por 2");
	}else if(n4 % 3 == 0){
		printf("\nO quarto número é divisível por 3");
	}else if(n4 % 2 != 0 && n4 % 3 != 0){
		printf("\nO quarto número não é divisível por 2 e nem por 3");	
	}	
 return 0;		
}
