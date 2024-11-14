import React, { useState } from 'react';
import './Form.css';
import { data } from '../../mock/data';

export function Form() {
    const [formData, setFormData] = useState({
        nome: '',
        telefone: '',
        endereco: ''
    });
    const [dataList, setDataList] = useState([]);

    const handleChange = (e) => {
        const { name, value } = e.target;
        setFormData((prevData) => ({
            ...prevData,
            [name]: value
        }));
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        setDataList((prevList) => [...prevList, formData]);
        setFormData({ nome: '', telefone: '', endereco: '' });
        data.push(formData)
    };

    return (
        <div id="form-div">
            <div id="form-divs">
                <h2>Cadastro de Usuário</h2>
                <form onSubmit={handleSubmit}>
                    <div>
                        <label>Nome:</label>
                        <input
                            type="text"
                            name="nome"
                            value={formData.nome}
                            onChange={handleChange}
                        />
                    </div>
                    <div>
                        <label>Telefone:</label>
                        <input
                            type="text"
                            name="telefone"
                            value={formData.telefone}
                            onChange={handleChange}
                        />
                    </div>
                    <div>
                        <label>Endereço:</label>
                        <input
                            type="text"
                            name="endereco"
                            value={formData.endereco}
                            onChange={handleChange}
                        />
                    </div>
                    <button type="submit">Salvar</button>
                </form>
            </div>
        </div>
    );
}
