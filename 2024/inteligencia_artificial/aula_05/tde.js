const perguntas = [
    {
        pergunta: "É Homem?",
        subElemento: {
            sim: {
                pergunta: "Ele joga futebol?",
                subElemento: {
                    sim: "Neymar",
                    nao: "Ayrton Senna"
                }
            }
        },
    },
    {
        pergunta: "É Mulher?",
        subElemento: {
            sim: {
                pergunta: "Ela é modelo",
                subElemento: {
                    sim: "Gisele Bündchen",
                    nao: {
                        pergunta: "Ela é argentina?",
                        subElemento: {
                            sim: "Alejandra Rodríguez",
                            não: "Cara Delevingne"
                        }
                    }
                }
            }
        },
    },
    {
        pergunta: "É Personagem animado??",
        subElemento: {
            sim: {
                pergunta: "Ele é do Dragon Ball?",
                subElemento: {
                    sim: "Goku",
                    nao: {
                        pergunta: "Ele conhece a raposa de nove caldas?",
                        subElemento: {
                            sim: "Naruto",
                            não: "A caverna do dragão"
                        }
                    }
                }
            }
        },
    },
    {
        pergunta: "É um animal?",
        subElemento: {
            sim: {
                pergunta: "Ele é o melhor amigo do homem?",
                subElemento: {
                    sim: "Cachorro",
                    nao: {
                        pergunta: "Ele tem assas?",
                        subElemento: {
                            sim: "Passáro",
                            não: "Cavalo"
                        }
                    }
                }
            }
        },
    },  
];
   

arrayDeRespostasPossiveis = ["Neymar", "Airton Senna", "Gisele Bunchen", "Margot Robbie", "Goku", "Naruto", "Cachorro", "Vaca"];

//Informa ao usuário para ele pensar em uma das opções válidas
console.log("Pense em uma das opções abaixo para eu tentar adivinhar");
arrayDeRespostasPossiveis.forEach(resposta => {
    console.log(resposta);
});

const { resolve } = require('path');
//motor de inferencia
const readline = require('readline');

const resposta = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

async function fazPergunta(pergunta) {
    return new Promise((resolve) => {
        resposta.question(pergunta, (resposta) => {
            resolve(resposta);
        })
    })
}

async function iniciarPerguntas(perguntas) {
    for(const [key, value] of Object.entries(perguntas)) {
        let resposta = await fazPergunta(value.pergunta + ": 1 para SIM, 2 Para não\n\n");
        if(resposta == 1){
            let resposta = await fazPergunta(value.subElemento.sim.pergunta + ":  1 para SIM, 2 Para não\n\n");

            if(resposta == 1) {
                console.log(value.subElemento.sim.subElemento.sim);
            }
            if(resposta == 2) {
                console.log(value.subElemento.sim.subElemento.nao);
            }
            break;
        }
    }
    resposta.close();
}

iniciarPerguntas(perguntas);