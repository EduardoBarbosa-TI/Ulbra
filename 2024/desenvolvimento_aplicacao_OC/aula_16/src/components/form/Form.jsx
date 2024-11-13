import React, { useState } from 'react';
import './Form.css';

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

                <h3>Lista de Usuários</h3>
                <ul>
                    {dataList.map((data, index) => (
                        <li key={index}>
                            {data.nome} - {data.telefone} - {data.endereco}
                        </li>
                    ))}
                </ul>

            </div>
        </div>
    );
}
