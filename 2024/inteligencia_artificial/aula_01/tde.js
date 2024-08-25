let input11 = 0, input12 = 0, result01 = 0
let input21 = 0, input22 = 1, result02 = 0
let input31 = 1, input32 = 0, result03 = 1
let input41 = 1, input42 = 1, result04 = 1

let p1 = -1, p2 = -1

let sum, ajustes = 0,quantityAjustesTotais = 0, repeticoes = 0

do {
    ajustes = 0

    sum = somar(input11, input12)
    y = tranferencia(sum)
    if(y != result01){
        ajustar(input11, input12, result01, y)
        ajustes++
        quantityAjustesTotais++
    }

    sum = somar(input21, input22)
    y = tranferencia(sum)
    if(y != result02){
        ajustar(input21, input22, result02, y)
        ajustes++
        quantityAjustesTotais++
    }

    sum = somar(input31, input32)
    y = tranferencia(sum)
    if(y != result03){
        ajustar(input31, input32, result03, y)
        ajustes++
        quantityAjustesTotais++
    }

    sum = somar(input41, input42)
    y = tranferencia(sum)
    if(y != result04){
        ajustar(input41, input42, result04, y)
        ajustes++
        quantityAjustesTotais++
    }

} while (ajustes != 0)

console.log("Teste de aprendizagem com rede neural")
console.log("Peso 01 " + p1);
console.log("Peso 02 " + p2);
console.log("Foram necessarios " + quantityAjustesTotais + " ajustes para treinar a rede neural");


function somar(input01, input02){
    return (input01 * p1) + (input02 * p2)
}

function tranferencia(sum){
    return sum <= 0 ? 0 : 1; 
}

function ajustar(input01, input02, resultEsperado, resultObtido){
    p1 = p1 + 1  * (resultEsperado - resultObtido) * input01
    p2 = p2 + 1  * (resultEsperado - resultObtido) * input02 
}