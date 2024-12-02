import { useEffect, useState } from "react";
import { useParams, useNavigate } from "react-router-dom";
import './ProductEditPage.css'

function ProductEditPage() {
    const parms = useParams()
    const urlApi = 'http://localhost:3001/products/';
    const [product, setProduct] = useState({})
    const navigation = useNavigate();

    async function editProduct(product) {
        await fetch(`${urlApi}${parms.id}`, {
            method: "PUT",
            body: JSON.stringify(product)
        })

        navigation('/produtos')
    }

    function handleSubmit(event) {
        event.preventDefault()
        const formData = new FormData(event.target)

        const product = {
            name: formData.get("name"), 
            price: formData.get("price"),
            description: formData.get("description"),
            photo_url: formData.get("photo_url"),
        }

        editProduct(product)
    }

    async function getProductById() {
        const response =
            await fetch(`${urlApi}${parms.id}`)
        const product = await response.json();
        setProduct(product)
    }

    useEffect(() => {
        getProductById()
    }, [])

    return <div id="div-edit-form">
    <form onSubmit={handleSubmit}>
        <h2>Editar Produto</h2>
        <input 
            name="name" 
            placeholder="Nome do Produto" 
            value={product.name} 
            onChange={(e) => setProduct({ ...product, name: e.target.value })}
        />
        <input 
            name="price" 
            placeholder="Preço (Ex: 199.99)" 
            value={product.price} 
            onChange={(e) => setProduct({ ...product, price: e.target.value })}
        />
        <textarea 
            name="description" 
            placeholder="Descrição do Produto" 
            value={product.description} 
            onChange={(e) => setProduct({ ...product, description: e.target.value })}
        ></textarea>
        <input 
            name="photo_url" 
            placeholder="URL da Foto" 
            value={product.photo_url} 
            onChange={(e) => setProduct({ ...product, photo_url: e.target.value })}
        />
        <button type="submit">Salvar Alterações</button>
    </form>
</div>


}

export default ProductEditPage;