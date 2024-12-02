import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import './ProductListPage.css'

function ProductsListPage() {
    const urlApi = "http://localhost:3001/products"
    const [products, setProdutos] = useState([])
    const navigation = useNavigate()

    async function getAllProducts() {
        const response = await fetch(urlApi)
        const products = await response.json()

        setProdutos(products)
    }

    async function deleteProduct(id) {
        await fetch(`${urlApi}/${id}`, {
            method: "DELETE"
        })

        getAllProducts()

    }

    useEffect(() => {
        getAllProducts()
    }, [])


    return <div id="div-list-products" className="product-list">
        {products.map(product => (
            <div key={product.id} className="product-card">
                <div className="product-image-container">
                    <img
                        src={product.photo_url}
                        alt={product.name}
                        className="product-image"
                    />
                </div>
                <div className="product-details">
                    <h3 className="product-name">{product.name}</h3>
                    <p className="product-price">R$ {product.price}</p>
                    <p className="product-description">{product.description}</p>
                    <div className="product-actions">
                        <button
                            className="product-button edit"
                            onClick={() => navigation(`/produtos/edit/${product.id}`)}
                        >
                            Editar
                        </button>
                        <button
                            className="product-button view"
                            onClick={() => navigation(`/produtos/${product.id}`)}
                        >
                            Visualizar
                        </button>
                        <button
                            className="product-button delete"
                            onClick={() => {
                                const isConfirmed = window.confirm("Você tem certeza que deseja excluir este produto?");
                                if (isConfirmed) {
                                    deleteProduct(product.id);
                                }
                            }}
                        >
                            Deletar
                        </button>
                    </div>
                </div>
            </div>
        ))}
    </div>


}

export default ProductsListPage;