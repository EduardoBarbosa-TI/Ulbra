#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	int n1,n2,op;
    int media,multiplica,divide;
	printf("Digite o primeiro número:\n");
	scanf("%i%*c",&n1);
	printf("Digite o segundo número:\n");
	scanf("%i%*c",&n2);
	printf("\n\n*********************\n");
	printf("******OPERAÇÂO*******\n");
	printf("*********************\n");
	printf("1. Média entre os números\n");
	printf("2. Diferença do maior pelo menor\n");
	printf("3. Produto entre os números\n");
	printf("4. Divisão do primeiro pelo segundo\n");
	printf("Digite a opção:");
	scanf("%i%*c",&op);
		switch(op){
			case 1:
				media=(n1+n2)/2;
				printf("\nA média dos números digitados é %i",media);
				break;
			case 2:
				if(n1>n2){
					n1=n1-n2;
					printf("\nO primeiro número digitado é maior, a diferença entre os números é: %i",n1);	
				}else if(n2>n1 ){
					n2=n2-n1;
					printf("\nO segundo número digitado é maior, a diferença entre os números é: %i",n2);
				}else if(n1==n2){
					printf("\nOs números digitados são iguais");
				}
				break;
			case 3:
				multiplica=n1*n2;
				printf("\nO resultado dos números digitado é: %i",multiplica);				
				break;
			case 4:
				if(n2 !=0){
					divide=n1-n2;
					printf("\nO resultado dos números digitados é: %i",divide);
				}else{
					printf("\nO segundo número digitado tem que ser diferente de zero:\nTente novamente!!");
				}
				break;	
		}
	return 0;
}
