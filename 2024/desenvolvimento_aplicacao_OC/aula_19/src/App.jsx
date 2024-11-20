import { BrowserRouter, Route, Routes } from "react-router-dom";
import "./App.css";
import HomePage from "./pages/HomePage/HomePage";
import Header from "./components/header/Header";
import ProductCreation from "./pages/ProductCreationPage/ProductCreationPage";
import ProductDetailsPage from "./pages/ProductDetailsPage/ProductDetailsPage";
import ProductsListPage from "./pages/ProductListPage/ProductListPage";
import AboutPage from "./pages/AboutPage";
import ProductEditPage from "./pages/ProductEditPage/ProductEditPage";

function App() {
  return (
    <BrowserRouter>
      <Header />

      <Routes>
        <Route index element={<HomePage />} />
        <Route path="/home" element={<HomePage />} />
        <Route path="/produto/cadastrar" element={<ProductCreation />} />
        <Route path="/sobre" element={<AboutPage />} />
        <Route path="/produtos" element={<ProductsListPage />} />
        <Route path="/produtos/:id" element={<ProductDetailsPage />} />
        <Route path="/produtos/edit/:id" element={<ProductEditPage />} />


        <Route path="*" element={<h1>404</h1>} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
