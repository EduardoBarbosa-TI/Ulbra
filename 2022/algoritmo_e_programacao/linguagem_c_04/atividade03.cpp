#include <stdio.h>
#include <locale.h>
int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float n1,n2;
	
	
	printf("Digite o primeiro valor:\n");
	scanf("%f%*c", &n1);
	printf("Digite o segundo valor:\n");
	scanf("%f%*c", &n2);
	
	if(n1>n2){
		n1=n1-n2;
		printf("\nO primeiro n�mero � o maior\nA diferen�a de valor �: %.f", n1);
	}
	else if(n2>n1){
		n2=n2-n1;
		printf("\nO segundo n�mero � o maior\nA diferen�a de valor �: %.f", n2);	
	}else{
		printf("Os n�meros s�o iguais!!\nDigite novamente!!");
	}
	return 0;   
}
