import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import './ProductDetailsPage.css'

function ProductDetailsPage() {
    const parms = useParams()
    const [product, setProduct] = useState({})

    async function getProductById() {
        const response =
            await fetch(`http://localhost:3001/products/${parms.id}`)
        const product = await response.json();
        setProduct(product)
    }

    useEffect(() => {
        getProductById()
    }, [])

    return <div id="div-details">
        <h1>Nome: {product.name}</h1>
        <h1>Preco: {product.price}</h1>
        <h1>Descricao: {product.description}</h1>
        <img src={product.photo_url} />
    </div>
}

export default ProductDetailsPage;