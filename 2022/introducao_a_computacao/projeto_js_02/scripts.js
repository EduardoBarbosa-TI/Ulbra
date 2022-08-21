//TESTE DE MESA
/*  i  numero    condicao  result
    0    5         0<=10     0
    1    5         1<=10     5
*/
function tabuada(numero){
    for(let i=0;i<=10;i++){
        console.log(numero + " * " + i + "=" + numero*i);
        console.log(`${numero} * ${i} = ${numero*i}`);
    }
}

//arrays
var carros= ['gm', 'bmw', 'fiat'];
console.log(carros);
console.log(carros[1]);
for (let index = 0; index < carros.length; index++) {
    console.log(carros[index]);
    
}

