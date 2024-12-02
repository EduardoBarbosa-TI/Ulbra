import { useState } from "react";
import { useFetch } from "../../../../aula_12/tde/src/hooks/useFetch";
import "./DataCepPage.css"

function DataCep() {
    const [number, setNumber] = useState(0);
    const [cep, setCep] = useState("95555000"); 
    const [data] = useFetch(`https://viacep.com.br/ws/${cep}/json/`);

    const [cepForm, setCepForm] = useState();

    function handleGetCep() {
        setCep(cepForm);
    }

    return (
        <div id="div-datacep">
            <input type="text" value={cepForm} onChange={(event) => {setCepForm(event.target.value)}} />
            <button onClick={handleGetCep}>Buscar Cep</button>


            <h1>Incremento - {number}</h1>
            <h1>CEP - {data.cep}</h1>
            <h1>Bairro - {data.bairro}</h1>
            <h1>Cidade - {data.localidade}</h1>

            <button onClick={() => setNumber(number + 1)}>Incrementa</button>
            
        </div>
    )
}

export default DataCep