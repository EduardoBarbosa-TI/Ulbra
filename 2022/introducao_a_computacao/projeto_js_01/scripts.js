//Sem função

var numero=100;
console.log(`O valor de número é ${numero} e o tipo é ${typeof(numero)}`);

var texto="aqui é um texto";
console.log(`O valor de texto é ${texto} e o tipo é ${typeof(texto)}`);

var logico=true;
console.log(`O valor da variável é ${logico} e o tipo é ${typeof(logico)}`);


//Com função
var numero=100;
imprimir(numero);

var texto="aqui é um texto";
imprimir(texto);

var logico=true;
imprimir(logico);


function imprimir(valor){
    console.log(`O valor da variável é ${valor} e o tipo é ${typeof(valor)}`);
    
}

//Atividade 05
var n1 = 5;
var n2 = 7;
var n3 = 8.5;

var result = (n1 + n2 + n3) /3;
console.log("a média é " + result);

//Atividade 07
var ap1=2.0
var ap2=1.5
var as=5


function alunoAprovado(ap1,ap2,as){
    let media = ap1+ap2+as;
    //if binário
    if(media >=7){
        return "O aluno está aprovado"
    }   else{
        return "O aluno está reprovado"
    }       
}

function alunoAprovado2(ap1,ap2,as){
    let media = ap1+ap2+as;
    //if ternário
    return (media>=7) ? "aprovado" : "reprovado";    
}


//Informe 3 números e mostre qual é o maior.
function numeroMaior(n1,n2,n3){
    if(n1>n2 && n1>n3)
        console.log(n1 + ' é maior');
    else if(n2>n1 && n2>n3)
        console.log(n2 + ' é maior');
    else if(n3>n1 && n3>n2)
        console.log(n3 + ' é maior');
    else
        console.log("hum... algo de errado não está certo");
    
}