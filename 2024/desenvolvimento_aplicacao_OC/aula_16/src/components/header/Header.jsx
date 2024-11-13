import { NavLink } from "react-router-dom";
import "./Header.css";

function Header() {
  return (
    <>
      <header className="container">
        <div className="logo">LOGO</div>

        <nav className="navigation">
          <ul>
            <NavLink
              className={({ isActive }) => (isActive ? "qualquerCoisa" : "")}
              to={"/home"}
            >
              Home
            </NavLink>

            <NavLink
              className={({ isActive }) => (isActive ? "active" : "")}
              to={"/contato"}
            >
              Contato
            </NavLink>

            <NavLink
              className={({ isActive }) => (isActive ? "active" : "")}
              to={"/sobre"}
            >
              Sobre
            </NavLink>
          </ul>
        </nav>
      </header>
    </>
  );
}

export default Header;
