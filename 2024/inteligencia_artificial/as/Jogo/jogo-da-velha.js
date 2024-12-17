const prompt = require("prompt-sync")();

function inicializarTabuleiro() {
    return [" ", " ", " ", " ", " ", " ", " ", " ", " "];
}

function mostrarTabuleiro(tabuleiro) {
    console.clear();
    console.log(`${tabuleiro[0]} | ${tabuleiro[1]} | ${tabuleiro[2]}`);
    console.log("--+---+--");
    console.log(`${tabuleiro[3]} | ${tabuleiro[4]} | ${tabuleiro[5]}`);
    console.log("--+---+--");
    console.log(`${tabuleiro[6]} | ${tabuleiro[7]} | ${tabuleiro[8]}`);
}

function checarVitoria(tabuleiro, jogador) {
    const combinacoesVitoria = [
        [0, 1, 2], [3, 4, 5], [6, 7, 8],
        [0, 3, 6], [1, 4, 7], [2, 5, 8],
        [0, 4, 8], [2, 4, 6]
    ];
    return combinacoesVitoria.some(combinacao =>
        combinacao.every(indice => tabuleiro[indice] === jogador)
    );
}

function movimentosRestantes(tabuleiro) {
    return tabuleiro.some(celula => celula === " ");
}

function tabuleiroParaChave(tabuleiro) {
    return tabuleiro.join("");
}

function avaliarEstado(tabuleiro) {
    let score = 0;

    const linhas = [
        [0, 1, 2], [3, 4, 5], [6, 7, 8],
        [0, 3, 6], [1, 4, 7], [2, 5, 8],
        [0, 4, 8], [2, 4, 6]
    ];

    linhas.forEach(linha => {
        let [a, b, c] = linha;

        if (tabuleiro[a] === "X" && tabuleiro[b] === "X" && tabuleiro[c] === " ") score += 10;
        if (tabuleiro[a] === "O" && tabuleiro[b] === "O" && tabuleiro[c] === " ") score -= 10;
    });

    return score
}

function movimentosOrdenados(tabuleiro) {
    const ordemPrioritaria = [4, 0, 2, 6, 8, 1, 3, 5, 7];
    return ordemPrioritaria.filter(i => tabuleiro[i] === " ");
}

const cache = new Map();
const PROFUNDIDADE_MAX = 6;

function minimax(tabuleiro, profundidade, isMaximizing, alpha, beta) {
    const chave = tabuleiroParaChave(tabuleiro);
    if (cache.has(chave)) return cache.get(chave);

    if (checarVitoria(tabuleiro, "X")) return 10 - profundidade;
    if (checarVitoria(tabuleiro, "O")) return profundidade - 10;
    if (!movimentosRestantes(tabuleiro) || profundidade >= PROFUNDIDADE_MAX) {
        return avaliarEstado(tabuleiro);
    }

    let melhorValor = isMaximizing ? -Infinity : Infinity;

    for (let i of movimentosOrdenados(tabuleiro)) {
        tabuleiro[i] = isMaximizing ? "X" : "O";
        const valor = minimax(tabuleiro, profundidade + 1, !isMaximizing, alpha, beta);

        tabuleiro[i] = " ";
        melhorValor = isMaximizing
            ? Math.max(melhorValor, valor) 
            : Math.min(melhorValor, valor);

        if (isMaximizing) alpha = Math.max(alpha, melhorValor);
        else beta = Math.min(beta, melhorValor);

        if (beta <= alpha) break;
    }

    cache.set(chave, melhorValor);
    return melhorValor;
}

function melhorMovimento(tabuleiro) {
    let melhorValor = -Infinity;
    let movimento = -1;

    for (let i of movimentosOrdenados(tabuleiro)) {
        tabuleiro[i] = "X";
        const valor = minimax(tabuleiro, 0, false, -Infinity, Infinity);
        tabuleiro[i] = " ";
        if (valor > melhorValor) {
            melhorValor = valor;
            movimento = i;
        }
    }
    return movimento;
}

function jogarContraIA() {
    let tabuleiro = inicializarTabuleiro();
    console.log("Você é o 'O' e a IA é 'X'");
    mostrarTabuleiro(tabuleiro);

    const movimentoIA = melhorMovimento(tabuleiro);
    tabuleiro[movimentoIA] = "X";

    while (true) {
        mostrarTabuleiro(tabuleiro);

        if (!movimentosRestantes(tabuleiro)) {
            console.log("Empate!");
            break;
        }

        let movimentoJogador = parseInt(prompt("Escolha sua posição de 0 a 8: "));
        while (isNaN(movimentoJogador) || movimentoJogador < 0 || movimentoJogador > 8 || tabuleiro[movimentoJogador] !== " ") {
            console.log("Movimento inválido! Tente novamente. ");
            movimentoJogador = parseInt(prompt("Escolha sua posição de 0 a 8: "));  
        }
        tabuleiro[movimentoJogador] = "O";

        if (checarVitoria(tabuleiro, "O")) {
            mostrarTabuleiro(tabuleiro);
            console.log("Você Venceu");
            break;
        }

        const movimentoIA = melhorMovimento(tabuleiro);
        tabuleiro[movimentoIA] = "X";
        if (checarVitoria(tabuleiro, "X")) {
            mostrarTabuleiro(tabuleiro);
            console.log("A IA Venceu");
            break;
        }
    }
}

jogarContraIA();