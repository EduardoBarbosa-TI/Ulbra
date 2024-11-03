const cidades = [
    { x: 0, y: 0 },
    { x: 1, y: 5 },
    { x: 5, y: 2 },
    { x: 6, y: 1 },
    { x: 3, y: 3 },
    { x: 7, y: 6 },
    { x: 2, y: 1 },
    { x: 4, y: 4 },
    { x: 6, y: 3 },
    { x: 5, y: 7 }
];

const tamanhoPopulacao = 500;
const mutationRate = 0.01;
const geracoes = 10;

// Função para calcular a distância entre duas cidades
function calcularDistancia(cidadeA, cidadeB) {
    const dx = cidadeA.x - cidadeB.x;
    const dy = cidadeA.y - cidadeB.y;
    return Math.sqrt(dx * dx + dy * dy);
}

// Função para calcular a aptidão de um indivíduo (rota)
function aptidao(rota) {
    let distanciaTotal = 0;
    for (let i = 0; i < rota.length; i++) {
        const cidadeAtual = cidades[rota[i]];
        const cidadeProxima = cidades[rota[(i + 1) % rota.length]];
        distanciaTotal += calcularDistancia(cidadeAtual, cidadeProxima);
    }
    return distanciaTotal;
}

// Função para criar um novo indivíduo (rota)
function criarIndividuo() {
    const rota = Array.from({ length: cidades.length }, (_, i) => i);
    for (let i = rota.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [rota[i], rota[j]] = [rota[j], rota[i]];
    }
    return rota;
}

// Função para criar a população inicial
function criarPopulacao(tamanho) {
    const populacao = [];
    for (let i = 0; i < tamanho; i++) {
        populacao.push(criarIndividuo());
    }
    return populacao;
}

// Seleção por torneio
function selecao(populacao) {
    const torneio = [];
    for (let i = 0; i < 5; i++) {
        torneio.push(escolhaAleatoria(populacao));
    }
    torneio.sort((a, b) => aptidao(a) - aptidao(b));
    return torneio[0]; // Retorna o melhor indivíduo
}

// Cruzamento com método Order Crossover (OX)
function cruzamento(individuo1, individuo2) {
    const tamanho = individuo1.length;
    const inicio = Math.floor(Math.random() * tamanho);
    const fim = Math.floor(Math.random() * tamanho);
    const [min, max] = inicio < fim ? [inicio, fim] : [fim, inicio];

    const filho = Array.from({ length: tamanho }, () => -1);
    
    // Copia um segmento do primeiro pai
    for (let i = min; i < max; i++) {
        filho[i] = individuo1[i];
    }

    // Preenche o restante com o segundo pai
    let pos = 0;
    for (let i = 0; i < tamanho; i++) {
        const gene = individuo2[(max + i) % tamanho];
        if (!filho.includes(gene)) {
            while (filho[pos] !== -1) {
                pos++;
            }
            filho[pos] = gene;
        }
    }

    return filho;
}

// Função de mutação
function mutacao(individuo) {
    for (let i = 0; i < individuo.length; i++) {
        if (Math.random() < mutationRate) {
            const j = Math.floor(Math.random() * individuo.length);
            [individuo[i], individuo[j]] = [individuo[j], individuo[i]];
        }
    }
    return individuo;
}

function escolhaAleatoria(array) {
    return array[Math.floor(Math.random() * array.length)];
}

// Função principal do algoritmo genético
function algoritmoGenetico() {
    let populacao = criarPopulacao(tamanhoPopulacao);

    for (let geracao = 0; geracao < geracoes; geracao++) {
        populacao.sort((a, b) => aptidao(a) - aptidao(b));

        const melhorIndividuo = populacao[0];
        console.log(`Geração: ${geracao}, Melhor Rota: ${melhorIndividuo}, Distância Total: ${aptidao(melhorIndividuo)}`);

        if (aptidao(melhorIndividuo) === 0) { 
            console.log("Solução encontrada!");
            break;
        }

        // Criar nova população
        const novaPopulacao = [];
        while (novaPopulacao.length < tamanhoPopulacao) {
            const individuo1 = selecao(populacao);
            const individuo2 = selecao(populacao);
            let filho = cruzamento(individuo1, individuo2);
            filho = mutacao(filho);
            novaPopulacao.push(filho);
        }

        populacao = novaPopulacao;
    }
}

algoritmoGenetico();
