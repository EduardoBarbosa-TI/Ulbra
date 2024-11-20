import { useState } from "react";
import { json, useNavigate } from "react-router-dom";
import './ProductCreationPage.css'

function ProductCreation() {
    const navigation = useNavigate()

    async function saveProduct(product) {
        await fetch("http://localhost:3001/products", {
            method: "POST",
            body: JSON.stringify(product)
        })

        navigation("/produtos")
    }

    function handleSubmit(event) {
        event.preventDefault()
        const formData = new FormData(event.target)

        const produto = {
            name: formData.get("name"), 
            price: formData.get("price"),
            description: formData.get("description"),
            photo_url: formData.get("photo_url"),
        }

        saveProduct(produto)
    }


    return <>
        <div id="div-form">
            <form onSubmit={handleSubmit}>
                <input name="name" placeholder="Nome"/>
                <input name="price" placeholder="Preço" />
                <input name="description" placeholder="Description" />
                <input name="photo_url" placeholder="Foto" />

                <button type="submit">Cadastrar</button>
            </form>
        </div>
    </>
}

export default ProductCreation;