import { useEffect, useState } from "react";

export const useFetch = (url) => {
    const [data, setData] = useState({});

    async function getDataCep() {
        const dataJson = await fetch(url);
        const cep = await dataJson.json();

        setData(() => cep);
    }

    useEffect(() => {
        getDataCep();
    }, [url]);


    return [data];
}
