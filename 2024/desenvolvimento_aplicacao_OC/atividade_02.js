verifyNumbers([10,20,30,7,5]);

function verifyNumbers(listNumber){
    for(number of listNumber){
        const result = number%2 == 0 ? "Par" : "Ímpar";
        console.log("O número " + number + " é " + result);
    }
}
