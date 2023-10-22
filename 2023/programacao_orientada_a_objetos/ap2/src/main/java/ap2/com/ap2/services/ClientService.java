package ap2.com.ap2.services;

import ap2.com.ap2.model.ClientModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClientService {
    private ArrayList<ClientModel> clients = new ArrayList();
    public ArrayList<ClientModel> getAll(Integer age){
        ArrayList<ClientModel> queryClient = new ArrayList();
        if(age != null){
            for(int i = 0; i < this.clients.size();i++){
                if(this.clients.get(i).age() == age){
                    queryClient.add(this.clients.get(i));
                }
            }
            return queryClient;
        }
        return this.clients;
    }
    public ClientModel getById(int clientId){
        for(int i = 0; i < this.clients.size();i++){
            if(this.clients.get(i).id() == clientId){
                return this.clients.get(i);
            }
        }
        return null;
    }
    public String store(ClientModel clientData){
        this.clients.add(clientData);
        return "Cliente adicionado com sucesso!";
    }
    public String update(ClientModel clientData, int clientId){
        for(int i = 0; i < this.clients.size();i++){
            if(this.clients.get(i).id() == clientId){
                this.clients.set(i,clientData);
                break;
            }
        }
        return "Cliente atualizado com sucesso!";
    }
    public String delete(int clientId){
        for(int i = 0; i < this.clients.size();i++){
            if(this.clients.get(i).id() == clientId){
                this.clients.remove(i);
                break;
            }
        }
        return "Cliente removido com sucesso!";
    }
}
