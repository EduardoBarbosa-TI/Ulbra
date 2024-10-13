let perguntas = [
    {
        identificador: "verificar-imovel-disponivel",
        pergunta: "O imóvel está disponível para visitação ou análise?",
        categoria: "disponibilidade",
        respostas: [
            {
                respostaPossivel: "Sim",
                redireciona: "tipo-imovel"
            },
            {
                respostaPossivel: "Não",
                resposta: "A visita ao imóvel é necessária para uma avaliação mais precisa. Tente agendar uma visita."
            },
            {
                respostaPossivel: "Não sei/Não tenho certeza",
                redireciona: "sabe-consultar-disponibilidade"
            }
        ]
    },
    {
        identificador: "sabe-consultar-disponibilidade",
        pergunta: "Você sabe como consultar a disponibilidade do imóvel?",
        categoria: "informação",
        respostas: [
            {
                respostaPossivel: "Sim",
                redireciona: "tipo-imovel",
                resposta: "Ótimo! Verifique a disponibilidade e, se o imóvel estiver acessível, prossiga com a análise."
            },
            {
                respostaPossivel: "Não",
                resposta: "Você pode consultar a disponibilidade diretamente com o proprietário ou a imobiliária responsável."
            }
        ]
    },
    {
        identificador: "tipo-imovel",
        pergunta: "Qual o tipo de imóvel?",
        categoria: "característica",
        respostas: [
            {
                respostaPossivel: "Apartamento",
                redireciona: "verificar-localizacao"
            },
            {
                respostaPossivel: "Casa",
                redireciona: "verificar-localizacao"
            },
            {
                respostaPossivel: "Comercial",
                redireciona: "verificar-localizacao"
            }
        ]
    },
    {
        identificador: "verificar-localizacao",
        pergunta: "O imóvel está localizado em uma área urbana?",
        categoria: "localização",
        respostas: [
            {
                respostaPossivel: "Sim",
                redireciona: "verificar-condicao-imovel"
            },
            {
                respostaPossivel: "Não",
                resposta: "Áreas rurais podem ter menos infraestrutura. Verifique a proximidade de serviços essenciais."
            }
        ]
    },
    {
        identificador: "verificar-condicao-imovel",
        pergunta: "O imóvel está em boas condições de conservação?",
        categoria: "condição",
        respostas: [
            {
                respostaPossivel: "Sim",
                diagnostico: "Imóvel em boas condições.",
                redireciona: "fim"
            },
            {
                respostaPossivel: "Não",
                diagnostico: "Imóvel precisa de reformas.",
                redireciona: "fim"
            },
            {
                respostaPossivel: "Não sei",
                resposta: "Uma avaliação técnica pode ser necessária para verificar as condições do imóvel."
            }
        ]
    }
];


diagnostico = [];
const readline = require('readline');
const respostaInterface = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

async function fazPergunta(pergunta) {
    return new Promise((resolve) => {
        respostaInterface.question(pergunta, (resposta) => {
            resolve(resposta);
        })
    })
}

Object.prototype.hasOwnProperty = function(property) {
    return this[property] !== undefined;
};


// Motor de inferência
async function processNode(node) {
    if (node.hasOwnProperty('categoria')) {
        console.log("\nCategoria: " + node.categoria);
    }

    let opcoes = "\n";
    for (let index = 0; index < node.respostas.length; index++) {
        opcoes += index + " - " + node.respostas[index].respostaPossivel + "\n";
    }
    let respostaEscolhida = await fazPergunta(node.pergunta + opcoes);

    if(node.respostas[respostaEscolhida].hasOwnProperty('diagnostico'))
    {
        diagnostico.push(node.respostas[respostaEscolhida].diagnostico);
    }


    if (node.respostas[respostaEscolhida].hasOwnProperty('resposta')) {
        console.log(node.respostas[respostaEscolhida].resposta);
        return false;
    }

    if (node.respostas[respostaEscolhida].hasOwnProperty('redireciona'))
    {
        let identificador = node.respostas[respostaEscolhida].redireciona;
        if(identificador === 'fim') {
            return false;
        }
        var otherNode = perguntas.find(item => item.identificador == identificador);
        return await processNode(otherNode);
    }
}

async function iniciarPerguntas(perguntas) {
    await processNode(perguntas[0]);
    respostaInterface.close();

    if(diagnostico.length > 0) {
        console.log("Conclusões sobre o imóvel:");
        for (let index = 0; index < diagnostico.length; index++) {
            console.log(diagnostico[index] + "\n");
        }
    }else {
        console.log("Nenhuma conclusão foi identificada.");
    }   
}

iniciarPerguntas(perguntas);