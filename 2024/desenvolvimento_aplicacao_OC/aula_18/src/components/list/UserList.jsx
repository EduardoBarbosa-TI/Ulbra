import { data } from "../../mock/data";
import './UserList.css';

function UserList() {
    return <>
        <div id="user-list-div">
            <h3>Lista de Usuários</h3>

            <table>
                <tr>
                    <th>Nome</th>
                    <th>Telefone</th>
                    <th>Endereço</th>
                </tr>

                {data.map((data, index) => (
                    <tr>
                        <td>
                            {data.nome}
                        </td>
                        <td>
                            {data.telefone}
                        </td>
                        <td>
                            {data.endereco}
                        </td>
                    </tr>
                ))}

            </table>
        </div>
    </>
}

export default UserList;