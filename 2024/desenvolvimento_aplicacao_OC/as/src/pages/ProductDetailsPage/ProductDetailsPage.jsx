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
        <img src={product.photo_url} alt={`Imagem de ${product.name}`} />
        <div className="details-content">
            <h1>{product.name}</h1>
            <p className="price">Preço: <span>R$ {product.price}</span></p>
            <p className="description">Descrição:</p>
            <p>{product.description}</p>
        </div>
    </div>
}

export default ProductDetailsPage;