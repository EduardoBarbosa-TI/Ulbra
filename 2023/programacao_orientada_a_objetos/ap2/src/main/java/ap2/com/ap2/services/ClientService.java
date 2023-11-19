package ap2.com.ap2.services;

import ap2.com.ap2.entities.Client;
import ap2.com.ap2.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ClientService {
    private ClientRepository clientRepository;
    @Autowired
    public ClientService(ClientRepository clientRepository){this.clientRepository = clientRepository;}
    public List<Client> getAll(Integer age){
        return this.clientRepository.findAll();
    }
    public Optional<Client> getById(int clientId){
        return this.clientRepository.findById(clientId);
    }
    public Client store(Client clientData){
      return this.clientRepository.save(clientData);
    }
    public Client update(Client clientData){
        return this.clientRepository.save(clientData);
    }
    public void delete(int clientId){
        this.clientRepository.deleteById(clientId);
    }
}
