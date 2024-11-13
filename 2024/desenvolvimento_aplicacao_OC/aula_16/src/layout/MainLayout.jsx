import { Outlet } from "react-router-dom";
import Header from "../components/header/Header";
import "../App.css"

function MainLayout() {
    return <>
        <Header />
        <Outlet />
    </>
}

export default MainLayout