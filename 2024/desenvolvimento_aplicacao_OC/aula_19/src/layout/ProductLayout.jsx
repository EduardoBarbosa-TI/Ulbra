import { Outlet } from "react-router-dom";

function ProductLayout() {
    return (
        <>
            <h1>PRINCIPAL DO PRODUTO</h1>
            <Outlet />
            <h1>footer PRODUTO</h1>
        </>
    )
}

export default ProductLayout;