#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int i;
	float a,b,c;
	printf("Digite um valor de 1 a 3:\n");
	scanf("%i%*c",&i);
	if(i==1){
		printf("Digite o primeiro n�mero:\n");
		scanf("%f%*c",&a);
		printf("Digite o segundo n�mero:\n");
		scanf("%f%*c",&b);
		printf("Digite o terceiro n�mero:\n");
		scanf("%f%*c",&c);	
		if(a>b && a>c){
			if(b>c){
				printf("A ordem crescente �: %.f %.f %.f",a,b,c);
			}else if(c>b){
				printf("A ordem crescente �: %.f %.f %.f",a,c,b);
			}	
		}else if(b>a && b>c){
			if(a>c){
				printf("A ordem crescente �: %.f %.f %.f",b,a,c);
			}else if(c>a){
				printf("A ordem crescente �: %.f %.f %.f",b,c,a);
			}
		}else if(c>a && c>b){
			if(a>b){
				printf("A ordem crescente �: %.f %.f %.f",c,a,b);
			}else if(b>a){
				printf("A ordem crescente �: %.f %.f %.f",c,b,a);
			}
		}	
	}else if(i==2){
		printf("Digite o primeiro n�mero:\n");
		scanf("%f%*c",&a);
		printf("Digite o segundo n�mero:\n");
		scanf("%f%*c",&b);
		printf("Digite o terceiro n�mero:\n");
		scanf("%f%*c",&c);
		if(a<b && a<c){
			if(b<c){
				printf("A ordem decrescente �: %.f %.f %.f",a,b,c);
			}else if(c<b){
				printf("A ordem decrescente �: %.f %.f %.f",a,c,b);
			}	
		}else if(b<a && b<c){
			if(a<c){
				printf("A ordem decrescente �: %.f %.f %.f",b,a,c);
			}else if(c<a){
				printf("A ordem decrescente �: %.f %.f %.f",b,c,a);
			}
		}else if(c<a && c<b){
			if(a<b){
				printf("A ordem decrescente �: %.f %.f %.f",c,a,b);
			}else if(b<a){
				printf("A ordem decrescente �: %.f %.f %.f",c,b,a);
			}
		}		
	}else if(i==3){
		printf("Digite o primeiro n�mero:\n");
		scanf("%f%*c",&a);
		printf("Digite o segundo n�mero:\n");
		scanf("%f%*c",&b);
		printf("Digite o terceiro n�mero:\n");
		scanf("%f%*c",&c);
		if(a>b && a>b){
		printf("\nO primeiro n�mero � o maior");
	}else if(b>a && b>c){
		printf("\nO segundo n�mero � o maior");
	}else if(c>a && c>b){
		printf("\nO terceiro n�mero � maior");	
	}else{
		printf("\nN�meros iguais!!\n Tente novamente!!");
	}}else{
		printf("Valor inv�lido!!\n Digite novamente!!");
	}
	return 0;
  }

