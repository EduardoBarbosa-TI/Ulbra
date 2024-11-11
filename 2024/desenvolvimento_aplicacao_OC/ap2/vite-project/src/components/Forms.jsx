import React, { useState } from 'react';
import { Button } from "./Button";

export function Forms({ addCard }) {
    const [formValues, setFormValues] = useState({
        name: '',
        phone: '',
        egresso: '',
        paid: '',
        image: '',
    });

    const handleChange = (e) => {
        const { name, value } = e.target;
        setFormValues((prevValues) => ({
            ...prevValues,
            [name]: value, 
        }));
    };

    const handleSubmit = (e) => {
        e.preventDefault(); 

        const newCard = {
            image: formValues.image,
            name: formValues.name,
            category: (formValues.egresso === "sim") ? "Egresso/Convidado" : "Estudante",
            status: (formValues.paid === "sim") ? "Confirmado" : "Não Confirmado" ,
        };

        addCard(newCard); 

        setFormValues({
            name: '',
            phone: '',
            egresso: '',
            paid: '',
            image: '',
        });
    };

    return (
        <div className="form-container">
            <form onSubmit={handleSubmit}>
                <label htmlFor="nome">Nome</label>
                <input
                    type="text"
                    id="nome"
                    name="name"
                    placeholder="Digite o nome"
                    value={formValues.name}
                    onChange={handleChange} 
                    required
                />

                <label htmlFor="phone">Telefone</label>
                <input
                    type="text"
                    id="phone"
                    name="phone" 
                    placeholder="Digite o phone"
                    value={formValues.phone}
                    onChange={handleChange} 
                    required
                />

                <label>Egresso/Convidado</label>
                <div className="radio-group">
                    <label>
                        <input
                            type="radio"
                            name="egresso"
                            value="sim"
                            checked={formValues.egresso === 'sim'}
                            onChange={handleChange} 
                            required
                        /> Sim
                    </label>
                    <label>
                        <input
                            type="radio"
                            name="egresso"
                            value="nao"
                            checked={formValues.egresso === 'nao'}
                            onChange={handleChange}
                            required
                        /> Não
                    </label>
                </div>

                <label>Pago</label>
                <div className="radio-group">
                    <label>
                        <input
                            type="radio"
                            name="paid"
                            value="sim"
                            checked={formValues.paid === 'sim'}
                            onChange={handleChange} 
                            required
                        /> Sim
                    </label>
                    <label>
                        <input
                            type="radio"
                            name="paid"
                            value="nao"
                            checked={formValues.paid === 'nao'}
                            onChange={handleChange}
                            required
                        /> Não
                    </label>
                </div>

                <label htmlFor="image">Foto</label>
                <input
                    type="text"
                    id="image"
                    name="image" 
                    placeholder="URL"
                    value={formValues.image}
                    onChange={handleChange} 
                    required
                />

                <Button name="Cadastrar" />
            </form>
        </div>
    );
}
