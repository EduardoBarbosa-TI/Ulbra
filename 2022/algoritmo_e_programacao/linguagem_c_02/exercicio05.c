#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	float number_1,number_2,number_3,number_4;
	
	printf("Digite três números em ordem crescente:\n");
	scanf("%f%*c%f%*c%f%*c", &number_1,&number_2,&number_3);
	if(number_1<number_2 && number_1<number_3){
		if(number_2<number_3){
		  printf("Digite um número qualquer:\n");
	      scanf("%f%*c", &number_4);
	    }else if(number_4 > number_3){
		     printf("\nA ordem descrecente dos números digitados:\n%.f\n%.f\n%.f\n%.f",number_4,number_3,number_2, number_1);	
        }else if(number_4<number_3){
	         printf("\nA ordem descrecente dos números digitados:\n%.f\n%.f\n%.f\n%.f",number_3,number_4,number_2, number_1);
        }else if(number_4<number_2){
	         printf("\nA ordem descrecente dos números digitados:\n%.f\n%.f\n%.f\n%.f",number_3,number_2,number_4, number_1);	
        }else if(number_4<number_1){
             printf("\nA ordem descrecente dos números digitados:\n%.f\n%.f\n%.f\n%.f",number_3,number_2,number_1, number_4);
        }    
    }else{
		printf("Números inválidos.\nDigite novamente em ordem CRESCENTE.");}
	
			
   return 0;
   }
