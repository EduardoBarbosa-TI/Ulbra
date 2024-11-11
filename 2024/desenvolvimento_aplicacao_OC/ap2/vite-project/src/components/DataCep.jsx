import { useState } from "react";
import { useFetch } from "../hooks/useFetch";

export function DataCep() {
    const [number, setNumber] = useState(0);
    const [cep, setCep] = useState("91450271");
    const [data] = useFetch(`https://viacep.com.br/ws/${cep}/json/`);
    const [isVisible, setIsVisible] = useState(true);

    const toggleVisibility = () => {
        setIsVisible(!isVisible);
    };

    return (
        <div>
            <button onClick={toggleVisibility}>
                Localização
            </button>

            {isVisible && (
                <div id="div-data-cep">
                    <div>
                        <h3>CEP - {data.cep}</h3>
                        <h3>Bairro - {data.bairro}</h3>
                    </div>
                    <div>
                        <h3>Cidade - {data.localidade}</h3>
                        <h3>AV/RUA: Jaguatirica</h3>
                    </div>
                    <div>
                        <h3>Horário: 17:30</h3>
                    </div>
                </div>
            )}
        </div>
    );
}
