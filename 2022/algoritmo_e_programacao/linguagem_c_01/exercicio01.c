#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
  setlocale(LC_ALL,"Portuguese");
  
  int number1,number2,number3,number4,soma;
  
  printf("Digite um n�mero inteiro\n");
  scanf("%i%*c",&number1);
  printf("Digite outro n�mero inteiro\n");
  scanf("%i%*c",&number2);
  printf("Digite outro n�mero inteiro\n");
  scanf("%i%*c",&number3);
  printf("Digite outro n�mero inteiro\n");
  scanf("%i%*c",&number4);
  soma=number1+number2+number3+number4;
  printf("A soma dos n�meros �:\n%i",soma);

return 0;
}


