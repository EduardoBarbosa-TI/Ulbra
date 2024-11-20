import { NavLink } from "react-router-dom";
import "./Header.css";

function Header() {
    
  return (
    <header className="container">
      <div className="container-logo">LOGO</div>

      <nav>
        <ul className="container-nav">
          <li>
            <NavLink
              to={"/home"}
              className={({ isActive }) => (isActive ? "selected" : "")}
            >
              Home
            </NavLink>
          </li>
          <li>
            <NavLink
              to={"/produto/cadastrar"}
              className={({ isActive }) => isActive ? "selected" : ""}
            >
              Cadastrar Produto
            </NavLink>
          </li>
          <li>
            <NavLink
              to={"/sobre"}
              className={({ isActive }) => isActive ? "selected" : ""}
            >
              Sobre
            </NavLink>
          </li>
          <li>
            <NavLink
              to={"/produtos"}
              className={({ isActive }) => isActive ? "selected" : ""}
            >
              Produtos
            </NavLink>
          </li>
        </ul>
      </nav>
    </header>
  );
}

export default Header;
