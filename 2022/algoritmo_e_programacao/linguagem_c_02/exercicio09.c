#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

struct rgAgora{
	int day,mon,year;
	int h,m,s;
};


int main(){
	setlocale(LC_ALL,"Portuguese");
	
	time_t currentTime;
	time(&currentTime);
	
	struct tm *myDate =localtime(&currentTime);
	 myDate->tm_mday;
	 myDate->tm_mon+01;
	 myDate->tm_year+1900;
	
	struct tm *myTime =localtime(&currentTime);
	myTime->tm_hour;
	myTime->tm_min;

	printf("Informações Operacionais:\n\n");
	printf("Data atual:");
	
    if(myDate->tm_mday >=1 && myDate->tm_mday < 10){
   	    if( myDate->tm_mon+1 >=1 && myDate->tm_mon+1 <10){
    		printf(" 0%i/0%i/%i",myDate->tm_mday,myDate->tm_mon+1,myDate->tm_year+1900);
		}else if(myDate->tm_mon>9) {
			printf(" 0%i/%i/%i",myDate->tm_mday,myDate->tm_mon+1,myDate->tm_year+1900);
		}else if(myDate->tm_mday>9){
			printf(" %i/0%i/%i",myDate->tm_mday,myDate->tm_mon+1,myDate->tm_year+1900);
		}
   	}
	if(myDate->tm_mon+1 == 1){
		printf(" Janeiro");
	}
	if(myDate->tm_mon+1 == 2){
		printf(" Fevereiro");
	}
	if(myDate->tm_mon+1 == 3){
		printf(" Março");
	}
	if(myDate->tm_mon+1 == 4){
		printf(" Abril");
	}
	if(myDate->tm_mon+1 == 5){
		printf(" Maio");
	}
	if(myDate->tm_mon+1 == 6){
		printf(" Junho");
	}
	if(myDate->tm_mon+1 == 7){
		printf(" Julho");
	}
	if(myDate->tm_mon+1 == 8){
		printf(" Agosto");
	}
	if(myDate->tm_mon+1 == 9){
		printf(" Setembro");
	}
	if(myDate->tm_mon+1 == 10){
		printf(" Outubro");
	}
	if(myDate->tm_mon+1 == 11){
		printf(" Novembro");
	}
	if(myDate->tm_mon+1 == 12){
		printf(" Dezembro");
	}
	printf("\nHora Atual:");
	printf(" %i:%i",myTime->tm_hour,myTime->tm_min);
	
	
	
    return 0;  	
}
