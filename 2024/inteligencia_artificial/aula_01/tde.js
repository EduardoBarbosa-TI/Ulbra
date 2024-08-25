let input11 = 0, input12 = 0, result01 = 0
let input21 = 0, input22 = 1, result02 = 0
let input31 = 1, input32 = 0, result03 = 1
let input41 = 1, input42 = 1, result04 = 1

let p1 = -1, p2 = -1

let sum, settings = 0,totalQuantityAdjustments = 0, repetitions = 0

do {
    settings = 0

    sum = add(input11, input12)
    y = transfer(sum)
    if(y != result01){
        ajustar(input11, input12, result01, y)
        settings++
        totalQuantityAdjustments++
    }

    sum = add(input21, input22)
    y = transfer(sum)
    if(y != result02){
        adjust(input21, input22, result02, y)
        settings++
        totalQuantityAdjustments++
    }

    sum = add(input31, input32)
    y = transfer(sum)
    if(y != result03){
        adjust(input31, input32, result03, y)
        settings++
        totalQuantityAdjustments++
    }

    sum = add(input41, input42)
    y = transfer(sum)
    if(y != result04){
        adjust(input41, input42, result04, y)
        settings++
        totalQuantityAdjustments++
    }

} while (settings != 0)

console.log("Teste de aprendizagem com rede neural")
console.log("Peso 01 " + p1);
console.log("Peso 02 " + p2);
console.log("Foram necessarios " + totalQuantityAdjustments + " settings para treinar a rede neural");


function add(input01, input02){
    return (input01 * p1) + (input02 * p2)
}

function transfer(sum){
    return sum <= 0 ? 0 : 1; 
}

function adjust(input01, input02, expectedResult, resultObtained){
    p1 = p1 + 1  * (expectedResult - resultObtained) * input01
    p2 = p2 + 1  * (expectedResult - resultObtained) * input02 
}
