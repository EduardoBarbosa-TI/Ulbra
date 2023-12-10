package ap2.com.ap2.services;

import ap2.com.ap2.Exceptions.NotFoundClient;
import ap2.com.ap2.dtos.ClientResponseDTO;
import ap2.com.ap2.entities.Client;
import ap2.com.ap2.repository.ClientRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ClientService {
    private ClientRepository clientRepository;
    @Autowired
    public ClientService(ClientRepository clientRepository){this.clientRepository = clientRepository;}
    public List<ClientResponseDTO> getAll(Integer age){
        List<Client> listClients = this.clientRepository.findAll();
        if(listClients.isEmpty()) throw new NotFoundClient();
        ClientResponseDTO listClientsDto =  new ClientResponseDTO();
        return listClientsDto.convertListToClientInDto(listClients);
    }
    public ClientResponseDTO getById(int clientId){
        Optional<Client> client = this.clientRepository.findById(clientId);
        if(client.isEmpty()) throw new NotFoundClient();
        ClientResponseDTO clientDTO = new ClientResponseDTO();
        return clientDTO.convertToDto(client);
    }
    public String store(Client clientData){
      this.clientRepository.save(clientData);
      return "Cliente adicionado com sucesso!";
    }
    @Transactional
    public String update(Client clientData, int clientId){
        Optional<Client> client = this.clientRepository.findById(clientId);
        if(client.isEmpty()) throw new NotFoundClient();
        this.clientRepository.update(clientData.getName(), clientData.getAge(), clientData.getJob(),clientId);
        return "Cliente atualizado com sucesso!";
    }
    public String delete(int clientId){
        Optional<Client> client = this.clientRepository.findById(clientId);
        if(client.isEmpty()) throw new NotFoundClient();
        this.clientRepository.deleteById(clientId);
        return "Cliente deletado com sucesso!";
    }
}
