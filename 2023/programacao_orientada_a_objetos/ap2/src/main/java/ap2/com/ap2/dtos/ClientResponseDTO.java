package ap2.com.ap2.dtos;

import ap2.com.ap2.entities.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClientResponseDTO {
    private String name;
    private String job;
    private int age;

    public ClientResponseDTO convertToDto(Client client){
        return new ClientResponseDTO(client.getName(),client.getJob(), client.getAge());
    }


    public List<ClientResponseDTO> convertListToClientInDto(List<Client> clients){
        List<ClientResponseDTO> listDtoClients;

        for(int i = 0; i < clients.size(); i++){
            this.listDtoClients.add(new ClientResponseDTO(clients.get(i).getName(),clients.get(i).getJob(),clients.get(i).getAge()));
        }

        return listDtoClients;
}
