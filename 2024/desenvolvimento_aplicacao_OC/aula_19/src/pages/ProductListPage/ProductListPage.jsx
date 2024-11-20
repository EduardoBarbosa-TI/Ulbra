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


    return <div id="div-list-products">
        <table>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Preço</th>
                <th>Descrição</th>
            </tr>

            {products.map(product => {
                return <tr>
                    <td>{product.id}</td>
                    <td>{product.name}</td>
                    <td>{product.price}</td>
                    <td>{product.description}</td>

                    <button
                        id="button-delete"
                        onClick={() => {
                            const isConfirmed = window.confirm("Você tem certeza que deseja excluir este produto?");
                            if (isConfirmed) {
                                deleteProduct(product.id);
                            }
                        }}
                    >
                        Deletar
                    </button>

                    <button id="button-edit" onClick={() => navigation(`/produtos/edit/${product.id}`)}>Editar</button>

                    <button id="button-view" onClick={() => navigation(`/produtos/${product.id}`)}>Visualizar</button>
                </tr>
            })}

        </table>
    </div>
}

export default ProductsListPage;