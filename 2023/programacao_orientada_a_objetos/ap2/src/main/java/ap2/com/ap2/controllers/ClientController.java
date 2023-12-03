package ap2.com.ap2.controllers;

import ap2.com.ap2.entities.Client;
import ap2.com.ap2.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/clients")
public class ClientController {
    private ClientService clientService;
    @Autowired
    public ClientController(ClientService userService){
        this.clientService = userService;
    }
    @GetMapping()
    public List<Client> getAll(@RequestParam(name = "age", required = false) Integer age){
        return this.clientService.getAll(age);
    }
    @GetMapping("/{id}")
    public Optional<Client> getById(@PathVariable int id){
        return this.clientService.getById(id);
    }
    @PostMapping
    public Client store(@RequestBody Client clientData){
        return this.clientService.store(clientData);
    }
    @PutMapping("/{id}")
    public Client update(@RequestBody Client clientData){
        return this.clientService.update(clientData);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.clientService.delete(id);
    }
}
