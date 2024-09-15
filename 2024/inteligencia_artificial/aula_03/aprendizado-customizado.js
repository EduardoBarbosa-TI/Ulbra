class Neuronio {
    constructor(numeroEntradas){
        this.numeroEntradas = numeroEntradas 
        this.pesos = []

        for(let i = 0; i < numeroEntradas; i++){
            this.pesos.push(Math.random());
        }
        this.bias = Math.random();
        this.taxaAprendizagem = 0.1;
    }

    somar(entrada){
        let somaPonderada = this.bias;
        for(let i = 0; i < this.numeroEntradas; i++){
            somaPonderada += entrada[i] * this.pesos[i]
        }
        return somaPonderada;
    }

    ativacao(valor){
        return valor < 0 ? 0 : 1;
    }

    processar(entrada){
        let resultadoSoma = this.somar(entrada);
        let saida = this.ativacao(resultadoSoma)
        return saida
    }

    ajustar(erro, entrada){
        for (let i = 0; i < this.numeroEntradas; i++) {
            this.pesos[i] += erro * entrada[i] * this.taxaAprendizagem; 
        }
        this.bias += erro * this.taxaAprendizagem;
    }

    treinarRede(arrayTreinamento){
        let ajusteNecessarios = true;

        while(ajusteNecessarios) {
            ajusteNecessarios = false;

            for (let i = 0; i < arrayTreinamento.length; i++) {
               const entrada = arrayTreinamento[i].entrada;
               const resultadoEsperado = arrayTreinamento[i].resultadoEsperado;
               const resultadoObtido = this.processar(entrada);
               const erro = resultadoEsperado - resultadoObtido

               if(erro !== 0){
                ajusteNecessarios = true;
                this.ajustar(erro,entrada);
               }
            }
        }
    }
}

const arrayTreinamento = [   
    { entrada: [0,0,0], resultadoEsperado: 0}, //Laranja - Citrico    
    { entrada: [0,0,1], resultadoEsperado: 0}, //Abacaxi - Citrico
    { entrada: [0,1,0], resultadoEsperado: 0}, //Morango - Citrico
    { entrada: [0,1,1], resultadoEsperado: 0}, //Kiwi - Citrico
    { entrada: [1,0,0], resultadoEsperado: 1}, //Mamão - Doce
    { entrada: [1,0,1], resultadoEsperado: 1}, //Mamão - Doce
    { entrada: [1,1,0], resultadoEsperado: 1}, //Mamão - Doce
    { entrada: [1,1,1], resultadoEsperado: 1}, //Mamão - Doce
]

neuronio = new Neuronio(3);
neuronio.treinarRede(arrayTreinamento);

let resultado = neuronio.processar([0,1,1]);

let resultadoArray = ["Citrico", "doce"];

console.log("A fruta informada é " + resultadoArray[resultado]);